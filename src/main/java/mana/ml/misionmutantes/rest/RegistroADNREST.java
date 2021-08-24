package mana.ml.misionmutantes.rest;

import mana.ml.misionmutantes.Dto.DtoADN;
import mana.ml.misionmutantes.Dto.RespuestaResgistro;
import mana.ml.misionmutantes.model.Humanos;
import mana.ml.misionmutantes.model.HumanosADN;
import mana.ml.misionmutantes.service.HumanosADNService;
import mana.ml.misionmutantes.service.HumanosService;
import mana.ml.misionmutantes.utilities.Matriz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/registroadn")
public class RegistroADNREST {

    @Autowired
    private HumanosService humanosService;

    @Autowired
    private HumanosADNService humanosADNService;
    static private int filas = 7;

    @GetMapping
    private List<DtoADN> consultaResgistros(){
        List<DtoADN> lDtoADNS = new ArrayList<>();
        humanosADNService.findAll().stream().filter(hnAdn->hnAdn.getEstado().equals("CAP")).forEach(hnAdn -> {
            DtoADN dtoADN = new DtoADN();
            dtoADN.setAdn(matriz(hnAdn.getAdn()));
            dtoADN.setHumano(hnAdn.getHumano());
            dtoADN.setEstado(hnAdn.getEstado());
            dtoADN.setId(hnAdn.getId());
            lDtoADNS.add(dtoADN);

            Humanos humano = hnAdn.getHumano();
            List<Matriz> capPos = matriz(hnAdn.getAdn());
            if( isMutante(capPos,1) == true &&
                isMutante(capPos,10) == true &&
                isMutante(capPos,11) == true){
                    humano.setMutante(true);
            }
            humano.setEstado("ANALISIS_FINALIZADO");
            humanosService.save(humano);

            hnAdn.setEstado("ANALISIS_FINALIZADO");
            humanosADNService.save(hnAdn);

        });
        return lDtoADNS;
    }

    @PostMapping
    private RespuestaResgistro analisisByHumano(){
        RespuestaResgistro res = new RespuestaResgistro();
        Long nr = humanosService.findAll().stream().filter(hm->hm.getEstado().equals("CAP")).count();
        humanosService.findAll().stream().filter(hm->hm.getEstado().equals("CAP")).forEach(hm->{
            HumanosADN humanosADN = new HumanosADN();
            humanosADN.setHumano(hm);
            humanosADN.setEstado("CAP");
            humanosADN.setAdn(analisisHumano());
            humanosADNService.save(humanosADN);

            hm.setEstado("EN_ANALISIS");
            humanosService.save(hm);
        });
        res.setTotalResgistro(nr.intValue());
        res.setDescripcion("Operacion Exitosa");
        return res;
    }

    private String analisisHumano(){
        int n = filas*filas;
        String res = "";
        res +=  diagnosticoBaseNitrogenada(n);
        return res.substring(0, res.length()-1);
    }

    public static String diagnosticoBaseNitrogenada(int n) {
        Random random = new Random();
        String baseNitrogenada = "ATCG";
        if(n==0) {
            return "";
        }else {
            char letter = baseNitrogenada.charAt(random.nextInt(baseNitrogenada.length()));
            return Character.toString(letter)+","+diagnosticoBaseNitrogenada(n-1);
        }
    }

    public static List<Matriz> matriz(String adn){
        List<Matriz> lMatriz = new ArrayList<Matriz>();
        int val = 0;
        for(int x = 1; x<=filas; x++){
            for(int y = 1; y<=filas; y++){
                String pos = x+""+y;
                //lMatriz.add(new Matriz(Integer.parseInt(pos), adn.split(",")[val],x+"-"+y));
                lMatriz.add(new Matriz(Integer.parseInt(pos), adn.split(",")[val]));
                val++;
            }
        }
        return lMatriz;
    }

    public static boolean isMutante(List<Matriz> m, int orientacion){
        /**
         * 1 = Horizontal
         * 10 = Vertical
         * 11 = Oblicua
         */
        boolean res = false;
        for(Matriz vm: m){
            String valor = vm.getValor();
            int countTrue = 0;
            int pos = vm.getPos();
            for(int i = 1; i<4; i++){
                int proxPos = pos+(orientacion*i);
                int posExiste = (int) m.stream().filter(mt->mt.getPos() == proxPos && mt.getValor().equals(valor)).count();
                if (posExiste == 1){
                    countTrue++;
                }
            }
            if(countTrue == 3){
                res = true;
                break;
            }
        }
        return res;
    }
}

package mana.ml.misionmutantes.rest;

import mana.ml.misionmutantes.Dto.DtoMutante;
import mana.ml.misionmutantes.model.Mutante;
import mana.ml.misionmutantes.service.MutanteService;
import mana.ml.misionmutantes.utilities.Matriz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static mana.ml.misionmutantes.rest.RegistroADNREST.isMutante;

@RestController
@RequestMapping("/mutante")
public class MutanteREST {

    @Autowired
    private MutanteService mutanteService;

    static private int filas = 6;

    @PostMapping
    private ResponseEntity<Mutante> save(@RequestBody DtoMutante dtoMutante) {
        try {
            Mutante mutante = new Mutante();
            countFilas(dtoMutante);
            mutante.setAdnStr(dtoMutante.getArray().substring(0, dtoMutante.getArray().length()-1));
            List<Matriz> capPos = matriz(dtoMutante.getArrayStr().substring(0, dtoMutante.getArrayStr().length()-1));
            if(isMutante(capPos,1) == true &&
                    isMutante(capPos,10) == true &&
                        isMutante(capPos,11) == true){
                mutante.setMutante(true);
            } else {
                mutante.setMutante(false);
            }
            Mutante guard = mutanteService.save(mutante);
            return ResponseEntity.created(new URI("/mutante/ " + guard.isMutante())).body(guard);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    public void  countFilas(DtoMutante dtoMutante){
        for(int i=4; i<10; i++){
            if((i * i) == dtoMutante.strTotal().length()) {
                filas = i;
                break;
            }
        }
    }

    public static List<Matriz> matriz(String adn){
        List<Matriz> lMatriz = new ArrayList<Matriz>();
        int val = 0;
        for(int x = 1; x<=filas; x++){
            for(int y = 1; y<=filas; y++){
                String pos = x+""+y;
                lMatriz.add(new Matriz(Integer.parseInt(pos), adn.split(",")[val]));
                val++;
            }
        }
        return lMatriz;
    }

}

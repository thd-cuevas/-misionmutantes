package mana.ml.misionmutantes.rest;

import mana.ml.misionmutantes.model.Humanos;
import mana.ml.misionmutantes.service.HumanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/registroHumano")
public class RegistroHumanoREST {

    @Autowired
    private HumanosService humanosService;

    private int poblacionMaxima = 1000000;
    private int poblacionCaptura = 1000;

    private List<Integer> res = new ArrayList<>();
    private Random aleatorio = new Random(System.currentTimeMillis());

    private ResponseEntity<Humanos> saveHumanos(@RequestBody Humanos humano){
        try {
            Humanos humanoGuardado = humanosService.save(humano);
            return ResponseEntity.created(new URI("/humano/ "+humanoGuardado.getId())).body(humanoGuardado);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping
    private List<Integer> capturarHumanos(){
        int totalCaptura = aleatorio.nextInt(poblacionCaptura);
        int count = 1;
        for(int i = 0; i<totalCaptura; i++){
            int pbAletorio = aleatorio.nextInt(poblacionMaxima);
            Humanos humano = new Humanos();
            humano.setId(pbAletorio);
            humano.setEstado("CAP");
            humano.setMutante(false);
            ResponseEntity<Humanos> gr = saveHumanos(humano);
        }
        res.add(totalCaptura);
        return res;
    }

}

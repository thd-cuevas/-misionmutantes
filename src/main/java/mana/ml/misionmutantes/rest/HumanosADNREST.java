package mana.ml.misionmutantes.rest;

import mana.ml.misionmutantes.Dto.RespuestaResgistro;
import mana.ml.misionmutantes.model.Humanos;
import mana.ml.misionmutantes.model.HumanosADN;
import mana.ml.misionmutantes.service.HumanosADNService;
import mana.ml.misionmutantes.service.HumanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/humanosadn")
public class HumanosADNREST {

    @Autowired
    private HumanosADNService humanosADNService;

    private int filas = 4;

    @GetMapping
    private ResponseEntity<List<HumanosADN>> getAllHumanosADN(){
        return ResponseEntity.ok(humanosADNService.findAll());
    }

    @PostMapping
    private ResponseEntity<HumanosADN> saveADN(@RequestBody HumanosADN humanoADN){
        try {
            HumanosADN guardado = humanosADNService.save(humanoADN);
            return ResponseEntity.created(new URI("/humanoADN/ "+guardado.getId())).body(guardado);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}

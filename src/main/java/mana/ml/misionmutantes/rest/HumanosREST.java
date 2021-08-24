package mana.ml.misionmutantes.rest;

import mana.ml.misionmutantes.model.Humanos;
import mana.ml.misionmutantes.service.HumanosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/humanos")
public class HumanosREST {

    @Autowired
    private HumanosService humanosService;

    @PostMapping
    private ResponseEntity<Humanos> saveHumanos(@RequestBody Humanos humano){
        try {
            Humanos humanoGuardado = humanosService.save(humano);
            return ResponseEntity.created(new URI("/humano/ "+humanoGuardado.getId())).body(humanoGuardado);
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping
    private ResponseEntity<List<Humanos>> getAllHumanos(){
        return ResponseEntity.ok(humanosService.findAll());
    }

}

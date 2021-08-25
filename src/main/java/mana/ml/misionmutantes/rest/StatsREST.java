package mana.ml.misionmutantes.rest;

import mana.ml.misionmutantes.Dto.DtoStats;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsREST {

    @GetMapping
    public DtoStats stats(){
        DtoStats dtoStats = new DtoStats(40,100,0.4);
        return dtoStats;
    }

}

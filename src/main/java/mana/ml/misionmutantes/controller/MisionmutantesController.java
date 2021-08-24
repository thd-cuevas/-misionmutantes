package mana.ml.misionmutantes.controller;

import mana.ml.misionmutantes.service.HumanosADNService;
import mana.ml.misionmutantes.service.HumanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "misionmutantes")
public class MisionmutantesController {

    private final AtomicLong counter = new AtomicLong();
    private static String template = "Hello %s";

    @GetMapping
    public TestController testController(@RequestParam(value = "name", defaultValue = "world") String name){
        return new TestController(counter.incrementAndGet(), String.format(template,name));
    }

}

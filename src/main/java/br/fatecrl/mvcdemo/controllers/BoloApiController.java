package br.fatecrl.mvcdemo.controllers;


import br.fatecrl.mvcdemo.models.Bolo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bolo")
public class BoloApiController {

    public List<Bolo> bolos = new ArrayList<Bolo>();

    public BoloApiController() {
        bolos.add(new Bolo("doce", "chocolate", "morango"));
        bolos.add(new Bolo("salgado", "frango", "patê"));
        bolos.add(new Bolo("doce", "morango", "chocolate"));
    }

    @GetMapping
    public List<Bolo> getBolo() {

        return bolos;
    }
}

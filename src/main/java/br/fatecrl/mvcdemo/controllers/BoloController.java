package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Bolo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bolo")
public class BoloController {

    public List<Bolo> bolos = new ArrayList<Bolo>();

    public BoloController() {
        bolos.add(new Bolo("doce","chocolate","morango"));
        bolos.add(new Bolo("salgado","frango","patê"));
        bolos.add(new Bolo("doce","morango","chocolate"));
    }

    @GetMapping
    public String getBolo(Model model){

        model.addAttribute("bolos",bolos);
        return "bolos";
    }
}

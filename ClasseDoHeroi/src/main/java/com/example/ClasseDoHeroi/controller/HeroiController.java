package com.example.ClasseDoHeroi.controller;

import com.example.ClasseDoHeroi.model.Heroi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroi")
public class HeroiController {

    @GetMapping("/atacar")
    public String atacar(@RequestParam String nome, @RequestParam int idade, @RequestParam String tipo) {
        Heroi heroi = new Heroi(nome, idade, tipo);
        return heroi.atacar();
    }
}

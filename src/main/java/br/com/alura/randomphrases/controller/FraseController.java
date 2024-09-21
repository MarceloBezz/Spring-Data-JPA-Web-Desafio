package br.com.alura.randomphrases.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.alura.randomphrases.dto.FraseDTO;
import br.com.alura.randomphrases.model.Frase;
import br.com.alura.randomphrases.service.FraseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/series")
public class FraseController {
    
    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return service.obterFraseAleatoria();
    }
    
}

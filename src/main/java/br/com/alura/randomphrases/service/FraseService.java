package br.com.alura.randomphrases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.randomphrases.dto.FraseDTO;
import br.com.alura.randomphrases.model.Frase;
import br.com.alura.randomphrases.repository.FraseRepository;

@Service
public class FraseService {
    
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        return converterClasse(repository.obterFraseAleatoria());
    }

    private FraseDTO converterClasse(Frase frase) {
        return new FraseDTO(frase.getId(), frase.getFrase(),frase.getPersonagem(),frase.getTitulo(),frase.getPoster());
    }
}

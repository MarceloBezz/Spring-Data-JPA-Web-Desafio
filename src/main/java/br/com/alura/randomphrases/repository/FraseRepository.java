package br.com.alura.randomphrases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.randomphrases.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long>{
    
    @Query("SELECT f FROM Frase f ORDER BY RANDOM() LIMIT 1")
    Frase obterFraseAleatoria();
}

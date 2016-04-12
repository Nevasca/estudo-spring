package br.com.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudo.model.Exercicio;

@Repository("exercicioRepository")						
public interface ExercicioRepository extends JpaRepository<Exercicio, Long>{ //Classe e qual o campo do id		
	
}

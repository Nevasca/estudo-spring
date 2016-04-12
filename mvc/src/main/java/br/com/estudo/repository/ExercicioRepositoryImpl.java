package br.com.estudo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.estudo.model.Exercicio;

//Classe antiga, antes de utilizar Spring Data JPA
//@Repository("exercicioRepository")
public class ExercicioRepositoryImpl /*implements ExercicioRepository*/ {
	
	/*
	@PersistenceContext
	private EntityManager em;
	
	public Exercicio save(Exercicio exercicio) {
		
		em.persist(exercicio);
		em.flush();		
		return exercicio;
	}
	*/
}

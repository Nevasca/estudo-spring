package br.com.estudo.service;

import java.util.List;

import br.com.estudo.model.Activity;
import br.com.estudo.model.Exercicio;

public interface ExercicioService {

	List<Activity> findAllActivities();

	Exercicio save(Exercicio exercicio);

}
package br.com.estudo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudo.model.Activity;
import br.com.estudo.model.Exercicio;
import br.com.estudo.repository.ExercicioRepository;

@Service("exerciseService")
public class ExercicioServiceImpl implements ExercicioService {
	
	@Autowired
	private ExercicioRepository exercicioRepository;
	
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swing = new Activity();
		swing.setDesc("Swing");
		activities.add(swing);
		
		return activities;
	}
	
	@Transactional
	public Exercicio save(Exercicio exercicio) {		
		return exercicioRepository.save(exercicio);			
	}	
	
}

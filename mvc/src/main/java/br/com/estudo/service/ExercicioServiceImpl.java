package br.com.estudo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.estudo.model.Activity;

@Service("exerciseService")
public class ExercicioServiceImpl implements ExercicioService {
	
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
	
}

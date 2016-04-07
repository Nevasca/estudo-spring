package br.com.estudo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.estudo.model.Activity;
import br.com.estudo.model.Exercicio;
import br.com.estudo.service.ExercicioService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExercicioService exercicioService;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercicio") Exercicio exercicio) {
		
		System.out.println("exercicio: " + exercicio.getMinutes());
		
		//return "forward:addMoreMinutes.html"; //Permanece com a mesma request
//		return "redirect:addMoreMinutes.html"; //Fecha a request e cria uma nova
		return "addMinutes";
	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
				
		return exercicioService.findAllActivities();
	}
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercicio") Exercicio exercicio) {
//		
//		System.out.println("exercitando: " + exercicio.getMinutes());
//		
//		return "addMinutes";
//	}
}

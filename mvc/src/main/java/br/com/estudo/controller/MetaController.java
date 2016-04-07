package br.com.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.estudo.model.Meta;

@Controller
@SessionAttributes("goal")
public class MetaController {
	
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		
		Meta meta = new Meta();
		meta.setMinutes(10);
		model.addAttribute("goal", meta);
		
		return "addGoal";
	}
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Meta meta) {
		
		System.out.println("Minutes Updated: " + meta.getMinutes());
		
		return "redirect:addMinutes.html";
		
	}
	
}
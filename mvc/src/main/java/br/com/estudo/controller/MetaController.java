package br.com.estudo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.estudo.model.Meta;
import br.com.estudo.model.MetaReport;
import br.com.estudo.service.MetaService;

@Controller
@SessionAttributes("goal")
public class MetaController {
	
	@Autowired
	private MetaService metaService;
	
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model, HttpSession session) {
		
		Meta meta = (Meta)session.getAttribute("goal");
		
		if(meta == null) {
			meta = new Meta();
			meta.setMinutes(10);
		}				
		
		model.addAttribute("goal", meta);
		
		return "addGoal";
	}
	
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Meta meta) {
		
		System.out.println("Minutes Updated: " + meta.getMinutes());
		
		metaService.save(meta);
		
		return "redirect:addMinutes.html";
		
	}
	
	@RequestMapping(value="getGoals", method = RequestMethod.GET)
	public String getGoals(Model model) {
		
		List<Meta> metas = metaService.findAllMetas();
		model.addAttribute("metas", metas);		
		
		return "getGoals";
	}
	
	@RequestMapping(value = "getGoalReports", method = RequestMethod.GET)
	public String getGoalReports(Model model) {
		List<MetaReport> metaReports = metaService.findAllGoalReports();
		model.addAttribute("goalReports", metaReports);
		return "getGoalReports";
	}
	
}

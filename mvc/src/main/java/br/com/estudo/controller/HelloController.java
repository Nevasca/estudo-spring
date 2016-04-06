package br.com.estudo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/saudacao")
	public String sayHello(Model model) {
		
		model.addAttribute("saudacao", "Hello World");
		
		//Nome da pagina para ligar
		return "hello";
	}
}

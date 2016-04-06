package br.com.estudo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.estudo.service.ClienteService;
import br.com.estudo.service.ClienteServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ClienteService service = appContext.getBean("clienteService", ClienteService.class);
		
		System.out.println(service.findAll().get(0).getNome());
	}

}

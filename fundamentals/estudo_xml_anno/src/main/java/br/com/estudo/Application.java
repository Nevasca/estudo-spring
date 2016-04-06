package br.com.estudo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.estudo.service.ClienteService;

public class Application {

	public static void main(String[] args) {
		//ClienteService service = new ClienteServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClienteService service = appContext.getBean("clienteService", ClienteService.class);
		
		System.out.println(service.findAll().get(0).getNome());
	}

}

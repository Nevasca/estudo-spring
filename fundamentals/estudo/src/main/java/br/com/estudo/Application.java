package br.com.estudo;

import br.com.estudo.service.ClienteService;
import br.com.estudo.service.ClienteServiceImpl;

public class Application {

	public static void main(String[] args) {
		ClienteService service = new ClienteServiceImpl();
		
		System.out.println(service.findAll().get(0).getNome());
	}

}

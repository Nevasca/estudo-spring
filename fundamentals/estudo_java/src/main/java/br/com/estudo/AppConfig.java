package br.com.estudo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import br.com.estudo.service.ClienteService;
import br.com.estudo.service.ClienteServiceImpl;

@Configuration
@ComponentScan({"br.com.estudo"})
@PropertySource("app.properties") //Onde o arquivo de propriedades esta
public class AppConfig {
	
	//Para ler o arquivo de propriedades
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholverConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name = "clienteService")
	@Scope("singleton")
	public ClienteService getClienteService() {
		ClienteServiceImpl clienteService = new ClienteServiceImpl();
		//clienteService.setClienteRepository(getClienteRepository());
		return clienteService;
	}
	
//	
//	@Bean(name = "clienteRepository")
//	public ClienteRepository getClienteRepository() {
//		return new HibernateClienteRepositoryImpl();
//	}
	
}

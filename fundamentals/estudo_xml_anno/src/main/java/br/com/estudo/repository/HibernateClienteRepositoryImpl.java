package br.com.estudo.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import br.com.estudo.model.Cliente;

//Stereotype do repositorio, geralmente nomeado com o mesmo nome da interface, mas com a primeira letra minuscula
@Repository("clienteRepository")
public class HibernateClienteRepositoryImpl implements ClienteRepository {
	
	//Pega alguma propriedade do app.properties
	@Value("${algumaPropriedade}")
	private String algumValor;
	
	public List<Cliente> findAll() {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		//cliente.setNome("Bruno");
		cliente.setNome(algumValor);
		cliente.setSobrenome("Sanches");
		
		clientes.add(cliente);
		
		return clientes;
	}
	
}

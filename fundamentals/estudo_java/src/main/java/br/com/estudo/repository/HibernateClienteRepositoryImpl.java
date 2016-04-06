package br.com.estudo.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import br.com.estudo.model.Cliente;

@Repository("clienteRepository")
public class HibernateClienteRepositoryImpl implements ClienteRepository {
	
	@Value("${algumaPropriedade}")
	private String algumValor;
	
	public List<Cliente> findAll() {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Bruno " + algumValor);
		cliente.setSobrenome("Sanches");
		
		clientes.add(cliente);
		
		return clientes;
	}
	
}

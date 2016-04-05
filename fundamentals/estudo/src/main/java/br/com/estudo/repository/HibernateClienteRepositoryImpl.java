package br.com.estudo.repository;


import java.util.List;
import java.util.ArrayList;
import br.com.estudo.model.Cliente;

public class HibernateClienteRepositoryImpl implements ClienteRepository {
	
	public List<Cliente> findAll() {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Bruno");
		cliente.setSobrenome("Sanches");
		
		clientes.add(cliente);
		
		return clientes;
	}
	
}

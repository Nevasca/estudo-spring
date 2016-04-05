package br.com.estudo.service;

import java.util.List;

import br.com.estudo.model.Cliente;
import br.com.estudo.repository.ClienteRepository;
import br.com.estudo.repository.HibernateClienteRepositoryImpl;

public class ClienteServiceImpl implements ClienteService {
	
	private ClienteRepository clienteRepository = new HibernateClienteRepositoryImpl();
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}

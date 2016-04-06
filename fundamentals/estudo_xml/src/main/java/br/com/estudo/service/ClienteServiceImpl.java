package br.com.estudo.service;

import java.util.List;

import br.com.estudo.model.Cliente;
import br.com.estudo.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {
	
	private ClienteRepository clienteRepository;
	
//	
//	public ClienteServiceImpl(ClienteRepository clienteRepository) {
//		this.clienteRepository = clienteRepository;
//	}
	
	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}

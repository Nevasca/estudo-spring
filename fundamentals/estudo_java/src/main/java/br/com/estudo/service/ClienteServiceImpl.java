package br.com.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.estudo.model.Cliente;
import br.com.estudo.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void setClienteRepository(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}

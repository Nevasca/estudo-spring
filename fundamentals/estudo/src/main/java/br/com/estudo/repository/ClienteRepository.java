package br.com.estudo.repository;

import java.util.List;
import br.com.estudo.model.Cliente;

public interface ClienteRepository {

	List<Cliente> findAll();

}
package br.com.estudo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudo.model.Meta;
import br.com.estudo.repository.MetaRepository;

@Service("metaService")
public class MetaServiceImpl implements MetaService {
	
	@Autowired
	private MetaRepository metaRepository;
	
	@Transactional()
	public Meta save(Meta meta) {		
		return metaRepository.save(meta);		
	}

}

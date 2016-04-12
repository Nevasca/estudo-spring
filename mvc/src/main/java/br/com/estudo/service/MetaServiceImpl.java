package br.com.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudo.model.Meta;
import br.com.estudo.model.MetaReport;
import br.com.estudo.repository.MetaRepository;

@Service("metaService")
public class MetaServiceImpl implements MetaService {
	
	@Autowired
	private MetaRepository metaRepository;
	
	@Transactional()
	public Meta save(Meta meta) {		
		return metaRepository.save(meta);		
	}

	public List<Meta> findAllMetas() {		
		//return metaRepository.loadAll(); //Antes de usar Spring Data JPA
		return metaRepository.findAll();
	}

	public List<MetaReport> findAllGoalReports() {
		return metaRepository.findAllGoalReports();
	}

}

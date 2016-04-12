package br.com.estudo.service;

import java.util.List;

import br.com.estudo.model.Meta;
import br.com.estudo.model.MetaReport;

public interface MetaService {
	
	Meta save(Meta meta);

	List<Meta> findAllMetas();

	List<MetaReport> findAllGoalReports();
}

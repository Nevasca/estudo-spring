package br.com.estudo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.estudo.model.Meta;

@Repository("metaRepository")
public class MetaRepositoryImpl implements MetaRepository {
	
	@PersistenceContext
	private EntityManager em;
		
	public Meta save(Meta meta) {
				
		em.persist(meta);
		em.flush();
		return meta;
	}

}

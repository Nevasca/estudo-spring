package br.com.estudo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.estudo.model.Meta;
import br.com.estudo.model.MetaReport;

//Classe antiga, antes de utilizar Spring DATA JPA
//@Repository("metaRepository")
public class MetaRepositoryImpl /*implements MetaRepository*/ {
	
//	
//	@PersistenceContext
//	private EntityManager em;
//		
//	public Meta save(Meta meta) {
//		
//		if(meta.getId() == null) {
//			em.persist(meta); //Para salvar
//			em.flush(); //Efetua a operacao
//		}
//		else {
//			meta = em.merge(meta); //para dar update (nao precisa de flush)
//		}
//		
//		return meta;
//	}
//
//	public List<Meta> loadAll() {
//		
//		//Query query = em.createQuery("Select m from Meta m");
//		//List<Meta> metas = query.getResultList();
//		
//		TypedQuery<Meta> query = em.createNamedQuery(Meta.FIND_ALL_GOALS, Meta.class);		
//		return query.getResultList();
//	}
//
//	public List<MetaReport> findAllGoalReports() {
//		
////		Query query = em.createQuery("Select new br.com.estudo.model.MetaReport(m.minutes, e.minutes, e.activity) " +
////									"from Meta m, Exercicio e where m.id = e.meta.id");
//		TypedQuery<MetaReport> query = em.createNamedQuery(Meta.FIND_META_REPORTS, MetaReport.class);		
//		return query.getResultList();
//	}
//	

}

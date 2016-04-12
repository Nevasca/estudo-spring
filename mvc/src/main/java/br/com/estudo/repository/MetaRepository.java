package br.com.estudo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.estudo.model.Meta;
import br.com.estudo.model.MetaReport;

@Repository("metaRepository")
public interface MetaRepository extends JpaRepository<Meta, Long> {

	@Query("Select new br.com.estudo.model.MetaReport(m.minutes, e.minutes, e.activity) " +
			"from Meta m, Exercicio e where m.id = e.meta.id")
	List<MetaReport> findAllGoalReports();
}

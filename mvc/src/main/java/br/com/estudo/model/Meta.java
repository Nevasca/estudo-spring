package br.com.estudo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "meta")
//Antes de usar Spring Data JPA
//@NamedQueries({
//	@NamedQuery(name = Meta.FIND_META_REPORTS, query = "Select new br.com.estudo.model.MetaReport(m.minutes, e.minutes, e.activity) " +
//									"from Meta m, Exercicio e where m.id = e.meta.id"),
//	@NamedQuery(name = Meta.FIND_ALL_GOALS, query = "Select m from Meta m")
//})
public class Meta {
	
//	public static final String FIND_META_REPORTS = "findMetaReports";
//	public static final String FIND_ALL_GOALS = "findAllGoals";
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column(name = "MINUTES")
	private int minutes;
	
	//@OneToMany(mappedBy="meta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@OneToMany(mappedBy="meta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Exercicio> exercicios = new ArrayList<Exercicio>();
	
	public Long getId() {
		return id;
	}
	
	public int getMinutes() {
		return minutes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
	
	
	
}

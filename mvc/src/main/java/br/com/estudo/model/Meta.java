package br.com.estudo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meta")
public class Meta {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	@Column(name = "MINUTES")
	private int minutes;
		
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
	
}

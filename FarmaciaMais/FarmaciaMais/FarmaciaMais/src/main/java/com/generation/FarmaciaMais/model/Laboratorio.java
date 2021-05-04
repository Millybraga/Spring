package com.generation.FarmaciaMais.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity 
public class Laboratorio {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 1, max =20)
	private String condicao; //líquido ou comprimido
	
	@OneToMany(mappedBy = "laboratorio", cascade = CascadeType.ALL) 
	@JsonIgnoreProperties("laboratorio")
	private List<Remedios> remedios;
	
	
	
	//GET AND SET

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public List<Remedios> getRemedios() {
		return remedios;
	}

	public void setRemedios(List<Remedios> remedios) {
		this.remedios = remedios;
	}
	
	
}

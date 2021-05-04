package com.generation.FarmaciaMais.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table (name = "remedios")
public class Remedios {
	
	
	//ATRIBUTOS
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) // PRIMARY KEY
	private long id;
	
	@NotNull
	@Size (min = 1, max = 30)
	private String nome;
	
	@NotNull
	@Size (min = 1, max = 30)
	private String tipo;
	
	@ManyToOne
	@JsonIgnoreProperties("laboratorio")
	private Laboratorio laboratorio;
	

	
	//GETTERS AND SETTERS 
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	
	

}

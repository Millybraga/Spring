package com.generation.minhaLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Produto {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private long id;
	
	@NotNull
	@Size (min = 1, max = 30)
	private String jogo;
	
	@NotNull
	@Size (min = 1, max = 30)
	private String personagem;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private CategoriaUsuario categoriaUsuario;
	

	public CategoriaUsuario getCategoriaUsuario() {
		return categoriaUsuario;
	}

	public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
		this.categoriaUsuario = categoriaUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
	
	

}

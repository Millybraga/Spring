package com.generation.minhaLojaDeGames.model;

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
public class CategoriaUsuario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 1, max =20)
	private String nome; //nome de quem está jogando
	
	@NotNull
	@Size(min = 1, max =20)
	private String chances;
	
	@NotNull
	@Size(min = 1, max =20)
	private String poder;


	@OneToMany(mappedBy = "categoriaUsuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoriaUsuario")
	private List<Produto> produtos;


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


	public String getChances() {
		return chances;
	}


	public void setChances(String chances) {
		this.chances = chances;
	}


	public String getPoder() {
		return poder;
	}


	public void setPoder(String poder) {
		this.poder = poder;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
			
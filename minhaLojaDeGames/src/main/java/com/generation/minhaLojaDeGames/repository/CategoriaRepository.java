package com.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.minhaLojaDeGames.model.CategoriaUsuario;

public interface CategoriaRepository extends JpaRepository<CategoriaUsuario, Long>{

	public List<CategoriaUsuario> findAllByPoderContainingIgnoreCase(String poder);
}

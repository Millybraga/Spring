package com.generation.FarmaciaMais.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaciaMais.model.Laboratorio;



public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
	public List<Laboratorio>findAllByCondicaoContainingIgnoreCase(String condicao);
}

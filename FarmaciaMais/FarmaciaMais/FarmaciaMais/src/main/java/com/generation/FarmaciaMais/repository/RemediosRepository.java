package com.generation.FarmaciaMais.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaciaMais.model.Remedios;

public interface RemediosRepository extends JpaRepository<Remedios, Long> {

	public List<Remedios> findAllByTipoContainingIgnoreCase (String tipo);
	}


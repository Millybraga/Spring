package com.generation.FarmaciaMais.repository;


import java.util.List;

import com.generation.FarmaciaMais.model.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
	public List<Laboratorio> findAllByDescricaoContainingIgnoreCase(String condicao);

}

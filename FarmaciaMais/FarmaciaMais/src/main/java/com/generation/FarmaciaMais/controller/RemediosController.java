package com.generation.FarmaciaMais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.FarmaciaMais.model.Remedios;
import com.generation.FarmaciaMais.repository.RemediosRepository;

@RestController 
@CrossOrigin (origins = "*", allowedHeaders = "*")  
@RequestMapping("/remedios")
public class RemediosController {
	
	
	@Autowired  //para incluir a dependência - permitir que a camada de controller tenha acesso ao repository
	private RemediosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Remedios>> getAll() { // retornar um response entity em uma lista com os remedios
		return ResponseEntity.ok(repository.findAll()); // para apresentar que deu certo (OK) - findAll para buscar tudo
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Remedios> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build()); //encontrar pelo id/ retornar se deu deu certo ou não.
	}

	
	@GetMapping("/tipo/{tipo}")
	public ResponseEntity<List<Remedios>>getBytipo(@PathVariable String tipo){
		return ResponseEntity.ok(repository.findAllByTipoContainingIgnoreCase(tipo));
	}
	
	
	@PostMapping
	public ResponseEntity<Remedios> post (@RequestBody Remedios remedios){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(remedios));
	}
	
	@PutMapping 
	public ResponseEntity<Remedios> put (@RequestBody Remedios remedios){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(remedios));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id){
		//quando deletamos algo, não nos retorna nada. Por isso, usamos "void".
		repository.deleteById(id);
	}
	
	
	
	
}
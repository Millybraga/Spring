package com.helloObjAprendizagem.helloObjAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ola")
public class HelloController {


	@GetMapping
	public String ola() {
		return "Olá, Generation.\n"
				+ "Objetivos de aprendizagem: aprender mais sobre back-end, trabalhar com meu grupo no projeto integrador e evoluir no aprendizado.";
	}
	
}

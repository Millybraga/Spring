package com.helloworld1.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class Hello1Controller {

	@GetMapping
	public String hello() {
		return "Hello, Generation.\n"
				+ "A habilidade que utilizei para a atividade foi atenção aos detalhes e a mentalidade de persistência!";
	}
	
}

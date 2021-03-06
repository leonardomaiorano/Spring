package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/mentalidades")
	public String mentalidades() {
		return "Metalidade de persistência considerando que esta é a primeira vez em que tenho contato com Spring. Habilidade de Atenção ao Detalhes afim de aprender o básico para as próximas aulas.";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "O objetivo de aprendizagem é entender os conceitos de Spring e suas aplicações para que possa ser útil durante tasks do Projeto Integrador.";
	}
	
	
	
	
}

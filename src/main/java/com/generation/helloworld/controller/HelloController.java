package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<big><b>Hello World!</b></big>";
	}
	
	@GetMapping("/bsm")
	public String bsms() {
		return "<big><b>BSM's</b></br></big>"
				+ "Mentalidade de Crescimento</br>"
				+ "Persistência</br>"
				+ "Responsabilidade Pessoal</br>"
				+ "Orientação ao Futuro</br>"
				+ "Comunicação</br>"
				+ "Orientação ao Detalhe</br>"
				+ "Proatividade</br>"
				+ "Trabalho em Equipe</br>"
				+ "Gestão de Tempo</br>";
	}
	
	@GetMapping("/objetivo")
	public String objetivos() {
		return "<big><b>Objetivos de Aprendizagem</b></br></big>"
				+ "<b>Semana 6</b></br>"
				+ "1. Aprender Spring</br>"
				+ "2. Estudar mais sobre Bancos de Dados</br>"
				+ "3. Melhorar minha gestão de tempo</br>"
				+ "4. Tentar acompanhar o evento SprintAI900</br>"
				+ "5. Exercitar mais a comunicação</br>"
				+ "6. Exercitar mais a proatividade</br>";
	}
	
}
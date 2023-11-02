package com.katheprc.Prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.katheprc.Prueba1.model.prueba;

@Controller
@RequestMapping("/")
public class mainController {

	prueba pru = new prueba();

	@GetMapping("/") // localhost:8080/
	public String index() {

		pru.setId(2);
		pru.setNombre("holi");

		System.out.println(pru.getId());

		System.out.println(pru.getNombre());
		
		pru.toString();

		return "index.html";
	}

	@GetMapping("/hola") // localhost:8080/hola
	public String hola() {
		return "index1.html";
	}

	@GetMapping("/error")
	public String error() {
		return "error.html";
	}

	@GetMapping("/hola/hola")
	public String hola2() {
		return "index.html";
	}

}

package com.katheprc.TP1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.katheprc.TP1.entity.Profesor;
import com.katheprc.TP1.service.ProfesorService;

@Controller
@RequestMapping("/")
public class ProfesorController {

	@Autowired
	ProfesorService pSrv = new ProfesorService();
	
	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Profesor> listaProfes = pSrv.listar();
		
		model.addAttribute("listaProfes", listaProfes);
		
		return "listar.html";
	}
}

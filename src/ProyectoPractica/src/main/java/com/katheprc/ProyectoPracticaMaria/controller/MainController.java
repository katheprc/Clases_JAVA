package com.katheprc.ProyectoPracticaMaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.katheprc.ProyectoPracticaMaria.entity.Cargo;
import com.katheprc.ProyectoPracticaMaria.service.EmpleadoService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	EmpleadoService eSrv;

	@GetMapping("/")
	public String home(Model model) {

		model.addAttribute("listaEmpleados", eSrv.findTodos());

		return "index.html";
	}

	@PostMapping("/")
	public String guardar(@RequestParam("id") String id, @RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido, @RequestParam("email") String email,
			@RequestParam("usuario") String usuario, @RequestParam("password") String password,
			@RequestParam("cargo") String cargo, Model model) {

		if (cargo.equals("EMPLEADO")) {
			eSrv.guardarEmpleado(Integer.parseInt(id), nombre, apellido, Cargo.EMPLEADO, email, usuario, password);
		} else if (cargo.equals("CEO")) {
			eSrv.guardarEmpleado(Integer.parseInt(id), nombre, apellido, Cargo.CEO, email, usuario, password);
		} else if (cargo.equals("JEFE")) {
			eSrv.guardarEmpleado(Integer.parseInt(id), nombre, apellido, Cargo.JEFE, email, usuario, password);
		}

		model.addAttribute("listaEmpleados", eSrv.findTodos());

		return "index.html";
	}

	@PostMapping("/registroeliminado")
	public String eliminar(@RequestParam("id") String id, Model model) {

		eSrv.eliminarEmpleado(Integer.parseInt(id));

		model.addAttribute("listaEmpleados", eSrv.findTodos());

		return "index.html";

	}

}

package com.katheprc.ProyectoPracticaMaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.katheprc.ProyectoPracticaMaria.entity.Empleado;
import com.katheprc.ProyectoPracticaMaria.service.EmpleadoService;

@RestController
public class RestMainController {

	@Autowired
	private EmpleadoService eSrv;

	@GetMapping("/")
	public List<Empleado> api() {
		return eSrv.findTodos();
	}
	
	
	@PostMapping("/")
	public String guardarNuevo(@RequestBody Empleado empleado) {
		eSrv.guardarEmpleado(-1, empleado.getNombre(), empleado.getApellido(), empleado.getCargo(), empleado.getEmail(),
				empleado.getUsuario(), empleado.getPassword());
		return "Empleado creado";
	}

	@GetMapping("/{id}")
	public Empleado getEmpleado(@PathVariable("id") Integer id) {
		return eSrv.findEmpleado(id);
	}

	@PostMapping("/{id}")
	public Empleado getEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado empleado) {

		eSrv.guardarEmpleado(id, empleado.getNombre(), empleado.getApellido(), empleado.getCargo(), empleado.getEmail(),
				empleado.getUsuario(), empleado.getPassword());
		return eSrv.findEmpleado(id);
	}

	@DeleteMapping("/{id}")
	public String DelEmpleado(@PathVariable("id") Integer id) {
		eSrv.eliminarEmpleado(id);
		return "Empleado eliminado";
	}

	// CONTROLLER CON HTML

//	@PostMapping("/")
//	public String guardar(@RequestParam("id") String id, @RequestParam("nombre") String nombre,
//			@RequestParam("apellido") String apellido, @RequestParam("email") String email,
//			@RequestParam("usuario") String usuario, @RequestParam("password") String password,
//			@RequestParam("cargo") String cargo, Model model) {
//
//		if (cargo.equals("EMPLEADO")) {
//			eSrv.guardarEmpleado(Integer.parseInt(id), nombre, apellido, Cargo.EMPLEADO, email, usuario, password);
//		} else if (cargo.equals("CEO")) {
//			eSrv.guardarEmpleado(Integer.parseInt(id), nombre, apellido, Cargo.CEO, email, usuario, password);
//		} else if (cargo.equals("JEFE")) {
//			eSrv.guardarEmpleado(Integer.parseInt(id), nombre, apellido, Cargo.JEFE, email, usuario, password);
//		}
//
//		model.addAttribute("listaEmpleados", eSrv.findTodos());
//
//		return "index.html";
//	}
//
//	@PostMapping("/registroeliminado")
//	public String eliminar(@RequestParam("id") String id, Model model) {
//
//		eSrv.eliminarEmpleado(Integer.parseInt(id));
//
//		model.addAttribute("listaEmpleados", eSrv.findTodos());
//
//		return "index.html";
//
//	}

}

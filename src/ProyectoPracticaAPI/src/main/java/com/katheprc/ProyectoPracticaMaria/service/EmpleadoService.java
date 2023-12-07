package com.katheprc.ProyectoPracticaMaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.katheprc.ProyectoPracticaMaria.entity.Cargo;
import com.katheprc.ProyectoPracticaMaria.entity.Empleado;
import com.katheprc.ProyectoPracticaMaria.entity.Rol;
import com.katheprc.ProyectoPracticaMaria.repository.EmpleadoRepo;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoRepo eRepo;

	public Empleado findEmpleado(Integer id) {
		return eRepo.findById(id).get();
	}

	public List<Empleado> findTodos() {
		return eRepo.findAll();
	}

	@Transactional
	public void guardarEmpleado(int id, String nombre, String apellido, Cargo cargo, String email, String usuario,
			String password) {

		if (id == -1) {
			Empleado emp = new Empleado();
			emp.setNombre(nombre);
			emp.setApellido(apellido);
			emp.setCargo(cargo);
			emp.setEmail(email);
			emp.setUsuario(usuario);
			emp.setPassword(password);
			if (cargo.equals(Cargo.EMPLEADO)) {
				emp.setPermiso(Rol.USER);
			} else {
				emp.setPermiso(Rol.ADMIN);
			}
			eRepo.save(emp);
		} else {
			Empleado emp = eRepo.findById(id).get();
			emp.setNombre(nombre);
			emp.setApellido(apellido);
			emp.setCargo(cargo);
			emp.setEmail(email);
			emp.setUsuario(usuario);
			emp.setPassword(password);
			if (cargo.equals(Cargo.EMPLEADO)) {
				emp.setPermiso(Rol.USER);
			} else {
				emp.setPermiso(Rol.ADMIN);
			}
			eRepo.save(emp);
		}

	}

	@Transactional
	public void eliminarEmpleado(int id) {
		eRepo.deleteById(id);
	}
	
}

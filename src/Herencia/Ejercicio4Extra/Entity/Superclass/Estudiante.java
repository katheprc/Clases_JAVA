package Herencia.Ejercicio4Extra.Entity.Superclass;

import Herencia.Ejercicio4Extra.Entity.SuperSuperclass.Persona;

public class Estudiante extends Persona {

	private String curso;
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(String curso, String nombre, String apellido, String id, String estCivil) {
		super(nombre, apellido, id, estCivil);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public boolean setCurso(String curso) {
		
		switch (curso) {

			case "MATEMATICA":
			case "LENGUAJE":
			case "ARQUITECTURA":
			case "PROGRAMACION":
			case "ARTE":
				this.curso = curso;
				return true;

			default:
				System.out.println("Error");
				return false;

		}
	}

	@Override
	public String toString() {
		return "Estudiante [curso=" + curso + ", nombre=" + nombre + ", apellido=" + apellido + ", id=" + id
				+ ", estCivil=" + estCivil + "]";
	}

}

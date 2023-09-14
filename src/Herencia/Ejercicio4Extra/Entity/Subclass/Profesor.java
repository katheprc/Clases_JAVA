package Relaciones.Ejercicio4Extra.Entity.Subclass;

import Relaciones.Ejercicio4Extra.Entity.Superclass.Empleado;

public class Profesor extends Empleado {

	private String depa;
	
	public Profesor() {
		
	}

	public Profesor(String nombre, String apellido, String id, String estCivil, int numDespacho, int anoIncorporacion,
			String depa) {
		super(nombre, apellido, id, estCivil, numDespacho, anoIncorporacion);
		this.depa = depa;
	}

	public String getDepa() {
		return depa;
	}

	public boolean setDepa(String depa) {
		switch (depa) {

			case "MATEMATICA":
			case "LENGUAJE":
			case "ARQUITECTURA":
			case "PROGRAMACION":
			case "ARTE":
				this.depa = depa;
				return true;
	
			default:
				System.out.println("Error");
				return false;

		}
	}

	@Override
	public String toString() {
		return "Profesor [depa=" + depa + ", numDespacho=" + numDespacho + ", anoIncorporacion=" + anoIncorporacion
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estCivil=" + estCivil + "]";
	}
	
}

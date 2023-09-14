package Relaciones.Ejercicio4Extra.Entity.Subclass;

import Relaciones.Ejercicio4Extra.Entity.Superclass.Empleado;

public class PersonalServicio extends Empleado {

	private String seccion;
	
	public PersonalServicio() {
		
	}

	public PersonalServicio(String nombre, String apellido, String id, String estCivil, int numDespacho,
			int anoIncorporacion, String seccion) {
		super(nombre, apellido, id, estCivil, numDespacho, anoIncorporacion);
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public boolean setSeccion(String seccion) {
		
		switch (seccion) {

			case "BIBLIOTECA":
			case "DECANATO":
			case "SECRETARIA":
				this.seccion = seccion;
				return true;
	
			default:
				System.out.println("Error");
				return false;

		}
		
	}

	@Override
	public String toString() {
		return "PersonalServicio [seccion=" + seccion + ", numDespacho=" + numDespacho + ", anoIncorporacion="
				+ anoIncorporacion + ", nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estCivil="
				+ estCivil + "]";
	}
	
}

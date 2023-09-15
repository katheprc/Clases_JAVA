package Herencia.Ejercicio4Extra.Entity.Superclass;

import Herencia.Ejercicio4Extra.Entity.SuperSuperclass.Persona;

public abstract class Empleado extends Persona{

	protected int numDespacho, anoIncorporacion;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, String id, String estCivil, int numDespacho,
			int anoIncorporacion) {
		super(nombre, apellido, id, estCivil);
		this.numDespacho = numDespacho;
		this.anoIncorporacion = anoIncorporacion;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public boolean setNumDespacho(int numDespacho) {
		
		if(numDespacho <= 100 && numDespacho >= 1) {
			this.numDespacho = numDespacho;
			return true;
		} else {
			return false;
		}
		
	}

	public int getAnoIncorporacion() {
		return anoIncorporacion;
	}

	public void setAnoIncorporacion(int anoIncorporacion) {
		this.anoIncorporacion = anoIncorporacion;
	}

}

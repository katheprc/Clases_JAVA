package Herencia.EjercicioE3.Entity.Super;

import Herencia.EjercicioE3.Entity.SuperSuper.Alojamiento;

public class ExtraHotelero extends Alojamiento {

	protected boolean privado;
	protected int m2;
	
	
	public ExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, int m2) {
		super(nombre, direccion, localidad, gerente);
		this.privado = privado;
		this.m2 = m2;
	}

	public void setPrivado(boolean privado) {
		this.privado = privado;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}
	
}

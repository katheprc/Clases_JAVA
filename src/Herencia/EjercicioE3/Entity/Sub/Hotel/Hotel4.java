package Herencia.EjercicioE3.Entity.Sub.Hotel;

import Herencia.EjercicioE3.Entity.Super.Hotel;

public class Hotel4 extends Hotel{

	protected boolean gimnasio;
	protected String nombreResto;
	protected int capResto;
	
	public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantHab, int cantCamas,
			int cantPisos, double precioHab, boolean gimnasio, String nombreResto, int capResto) {
		super(nombre, direccion, localidad, gerente, cantHab, cantCamas, cantPisos, precioHab);
		this.gimnasio = gimnasio;
		this.nombreResto = nombreResto;
		this.capResto = capResto;
	}

	public boolean isGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(boolean gimnasio) {
		this.gimnasio = gimnasio;
	}

	public String getNombreResto() {
		return nombreResto;
	}

	public void setNombreResto(String nombreResto) {
		this.nombreResto = nombreResto;
	}

	public int getCapResto() {
		return capResto;
	}

	public void setCapResto(int capResto) {
		this.capResto = capResto;
	}	
	
}

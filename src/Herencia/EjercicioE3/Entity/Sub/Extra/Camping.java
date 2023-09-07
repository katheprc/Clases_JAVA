package Herencia.EjercicioE3.Entity.Sub.Extra;

import Herencia.EjercicioE3.Entity.Super.ExtraHotelero;

public class Camping extends ExtraHotelero{

	private int cantCarpas, cantBano;
	private boolean resto;
	
	public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, int m2,
			int cantCarpas, int cantBano, boolean resto) {
		super(nombre, direccion, localidad, gerente, privado, m2);
		this.cantCarpas = cantCarpas;
		this.cantBano = cantBano;
		this.resto = resto;
	}
	public int getCantCarpas() {
		return cantCarpas;
	}
	public void setCantCarpas(int cantCarpas) {
		this.cantCarpas = cantCarpas;
	}
	public int getCantBano() {
		return cantBano;
	}
	public void setCantBano(int cantBano) {
		this.cantBano = cantBano;
	}
	public boolean isResto() {
		return resto;
	}
	public void setResto(boolean resto) {
		this.resto = resto;
	}
	
}

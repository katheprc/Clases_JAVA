package Herencia.EjercicioE3.Entity.Sub.Extra;

import Herencia.EjercicioE3.Entity.Super.ExtraHotelero;

public class Residencia extends ExtraHotelero{

	private int cantHab;
	private boolean descuento, campoDeport;
	
	public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, int m2,
			int cantHab, boolean descuento, boolean campoDeport) {
		super(nombre, direccion, localidad, gerente, privado, m2);
		this.cantHab = cantHab;
		this.descuento = descuento;
		this.campoDeport = campoDeport;
	}

	public int getCantHab() {
		return cantHab;
	}

	public void setCantHab(int cantHab) {
		this.cantHab = cantHab;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	public boolean isCampoDeport() {
		return campoDeport;
	}

	public void setCampoDeport(boolean campoDeport) {
		this.campoDeport = campoDeport;
	}

	@Override
	public String toString() {
		return "Residencia [cantHab=" + cantHab + ", descuento=" + descuento + ", campoDeport=" + campoDeport
				+ ", privado=" + privado + ", m2=" + m2 + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", gerente=" + gerente + "]";
	}
	
	
	
}

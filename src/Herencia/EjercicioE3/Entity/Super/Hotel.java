package Herencia.EjercicioE3.Entity.Super;

import java.util.Comparator;

import Herencia.EjercicioE3.Entity.SuperSuper.Alojamiento;

public abstract class Hotel extends Alojamiento {

	protected int cantHab, cantCamas, cantPisos;
	protected double precioHab;
	
	public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHab, int cantCamas, int cantPisos, double precioHab) {
		super(nombre, direccion, localidad, gerente);
		this.cantHab = cantHab;
		this.cantCamas = cantCamas;
		this.cantPisos = cantPisos;
		this.precioHab = precioHab;
	}

	public void setCantHab(int cantHab) {
		this.cantHab = cantHab;
	}

	public void setCantCamas(int cantCamas) {
		this.cantCamas = cantCamas;
	}

	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public void setPrecioHab(double precioHab) {
		this.precioHab = precioHab;
	}
	
	
	public Double getPrecioHab() {
		return precioHab;
	}


	public static Comparator<Hotel> ordenarPrecioDesc = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getPrecioHab().compareTo(t.getPrecioHab());
        }            
    }; 
	
}

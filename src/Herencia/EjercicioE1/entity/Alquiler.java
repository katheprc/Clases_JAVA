package Herencia.EjercicioE1.entity;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import Herencia.EjercicioE1.entity.subclass.*;
import Herencia.EjercicioE1.entity.superclass.Barco;

public class Alquiler {

	private String nombre, dni;
	private Date fechaAlq = new Date(), fechaDev;
	private Barco barco;
	private int posAmarre, precioTotal, diasTotal;

	public Alquiler() {

	}

	public Alquiler(String nombre, String dni, Date fechaAlq, Date fechaDev, Barco barco, int posAmarre,
			int precioTotal, int diasTotal) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaAlq = fechaAlq;
		this.fechaDev = fechaDev;
		this.barco = barco;
		this.posAmarre = posAmarre;
		this.precioTotal = precioTotal;
		this.diasTotal = diasTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaAlq() {
		return fechaAlq;
	}

	public void setFechaAlq(Date fechaAlq) {
		this.fechaAlq = fechaAlq;
	}

	public Date getFechaDev() {
		return fechaDev;
	}

	@SuppressWarnings("deprecation")
	public void setFechaDev(int ano, int mes, int dia) {
		this.fechaDev = new Date(ano - 1900, mes - 1, dia);
		this.fechaDev.setHours(fechaAlq.getHours());
		this.fechaDev.setMinutes(fechaAlq.getMinutes());
		this.fechaDev.setSeconds(fechaAlq.getSeconds());
		getDiferenciaDias(this.fechaDev, this.fechaAlq);
	}

	public void getDiferenciaDias(Date d1, Date d2) {
		long dif = Math.abs(d1.getTime() - d2.getTime());
		this.diasTotal = (int) TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(String tipo, String matricula, int eslora, int anoFabricacion, int numMastiles,
			int potenciaEnCV, int numCamarotes) {

		if (tipo.equals("VELERO")) {
			this.barco = new Velero(matricula, eslora, anoFabricacion, numMastiles);
		} else if (tipo.equals("YATELUJO")) {
			this.barco = new YateLujo(matricula, eslora, anoFabricacion, potenciaEnCV, numCamarotes);
		} else {
			this.barco = new Motor(matricula, eslora, anoFabricacion, potenciaEnCV);
		}

	}

	public int getPosAmarre() {
		return posAmarre;
	}

	public void setPosAmarre(int posAmarre) {
		this.posAmarre = posAmarre;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getDiasTotal() {
		return diasTotal;
	}

	public void setDiasTotal(int diasTotal) {
		this.diasTotal = diasTotal;
	}

	public void calcularTotal() {

		if (this.barco instanceof Velero) {
			this.precioTotal = (this.diasTotal * ((barco.getEslora() * 10) + ((Velero) this.barco).getNumMastiles()));
		} else if (this.barco instanceof YateLujo) {
			this.precioTotal = (this.diasTotal * ((barco.getEslora() * 10) + ((YateLujo) this.barco).getNumCamarotes()
					+ ((YateLujo) this.barco).getPotenciaEnCV()));
		} else {
			this.precioTotal = (this.diasTotal * ((barco.getEslora() * 10) + ((Motor) this.barco).getPotenciaEnCV()));
		}

	}

	public void String() {

		if (this.barco instanceof Velero) {

			System.out.println("Alquiler [nombre=" + nombre + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev="
					+ fechaDev + ", barco=" + ((Velero) barco).toString() + ", posAmarre=" + posAmarre
					+ ", precioTotal=" + precioTotal + ", diasTotal=" + diasTotal + "]");

		} else if (this.barco instanceof YateLujo) {
			System.out.println("Alquiler [nombre=" + nombre + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev="
					+ fechaDev + ", barco=" + ((YateLujo) barco).toString() + ", posAmarre=" + posAmarre
					+ ", precioTotal=" + precioTotal + ", diasTotal=" + diasTotal + "]");
		} else {
			System.out.println("Alquiler [nombre=" + nombre + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev="
					+ fechaDev + ", barco=" + ((Motor) barco).toString() + ", posAmarre=" + posAmarre + ", precioTotal="
					+ precioTotal + ", diasTotal=" + diasTotal + "]");
		}

	}

}

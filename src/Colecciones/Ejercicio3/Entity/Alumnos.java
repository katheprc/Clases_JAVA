package Colecciones.Ejercicio3.Entity;

import java.util.ArrayList;

public class Alumnos {

	private String nombre;
	private ArrayList<Integer> notas;
	
	public Alumnos() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", notas=" + notas + "]";
	}
	
}

package Colecciones.EjercicioExtraExtra1.Entity;

import java.util.*;

public class Alumnos {
	
	private String nombre, apellido, nacionalidad;
	private int ano = -1, mes = -1, dia = -1;
	
	
	@SuppressWarnings("deprecation")
	private Date fechaNac = new Date(ano, mes, dia);
	private Date fechaActual = new Date();           //fecha de hoy
	
	public Alumnos() {
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	@SuppressWarnings("deprecation")
	public void setFechaNac(int dia2, int mes2, int ano2) {
		this.fechaNac.setDate(dia2);
		this.fechaNac.setMonth(mes2 - 1);
		this.fechaNac.setYear(ano2 - 1900);
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + 
			", fechaNac=" + fechaNac;
	}
	
    public static Comparator<Alumnos> ordenarApellidoDesc = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t1.getApellido().compareTo(t.getApellido());
        }            
    }; 
    
    public static Comparator<Alumnos> ordenarApellidoAsc = new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t.getApellido().compareTo(t1.getApellido());
        }            
    }; 
    
    
	
}

package Relaciones.Ejercicio2Extra.Entity;

public class Pelicula {
	
	String titulo, director, duracion;
	int edadMin;
	
	public Pelicula() {
	}
	
	public Pelicula(String titulo, String director, String duracion, int edadmin) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.edadMin = edadmin;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDuración() {
		return duracion;
	}

	public void setDuración(String duración) {
		this.duracion = duración + " MINUTOS";
	}

	public int getEdadMin() {
		return edadmin;
	}

	public void setEdadMin(int edadmin) {
		this.edadmin = edadmin;
	}
	
	
}

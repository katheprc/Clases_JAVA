package Colecciones.Ejercicio4.Entity;

import java.util.Comparator;

public class Pelicula {

	private String titulo, director;
	private Double duracion;
	
	public Pelicula() {
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

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + "]";
	}
	
    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }            
    };
    
    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }            
    };
    
    public static Comparator<Pelicula> ordenarPeliculasPorTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }            
    }; 
    
    public static Comparator<Pelicula> ordenarPeliculasPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }            
    }; 
     
}

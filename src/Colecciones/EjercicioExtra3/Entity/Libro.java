package Colecciones.EjercicioExtra3.Entity;

public class Libro {

	private String titulo, autor;
	private int numeroEjemplares, numeroPrestados = 0;
	
	public Libro() {
	}

	public Libro(String titulo, String autor, int numeroEjemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroEjemplares = numeroEjemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	public int getNumeroPrestados() {
		return numeroPrestados;
	}

	public void setNumeroPrestados(int numeroPrestados) {
		this.numeroPrestados = numeroPrestados;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares
				+ ", numeroPrestados=" + numeroPrestados + "]";
	}
	
}

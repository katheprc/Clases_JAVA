package Relaciones.Ejercicio2Extra.Entity;

public class Asiento {

	int fila;
	String columna;
	boolean ocupado = false;
	
	
	public Asiento(int fila, int columna) {
		
		this.fila = fila;
		
		switch(columna) {
		
		case 1: this.columna = "A"; break;
		case 2: this.columna = "B"; break;
		case 3: this.columna = "C"; break;
		case 4: this.columna = "D"; break;
		case 5: this.columna = "E"; break;
		case 6: this.columna = "F"; break;
		
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return(fila+columna);
	}
	
	
	
	
}

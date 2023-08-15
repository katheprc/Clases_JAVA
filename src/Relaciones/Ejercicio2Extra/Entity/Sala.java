package Relaciones.Ejercicio2Extra.Entity;

public class Sala {
	
	Asiento[][] sala = new Asiento[8][6];
			
	Pelicula pelicula;

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	public void crearSala() {
		
		for(int aux = 7; aux <= 0; aux--) {
			
			for(int aux2 = 0; aux2 < 6; aux++) {
				
				sala[aux][aux2] = crearAsiento(aux+1, aux2+1);
				
			}
			
		}
		
	}
	
	public Asiento crearAsiento(int fila, int columna) {
		
		Asiento asiento = new Asiento(fila, columna);
		
		return asiento;
	}
	
	public void mostrarSala() {
		
		for(int aux = 7; aux <= 0; aux--) {
			
			for(int aux2 = 0; aux2 < 6; aux++) {
				
				System.out.print(sala[aux][aux2].toString() + "| ");
				
			}
			
			System.out.println("");
			
		}
		
		
	}
	

}


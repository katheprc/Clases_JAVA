package Relaciones.Ejercicio2Extra.Entity;

import java.util.*;

public class Cine {

	ArrayList<Pelicula> listaPelis = new ArrayList<>();
	
	ArrayList<Sala> listaSalas = new ArrayList<>();
	
	Scanner leer = new Scanner(System.in);
	
	int precio = 1000;
	
	public int getPrecio() {
		
		return precio;
		
	}
	
	public Cine() {
		
		adicionarPeli();
		adicionarSala();
				
	}

	private void adicionarPeli() {
		
		Pelicula pelicula = new Pelicula("LA MONJA", "HARDY", "90", 13);
		
		for(Sala sala : listaSalas) {
			if(sala.getPelicula() == null) {
				sala.setPelicula(pelicula);
			}
		}
		
		Pelicula pelicula2 = new Pelicula("EL CONJURO", "WAN", "112", 16);
		
		for(Sala sala : listaSalas) {
			if(sala.getPelicula() == null) {
				sala.setPelicula(pelicula2);
			}
		}
		
		Pelicula pelicula3 = new Pelicula("ANNABELLE", "LEONETTI", "98", 18);
		
		for(Sala sala : listaSalas) {
			if(sala.getPelicula() == null) {
				sala.setPelicula(pelicula3);
			}
		}
		
		listaPelis.add(pelicula);
		listaPelis.add(pelicula2);
		listaPelis.add(pelicula3);
		
	}

	private void adicionarSala() {
		
		for(int i = 0; i < 3; i++) {
			
			listaSalas.add(crearSala());
			
		}
		
	}
	
	private Sala crearSala() {
		
		Sala sala = new Sala();
		
		sala.crearSala();
		
		return sala;
		
	}
	
	
	
}

package Colecciones.Ejercicio4.Service;

import Colecciones.Ejercicio4.Entity.Pelicula;
import java.util.*;

public class ServicePelicula {
	
	ArrayList<Pelicula> listaPelis = new ArrayList<>();
	Scanner leer = new Scanner(System.in);
	String opc;
	
	public void menu() {
		
		do {
			
			listaPelis.add(crearPelicula());
			
			do {
				
				System.out.println("'Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();
				if (opc.equals("S") || opc.equals("N")) {
					break;
				}
				
			}while(true);
			
		} while(opc.equals("S"));
		
		mostrarTodo();
		mostrarMayor1();
		ordenarDescendente();
		ordenarAscendente();
		ordenarTitulo();
		ordenarDirector();
		
	}
	
	public Pelicula crearPelicula() {
		
		Pelicula pelicula = new Pelicula();
		
		System.out.println("Ingresar titulo");
		pelicula.setTitulo(leer.nextLine());
		
		System.out.println("Ingresar director");
		pelicula.setDirector(leer.nextLine());
		
		System.out.println("Ingresar duración en horas");
		pelicula.setDuracion(leer.nextDouble()); leer.nextLine();
		
		return pelicula;
		
	}
	
	public void mostrarTodo() {
		
		System.out.println("---------------------------");
		System.out.println("Todas las peliculas");
		
		for (Pelicula pelicula : listaPelis) {
			System.out.println(pelicula.toString());
		}
		
	}
	
	public void mostrarMayor1() {
		
		System.out.println("---------------------------");
		System.out.println("Peliculas mayores a una hora: ");
		
		for (Pelicula pelicula : listaPelis) {
			if (pelicula.getDuracion()>1) {
				System.out.println(pelicula.toString());
			}
		}
		
	}
	
	public void ordenarDescendente() {
		
		Collections.sort(listaPelis, Pelicula.compararDuracionDescendente);
		
		System.out.println("---------------------------");
		System.out.println("Peliculas en orden descendente (duracion): ");
		
		for (Pelicula pelicula : listaPelis) {
			System.out.println(pelicula.toString());
		}
		
	}
	
	public void ordenarAscendente() {
		
		Collections.sort(listaPelis, Pelicula.compararDuracionAscendente);
		
		System.out.println("---------------------------");
		System.out.println("Peliculas en orden ascendente (duracion): ");
		
		for (Pelicula pelicula : listaPelis) {
			System.out.println(pelicula.toString());
		}
		
	}
	
	public void ordenarTitulo() {
		
		Collections.sort(listaPelis, Pelicula.ordenarPeliculasPorTitulo);
		
		System.out.println("---------------------------");
		System.out.println("Peliculas en orden alfabetico (titulo): ");
		
		for (Pelicula pelicula : listaPelis) {
			System.out.println(pelicula.toString());
		}
		
	}
	
	public void ordenarDirector() {
		
		Collections.sort(listaPelis, Pelicula.ordenarPeliculasPorDirector);
		
		System.out.println("---------------------------");
		System.out.println("Peliculas en orden alfabetico (Director): ");
		
		for (Pelicula pelicula : listaPelis) {
			System.out.println(pelicula.toString());
		}
	}
}

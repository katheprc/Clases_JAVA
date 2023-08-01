/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios*/

package Colecciones.EjercicioExtra2.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Colecciones.EjercicioExtra2.Entity.Cantante;

public class ServiceCantante {

	Scanner leer = new Scanner(System.in);
	
	public ArrayList<Cantante> menu(ArrayList<Cantante> listaCantantes2) {
		
		int opc = 0;
		
		do {
			
			System.out.println("");System.out.println("");System.out.println("");
			
			System.out.println("M E N U");
			System.out.println("1 - AGREGAR UN CANTANTE");
			System.out.println("2 - ELIMINAR UN CANTANTE");
			System.out.println("3 - MOSTRAR TODO");
			System.out.println("0 - SALIR");
			
			System.out.println("");System.out.println("");System.out.println("");
			
			System.out.println("INGRESE SU OPCIÓN: ");
			opc = leer.nextInt(); leer.nextLine();
			
			switch(opc) {
			case 1: listaCantantes2 = agregarCantante(listaCantantes2); break;
			case 2: listaCantantes2 = eliminarCantante(listaCantantes2); break;
			case 3: mostrar(listaCantantes2); break;
			case 0: break;
			}
			
		} while (opc != 0);
		
		
		return listaCantantes2;
	}
	
	public void mostrar(ArrayList<Cantante> listaCantantes) {
		
		for (Cantante cantante : listaCantantes) {
			
			System.out.println(cantante.toString());
			
		}
		
	}

	public ArrayList<Cantante> agregarCantante(ArrayList<Cantante> listaCantantes3) {
		
		System.out.println("Ingresar el nombre del cantante a agregar: ");
		String nombre = leer.nextLine();
		System.out.println("Ingresar el album del cantante " + nombre);
		String album = leer.nextLine();
		
		Cantante cantante = new Cantante(nombre, album);
		
		listaCantantes3.add(cantante);
		
		return listaCantantes3;
		
	}
	
	public ArrayList<Cantante> eliminarCantante(ArrayList<Cantante> listaCantantes3) {
		
		System.out.println("Ingresar el nombre del cantante a eliminar: ");
		String nombre = leer.nextLine();
		
		for (Cantante cantante : listaCantantes3) {
			
			if (cantante.getNombre().equals(nombre)) {
				listaCantantes3.remove(cantante);
				System.out.println("Cantante " + nombre + " eliminado con éxito");
				break;
			}
			
		}
		
		return listaCantantes3;
		
	}
	
}

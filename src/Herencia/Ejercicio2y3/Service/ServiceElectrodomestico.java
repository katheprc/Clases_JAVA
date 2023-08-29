package Herencia.Ejercicio2y3.Service;

import Herencia.Ejercicio2y3.Entity.superclass.*;
import Herencia.Ejercicio2y3.Entity.subclass.*;
import java.util.*;

public interface ServiceElectrodomestico {

	ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	public static void menu() {
		int opc;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("");
			System.out.println("1 - Alta Lavadora");
			System.out.println("2 - Alta Televisor");
			System.out.println("3 - Ver electrodomesticos dados de alta");
			System.out.println("4 - Ver suma de precios de todos los electrodomesticos dados de alta");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese opción");
			System.out.println("");

			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {

			case 1:
				altaLavadora();
				break;
			case 2:
				altaTele();
				break;
			case 3:
				verTodo();
				break;
			case 4:
				mostrarSuma();
				break;
			case 0:
				System.out.println("PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;

			}

		} while (opc != 0);
	}

	public static void altaLavadora() {
		
		Lavadora lavadora = new Lavadora();
		
		lavadora.crearLavadora();
		
		listaElectrodomesticos.add(lavadora);
		
	}
	
	public static void altaTele() {

		Televisor televisor = new Televisor();
		
		televisor.crearTelevisor();
		
		listaElectrodomesticos.add(televisor);
		
	}

	public static void verTodo() {
		
		for(Electrodomestico electro : listaElectrodomesticos) {
			
			if(electro instanceof Lavadora) {
				
//				Lavadora lavadora = (Lavadora) electro;
//				
//				System.out.println(lavadora.getCarga());
											
				System.out.println("- - - - - - - - - - - - - - -");
				
				((Lavadora) electro).stringLava();
				
			} else {
				
				System.out.println("- - - - - - - - - - - - - - -");
				
				((Televisor) electro).stringTele();
			}
			
		}
		
		
	}
	
	
	public static void mostrarSuma() {
		
		int suma = 0;
		
		for(Electrodomestico electro : listaElectrodomesticos) {
			
			suma += electro.getPrecio();
			
		}
		System.out.println("- - - - - - - - - - - - - - -");
		System.out.println("La suma total de todos los precios es: $" + suma);
		System.out.println("- - - - - - - - - - - - - - -");
		
		
	}






}

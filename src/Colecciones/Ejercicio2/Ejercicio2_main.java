package Colecciones.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2_main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		ArrayList<String> razas = new ArrayList<String>();
		
		String opc = "s";

		do {

			System.out.println("Ingrese una raza de perro: ");
			razas.add(leer.nextLine());

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("¿Continuar? (S/N)");
			opc = leer.nextLine();

			if (opc.equalsIgnoreCase("n")) {

				break;

			} else if (opc.equalsIgnoreCase("s")) {
				
				continue;
				
			} else {
				
				do {
					
					System.out.println("Ingrese una opcion correcta (S/N)");
					opc = leer.nextLine();
					
					if (opc.equalsIgnoreCase("n") || opc.equalsIgnoreCase("s")) {

						break;
					}
						
				} while (true);	
				
			}

		} while (opc.equalsIgnoreCase("s"));
		
		System.out.println("");System.out.println("");System.out.println("");
		
		System.out.println("Lista de razas: ");
//		razas.forEach(System.out::println);  
		for (String raza : razas) {
			
			System.out.println(raza);
			
		}
		
		System.out.println(""); System.out.println(""); System.out.println("");
		System.out.println("Ingrese una raza a eliminar");
		
		String buscar = leer.nextLine();
		
		int encontrado = 0;
		
		
		Iterator<String> ite = razas.iterator();
		
		while (ite.hasNext()) {                                             //HasNext devuelve true or false
			
			if (ite.next().equalsIgnoreCase(buscar)) {				//next Devuelve el dato guardado en el index donde se encuentra
				
				ite.remove();
				
				encontrado = 1;
				
			}
			
		}
		
		if (encontrado == 1) {
			
			System.out.println("RAZA ENCONTRADA Y ELIMINADA");
			Collections.sort(razas);
			
		} else {
			
			System.out.println("RAZA NO ENCONTRADA ");
			Collections.sort(razas);
		
		}
		
		System.out.println(""); System.out.println(""); System.out.println("");
			
		System.out.println("Lista de razas ordenada");
		
		for (String raza : razas) {
			
			System.out.println(raza);
			
		}
				
		leer.close();		
	
	}
		
}

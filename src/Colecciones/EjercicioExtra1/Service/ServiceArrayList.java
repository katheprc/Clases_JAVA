/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. 
La lectura de números termina cuando se
introduzca el valor -99. 
Este valor no se guarda en el ArrayList. 
A continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/

package Colecciones.EjercicioExtra1.Service;

import java.util.*;

public class ServiceArrayList {

	ArrayList<Integer> listaIntegers = new ArrayList<>();
	
	Scanner leer = new Scanner (System.in);
	
	public void menu() {
		
		int num;
		
		do {
			
			System.out.println("Ingresar números enteros. -99 para salir");
			
			num = leer.nextInt(); leer.nextLine();
			
			if (num != -99) {
				
				listaIntegers.add(num);
				
			} else {
				
				break;
				
			}
			
		} while (true);
		
		mostrar();
		suma();
		media();
		
	}
	
	public void mostrar() {
		
		System.out.println("");
		System.out.print("Lista de integers: ");
		
		for (Integer num : listaIntegers) {
			
			System.out.print(num + " ");
			
		}
		
		System.out.println("");
		
	}
	
	public void suma() {
		
		int suma = 0;
		
		for (Integer num : listaIntegers) {
			
			suma = suma + num;
			
		}
		
		System.out.println("Suma = " + suma);
		
	}
	
	public void media() {
		
		int suma = 0;
		
		for (Integer num : listaIntegers) {
			
			suma = suma + num;
			
		}
		
		System.out.println("Media = " + (suma / listaIntegers.size()));
		
	}
	
	
}

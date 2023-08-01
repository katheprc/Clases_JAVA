/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. 

El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/

package Colecciones.Ejercicio5.Service;

import java.util.*;

public class ServicePaises {

		Scanner leer = new Scanner(System.in);
		
		TreeSet<String> paises = new TreeSet<>();
	
	public void guardarPaises() {
		
		String opc, nombre;
		
		do {
			
			System.out.println("Ingrese el nombre de un país");
			nombre = leer.nextLine().toUpperCase();
			paises.add(nombre);
			
			System.out.println("");System.out.println("");System.out.println("");
			
            do {
            	
                System.out.println("¿Continuar ingresando? (S/N)");
                opc = leer.nextLine().toUpperCase();
                
                if (opc.equals("N") || opc.equals("S")) {
                    break;
                }
                
            } while (true);
			
		} while(opc.equals("S"));
		
		mostrarPaises();
		eliminarPaises();
		
	}
	
	public void mostrarPaises() {
	
		System.out.println(""); System.out.println(""); System.out.println("");
		
		for(String pais : paises) {
			
			System.out.println(pais);
			
		}
	
	}
	
	public void eliminarPaises() {
		
		System.out.println("");System.out.println(""); System.out.println("");
		
		System.out.println("Ingrese el nombrwe de un pais a eliminar: ");
		String nombre = leer.nextLine().toUpperCase();
		boolean encontrado = false;
		
		
		for(String pais : paises) {
			
			if (pais.equals(nombre)) {
				paises.remove(nombre);
				encontrado = true;
				System.out.println("El pais fue eliminado con éxito");
				break;
			}
			
		}
		
		System.out.println("");System.out.println(""); System.out.println("");
		
		if (!encontrado) {
			
			System.out.println("El pais no fue encontrado");
			
		}
		
		mostrarPaises();
		
	}
	
}



//true = true
//false = false
//!false = true
//!true = false
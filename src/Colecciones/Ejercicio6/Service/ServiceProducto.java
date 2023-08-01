/*. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. */

package Colecciones.Ejercicio6.Service;

import java.util.*;

import Colecciones.Ejercicio6.Entity.Producto;

public class ServiceProducto {

	Scanner leer = new Scanner(System.in);

	HashMap<String, Double> listaProductos = new HashMap<>();

	public void menu() {
		
		int opc;
		
		do {

			System.out.println("M E N U");
			System.out.println("1 - INGRESAR UN PRODUCTO");
			System.out.println("2 - MODIFICAR UN PRECIO");
			System.out.println("3 - ELIMINAR UN PRODUCTO");
			System.out.println("4 - MOSTRAR UN PRODUCTO");
			System.out.println("5 - MOSTRAR TODO");
			System.out.println("0 - SALIR");
			
			System.out.println("");System.out.println();
			
			System.out.println("Ingrese una opción");
			opc = leer.nextInt(); leer.nextLine();
			
			switch(opc) {
			
			case 1: rellenarLista(); break;
			case 2: modificarPrecio(); break;
			case 3: eliminarProducto(); break;
			case 4: mostrarProducto(); break;
			case 5: mostrarTodo(); break;
			case 0: break;
			default: System.out.println("ERROR: OPCIÓN NO VÁLIDA"); break;
			
			}
			
		} while (opc != 0);

	}
	
	public void rellenarLista() {
		
		String opc;
		
		do {
			
			Producto producto = new Producto();
			
			System.out.println("Ingrese el nombre del producto: ");
			producto.setNombre(leer.nextLine());
			
			System.out.println("Ingrese el precio del producto " + producto.getNombre());
			producto.setPrecio(leer.nextDouble()); leer.nextLine();
			
			listaProductos.put(producto.getNombre(), producto.getPrecio());
			                                    //llave                   dato
			do {

				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));
		
	}

	
	public void modificarPrecio() {

		System.out.println("Ingrese el nombre del producto a modificar");
		String nombre = leer.nextLine();
		
		listaProductos.remove(nombre);
		
		System.out.println("Ingrese el precio del producto a modificar");
		double precio = leer.nextDouble(); leer.nextLine();
		
		listaProductos.put(nombre, precio);
		
	}
	
	public void eliminarProducto() {
		
		System.out.println("Ingrese el nombre del producto que desea eliminar: ");
		String nombre = leer.nextLine();
		
		listaProductos.remove(nombre);
		
	}
	
	public void mostrarProducto() {
		
		System.out.println("Ingrese el nombre del producto a mostrar");
		String nombre = leer.nextLine();
			if (listaProductos.containsKey(nombre)) {
				System.out.println("Producto = " + nombre + listaProductos.get(nombre));  
			} else {
				System.out.println("El producto no existe");
			}
	}
	
	public void mostrarTodo() {

		for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
				
			System.out.println("Producto = " + producto.getKey() + " Precio = " + producto.getValue());
			
		}
		
	}
	
}






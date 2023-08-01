/*Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método toString para mostrar los datos de los libros.*/

package Colecciones.EjercicioExtra3.Service;

import java.util.*;
import Colecciones.EjercicioExtra3.Entity.*;

public class ServiceBiblioteca {

	Set<Libro> listaLibros = new HashSet<>();
	Scanner leer = new Scanner(System.in);

	public void menu() {

		int opc = 0;

		do {

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("M E N U");
			System.out.println("1 - INGRESAR UN LIBRO");
			System.out.println("2 - PRESTAR");
			System.out.println("3 - DEVOLVER");
			System.out.println("4 - MOSTRAR TODO");
			System.out.println("0 - SALIR");

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("INGRESE LA OPCIÓN DESEADA");
			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				ingresarLibro();
				break;
			case 2:
				prestar();
				break;
			case 3:
				devolver();
				break;
			case 4:
				mostrarTodo();
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no váilda");
				break;
			}

		} while (opc != 0);

	}

	public void ingresarLibro() {
		
		String opc;
		
		do {
			System.out.println("Ingrese título del libro");
			String titulo = leer.nextLine().toUpperCase();

			System.out.println("Ingrese autor del libro");
			String autor = leer.nextLine().toUpperCase();

			System.out.println("Ingrese número de ejemplares");
			int numEjemplares = leer.nextInt();
			leer.nextLine();

			Libro libro = new Libro(titulo, autor, numEjemplares);

			listaLibros.add(libro);

			do {

				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));

	}

	public void prestar() {

		System.out.println("Ingrese el titulo del libro");
		String titulo = leer.nextLine().toUpperCase();

		boolean encontrado = false;

		for (Libro libro : listaLibros) {

			if (libro.getTitulo().equals(titulo)) {

				encontrado = true;
				System.out.println("INFORMACIÓN DEL LIBRO" + libro.toString());
				System.out.println("");
				System.out.println("");
				System.out.println("");

				if (libro.getNumeroEjemplares() > 0) {

					System.out.println("Ingrese cantidad de ejemplares a prestar");
					int cantidad = leer.nextInt();
					leer.nextLine();

					if (cantidad <= libro.getNumeroEjemplares()) {

						libro.setNumeroEjemplares(libro.getNumeroEjemplares() - cantidad);
						libro.setNumeroPrestados(libro.getNumeroPrestados() + cantidad);

					} else {
						System.out.println("ERROR, NO HAY LA SUFICIENTE CANTIDAD REQUERIDA");
						System.out.println("LA CANTIDAD DISPONIBLE DEL LIBRO " + libro.getTitulo() + " es: "
								+ libro.getNumeroEjemplares());
					}

				} else {
					System.out.println("NO HAY EJEMPLARES DISPONIBLES");
					;
				}

			}

		}

		if (!encontrado) {
			System.out.println("Ese libro no existe en la biblioteca");
		}

	}

	public void devolver() {

		System.out.println("Ingrese el titulo del libro");
		String titulo = leer.nextLine().toUpperCase();

		boolean encontrado = false;

		for (Libro libro : listaLibros) {

			if (libro.getTitulo().equals(titulo)) {

				encontrado = true;
				System.out.println("INFORMACIÓN DEL LIBRO" + libro.toString());
				System.out.println("");
				System.out.println("");
				System.out.println("");

				if (libro.getNumeroPrestados() > 0) {

					System.out.println("Ingrese cantidad de ejemplares a devolver");
					int cantidad = leer.nextInt();
					leer.nextLine();

					if (cantidad <= libro.getNumeroPrestados()) {

						libro.setNumeroEjemplares(libro.getNumeroEjemplares() + cantidad);
						libro.setNumeroPrestados(libro.getNumeroPrestados() - cantidad);

					}
				}

			}

		}

		if (!encontrado) {
			System.out.println("Ese libro no existe en la biblioteca");
		}

	}

	public void mostrarTodo() {

		for (Libro libro : listaLibros) {

			System.out.println("INFORMACIÓN DEL LIBRO: " + libro.toString());
			System.out.println("");
			System.out.println("");
			System.out.println("");

		}

	}

}

/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/

package Relaciones.Ejercicio1Extra.Service;

import java.util.*;

import Relaciones.Ejercicio1Extra.Entity.*;

public interface ServiceAdopcion {

	ArrayList<Persona> listaPersonas = new ArrayList<>();
	ArrayList<Perro> listaPerros = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	public static void menu() {

		System.out.println(
				"Crear entidades: Ingrese la cantidad total de personas (se crearán la misma cantidad de perros)");

		int opc = leer.nextInt();
		leer.nextLine();

		for (int i = 1; i <= opc; i++) {

			crearPersona();

		}

		for (int i = 1; i <= opc; i++) {

			crearPerro();

		}

		String opc2;

		do {

			boolean encontrado = false;

			System.out.println("Indique el DNI de la eprsona que desea adoptar a un perro");
			String dni = leer.nextLine();

			for (Persona persona : listaPersonas) {

				if (dni.equals(persona.getDocumento())) {

					asignarPerro(persona);
					encontrado = true;
					break;

				}

			}

			if (!encontrado) {
				System.out.println("No se encuentra a la persona con el dni especificado");
			}

			do {
				System.out.println("¿Continuar asignando? S/N");
				opc2 = leer.nextLine().toUpperCase();
				if (opc2.equals("S") || opc2.equals("N")) {
					break;
				} else {
					System.out.println("Opción incorrecta. Intente nuevamente");
				}
			} while (true);

		} while (opc2.equals("S"));
		
		mostrar();

	}

	public static void crearPersona() {

		Persona persona = new Persona();

		System.out.println("Ingrese nombre de la persona");
		persona.setNombre(leer.nextLine().toUpperCase());

		System.out.println("Ingrese apellido de la persona");
		persona.setApellido(leer.nextLine().toUpperCase());

		System.out.println("Ingrese edad de la persona");
		persona.setEdad(leer.nextInt());
		leer.nextLine();

		System.out.println("Ingrese dni (solo numeros)");
		persona.setDocumento(leer.nextLine());

		listaPersonas.add(persona);

	}

	public static void crearPerro() {

		Perro perro = new Perro();

		System.out.println("Ingese nombre del perro");
		perro.setNombre(leer.nextLine().toUpperCase());

		System.out.println("Ingrese edad del perro");
		perro.setEdad(leer.nextInt());
		leer.nextLine();

		System.out.println("Ingrese raza de perro");
		perro.setRaza(leer.nextLine().toUpperCase());

		int tamano = 0;

		do {
			System.out.println("ingrese el tamano del perro (Pequeño = 1 / Mediano = 2 / Grande = 3)");
			tamano = leer.nextInt();
			leer.nextLine();

			switch (tamano) {
			case 1:
				perro.setTamano("PEQUEÑO");
				break;
			case 2:
				perro.setTamano("MEDIANO");
				break;
			case 3:
				perro.setTamano("GRANDE");
				break;
			default:
				System.out.println("ERROR: ingrese tamano nuevamente");
			}

		} while (tamano >= 4 || tamano <= 0);

		listaPerros.add(perro);

	}

	public static void asignarPerro(Persona persona) {

		boolean encontrado = false;

		if (persona.getPerro() == null) {
			do {
				System.out.println("Los perros disponibles son: ");
				for (Perro perro : listaPerros) {
					System.out.println(perro.toString());
				}

				System.out.println("Indique el nombre del perro para adoptar");
				String nombre = leer.nextLine().toUpperCase();

				for (Perro perro : listaPerros) {
					if (perro.getNombre().equals(nombre)) {
						persona.setPerro(perro);
						encontrado = true;
						listaPerros.remove(perro);
						System.out.println("PERRITO ADOPTADO!!");
						break;
					}
				}

				if (!encontrado) {
					System.out.println("Perro no existe o ya fue adoptado");
				} else {
					break;
				}
				
			}while (true);

		} else {
			System.out.println("Usted ya adoptó a un perro");
		}

	}

	public static void mostrar() {
		
		for(Persona persona : listaPersonas) {
			System.out.println(persona.toString());
			System.out.println("");
		}
		
		
		if(listaPerros != null) {
			System.out.println("Perritos no adoptados :(");
			for(Perro perro : listaPerros) {
				System.out.println(perro.toString());
			}
			
		}
		
	}
	
}

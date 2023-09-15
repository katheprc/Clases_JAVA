package Herencia.Ejercicio4Extra.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Herencia.Ejercicio4Extra.Entity.Superclass.*;
import Herencia.Ejercicio4Extra.Entity.SuperSuperclass.Persona;
import Herencia.Ejercicio4Extra.Entity.Subclass.*;

public interface ServiceFacultad {

	Scanner leer = new Scanner(System.in);
	ArrayList<Persona> listaPersonas = new ArrayList<>();

	public static void menu() {

		int opc = 0;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("1 - Alta persona");
			System.out.println("2 - Modificacion datos persona");
			System.out.println("3 - Baja persona");
			System.out.println("4 - Mostrar todo");
			System.out.println("0 - Salir");
			System.out.println(" - - - - - - - - - - - ");

			System.out.println("Ingrese una opción");

			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				altaPersona();
				break;
			case 2:
				modifPersona();
				break;
			case 3:
				bajaPersona();
				break;
			case 4:
				mostrar();
				break;
			case 0:
				break;
			default:
				System.out.println("Error, ingrese opcion nuevamente");
			}

		} while (opc != 0);

	}

	public static void altaPersona() {

		int opc = 0;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("1 - Estudiante");
			System.out.println("2 - Empleado");
			System.out.println("0 - Salir");
			System.out.println(" - - - - - - - - - - - ");

			System.out.println("Ingrese una opción");

			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				altaEstudiante();
				break;
			case 2:
				altaEmpleado();
				break;
			case 0:
				break;
			default:
				System.out.println("Error, ingrese opcion nuevamente");
			}

		} while (opc != 0);

	}

	public static void altaEstudiante() {

		Estudiante estudiante = new Estudiante();

		System.out.println("Ingrese el nombre");
		estudiante.setNombre(leer.nextLine());

		System.out.println("Ingrese el apellido");
		estudiante.setApellido(leer.nextLine());

		System.out.println("Ingrese la matricula");
		estudiante.setId(leer.nextLine());

		do {
			System.out.println("Ingrese estado civil (SOLTERO/CASADO/EN PAREJA)");
			String estadoCivil = leer.nextLine().toUpperCase();

			if (estudiante.setEstCivil(estadoCivil)) {
				break;
			} else {
				System.out.println("Error, ingrese nuevamente");
			}

		} while (true);

		do {
			System.out.println(
					"Ingrese el curso del estudiante (MATEMATICA, LENGUAJE, ARQUITECTURA, PROGRAMACION, ARTE)");
			String curso = leer.nextLine().toUpperCase();

			if (estudiante.setCurso(curso)) {
				break;
			} else {
				System.out.println("Error, ingrese nuevamente");
			}

		} while (true);

		listaPersonas.add(estudiante);

	}

	public static void altaEmpleado() {

		int opc = 0;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("1 - Personal de Servicio");
			System.out.println("2 - Profesor");
			System.out.println("0 - Salir");
			System.out.println(" - - - - - - - - - - - ");

			System.out.println("Ingrese una opción");

			opc = leer.nextInt();
			leer.nextLine();

			if (opc == 0) {
				break;
			}

			System.out.println("Ingrese el nombre");
			String nombre = leer.nextLine();

			System.out.println("Ingrese el apellido");
			String apellido = leer.nextLine();

			System.out.println("Ingrese la matricula");
			String id = leer.nextLine();

			System.out.println("Ingrese año de incorporacion");
			int ano = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:

				PersonalServicio pServicio = new PersonalServicio();

				pServicio.setNombre(nombre);
				pServicio.setApellido(apellido);
				pServicio.setId(id);
				pServicio.setAnoIncorporacion(ano);

				do {
					System.out.println("Ingrese estado civil (SOLTERO/CASADO/EN PAREJA)");
					String estadoCivil = leer.nextLine().toUpperCase();

					if (pServicio.setEstCivil(estadoCivil)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}

				} while (true);

				do {
					System.out.println("Ingrese numero de despacho (1 - 100)");
					int numDespacho = leer.nextInt();
					leer.nextLine();

					if (pServicio.setNumDespacho(numDespacho)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}

				} while (true);

				do {
					System.out.println("Ingrese sección (BIBLIOTECA, DECANATO, SECRETARIA)");
					String seccion = leer.nextLine().toUpperCase();

					if (pServicio.setSeccion(seccion)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}

				} while (true);

				listaPersonas.add(pServicio);

				break;
			case 2:
				Profesor profesor = new Profesor();

				profesor.setNombre(nombre);
				profesor.setApellido(apellido);
				profesor.setId(id);
				profesor.setAnoIncorporacion(ano);

				do {
					System.out.println("Ingrese estado civil (SOLTERO/CASADO/EN PAREJA)");
					String estadoCivil = leer.nextLine().toUpperCase();

					if (profesor.setEstCivil(estadoCivil)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}

				} while (true);

				do {
					System.out.println("Ingrese numero de despacho (1 - 100)");
					int numDespacho = leer.nextInt();
					leer.nextLine();

					if (profesor.setNumDespacho(numDespacho)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}

				} while (true);

				do {
					System.out.println("Ingrese sección (MATEMATICA, LENGUAJE, ARQUITECTURA, PROGRAMACION, ARTE)");
					String depa = leer.nextLine().toUpperCase();

					if (profesor.setDepa(depa)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}

				} while (true);

				listaPersonas.add(profesor);

				break;
			case 0:
				break;
			default:
				System.out.println("Error, ingrese opcion nuevamente");
			}

		} while (opc != 0);

	}

	public static void modifPersona() {

		System.out.println("Ingrese el ID de la persona a modificar: ");
		String id = leer.nextLine();

		for (Persona persona : listaPersonas) {

			if (persona.getId().equals(id)) {

				if (persona instanceof Estudiante) {

					int opc;

					do {
						System.out.println("Atributo a modificar");

						System.out.println("1 - Curso");
						System.out.println("2 - Nombre");
						System.out.println("3 - Apellido");
						System.out.println("4 - ID");
						System.out.println("5 - Estado Civil");
						System.out.println("0 - Salir");

						System.out.println("ingrese su opcion");
						opc = leer.nextInt();
						leer.nextLine();

						switch (opc) {
						case 1:
							System.out.println("Ingrese el nuevo curso");
							((Estudiante) persona).setCurso(leer.nextLine());
							break;
						case 2:
							modificacion(1, persona);
							break;
						case 3:
							modificacion(2, persona);
							break;
						case 4:
							modificacion(3, persona);
							break;
						case 5:
							modificacion(4, persona);
							break;
						case 0:
							break;
						default:
							System.out.println("Error, intente nuevamente");
						}
					} while (opc != 0);

				} else if (persona instanceof PersonalServicio) {

					int opc;

					do {
						System.out.println("Atributo a modificar");

						System.out.println("1 - Sección");
						System.out.println("2 - Nombre");
						System.out.println("3 - Apellido");
						System.out.println("4 - ID");
						System.out.println("5 - Estado Civil");
						System.out.println("6 - Año de incorporación");
						System.out.println("7 - Numero de despacho");
						System.out.println("0 - Salir");

						System.out.println("ingrese su opcion");
						opc = leer.nextInt();
						leer.nextLine();

						switch (opc) {
						case 1:
							System.out.println("Ingrese el nuevo curso");
							((PersonalServicio) persona).setSeccion(leer.nextLine());
							break;
						case 2:
							modificacion(1, persona);
							break;
						case 3:
							modificacion(2, persona);
							break;
						case 4:
							modificacion(3, persona);
							break;
						case 5:
							modificacion(4, persona);
							break;
						case 6:
							System.out.println("Ingrese el nuevo año de incorporacion");
							((PersonalServicio) persona).setAnoIncorporacion(leer.nextInt());
							leer.nextLine();
							break;

						case 7:
							System.out.println("Ingrese el nuevo numero de despacho");
							((PersonalServicio) persona).setNumDespacho(leer.nextInt());
							leer.nextLine();
							break;
						case 0:
							break;
						default:
							System.out.println("Error, intente nuevamente");
						}
					} while (opc != 0);

				} else if(persona instanceof Profesor) {
					
					int opc;

					do {
						System.out.println("Atributo a modificar");

						System.out.println("1 - Departamento");
						System.out.println("2 - Nombre");
						System.out.println("3 - Apellido");
						System.out.println("4 - ID");
						System.out.println("5 - Estado Civil");
						System.out.println("6 - Año de incorporación");
						System.out.println("7 - Numero de despacho");
						System.out.println("0 - Salir");

						System.out.println("ingrese su opcion");
						opc = leer.nextInt();
						leer.nextLine();

						switch (opc) {
						case 1:
							System.out.println("Ingrese el nuevo departamento");
							((Profesor) persona).setDepa(leer.nextLine());
							break;
						case 2:
							modificacion(1, persona);
							break;
						case 3:
							modificacion(2, persona);
							break;
						case 4:
							modificacion(3, persona);
							break;
						case 5:
							modificacion(4, persona);
							break;
						case 6:
							System.out.println("Ingrese el nuevo año de incorporacion");
							((Profesor) persona).setAnoIncorporacion(leer.nextInt());
							leer.nextLine();
							break;

						case 7:
							System.out.println("Ingrese el nuevo numero de despacho");
							((Profesor) persona).setNumDespacho(leer.nextInt());
							leer.nextLine();
							break;
						case 0:
							break;
						default:
							System.out.println("Error, intente nuevamente");
						}
					} while (opc != 0);
					
				}
			}

		}

	}

	public static Persona modificacion(int num, Persona persona) {

		switch (num) {
		case 1:
			System.out.println("Ingrese el nuevo nombre");
			persona.setNombre(leer.nextLine());
			break;
		case 2:
			System.out.println("Ingrese el nuevo apellido");
			persona.setApellido(leer.nextLine());
			break;
		case 3:
			System.out.println("Ingrese el nuevo ID");
			persona.setId(leer.nextLine());
			break;
		case 4:
			System.out.println("Ingrese el nuevo estado civil");
			persona.setEstCivil(leer.nextLine());
			break;
		}

		return persona;

	}

	public static void bajaPersona() {

		System.out.println("Ingrese el id de la persona ");
		String id = leer.nextLine();
		for (Persona persona : listaPersonas) {
			if (persona.getId().equals(id)) {
				System.out.println("Persona dada de baja exitosamente!");
				listaPersonas.remove(persona);
				break;
			}
		}
		
	}

	public static void mostrar() {

		System.out.println("E - S - T - U - D - I - A - N - T - E - S");
		
		for(Persona persona : listaPersonas) {
			if(persona instanceof Estudiante) {
				System.out.println(((Estudiante)persona).toString());
			}
		}
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("P R O F E S O R E S ");
		
		for(Persona persona : listaPersonas) {
			if(persona instanceof Profesor) {
				System.out.println(((Profesor)persona).toString());
			}
		}
		System.out.println("- - - - - - - - - - - - - - - - - -");
		
		System.out.println("P E R S O N A L - D E - S E R V I C I O");
		
		for(Persona persona : listaPersonas) {
			if(persona instanceof PersonalServicio) {
				System.out.println(((PersonalServicio)persona).toString());
			}
		}
		System.out.println("- - - - - - - - - - - - - - - - - -");

	}

}

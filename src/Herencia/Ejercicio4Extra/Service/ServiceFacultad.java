package Relaciones.Ejercicio4Extra.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Relaciones.Ejercicio4Extra.Entity.Superclass.Estudiante;
import Relaciones.Ejercicio4Extra.Entity.SuperSuperclass.Persona;
import Relaciones.Ejercicio4Extra.Entity.Subclass.*;

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

			opc = leer.nextInt(); leer.nextLine();
			
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

			opc = leer.nextInt(); leer.nextLine();
			
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
			
			if(estudiante.setEstCivil(estadoCivil)) {
				break;
			} else {
				System.out.println("Error, ingrese nuevamente");
			}	
			
		} while (true);
		
		do {
			System.out.println("Ingrese el curso del estudiante (MATEMATICA, LENGUAJE, ARQUITECTURA, PROGRAMACION, ARTE)");
			String curso = leer.nextLine().toUpperCase();
			
			if(estudiante.setCurso(curso)) {
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

			opc = leer.nextInt(); leer.nextLine();
			
			System.out.println("Ingrese el nombre");
			String nombre = leer.nextLine();

			System.out.println("Ingrese el apellido");
			String apellido = leer.nextLine();

			System.out.println("Ingrese la matricula");
			String id = leer.nextLine();
			
			System.out.println("Ingrese año de incorporacion");
			int ano = leer.nextInt(); leer.nextLine();

			
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
					
					if(pServicio.setEstCivil(estadoCivil)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}	
					
				} while (true);
				
				do {
					System.out.println("Ingrese numero de despacho (1 - 100)");
					int numDespacho = leer.nextInt(); leer.nextLine();
					
					if(pServicio.setNumDespacho(numDespacho)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}	
					
				} while (true);
				
				do {
					System.out.println("Ingrese sección (BIBLIOTECA, DECANATO, SECRETARIA)");
					String seccion = leer.nextLine().toUpperCase();
					
					if(pServicio.setSeccion(seccion)) {
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
					
					if(profesor.setEstCivil(estadoCivil)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}	
					
				} while (true);
				
				do {
					System.out.println("Ingrese numero de despacho (1 - 100)");
					int numDespacho = leer.nextInt(); leer.nextLine();
					
					if(profesor.setNumDespacho(numDespacho)) {
						break;
					} else {
						System.out.println("Error, ingrese nuevamente");
					}	
					
				} while (true);
				
				do {
					System.out.println("Ingrese sección (MATEMATICA, LENGUAJE, ARQUITECTURA, PROGRAMACION, ARTE)");
					String depa = leer.nextLine().toUpperCase();
					
					if(profesor.setDepa(depa)) {
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
		// TODO Auto-generated method stub

	}

	public static void bajaPersona() {
		// TODO Auto-generated method stub

	}

	public static void mostrar() {
		// TODO Auto-generated method stub

	}

}

package Herencia.EjercicioE3.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Herencia.EjercicioE3.Entity.Sub.Hotel.*;
import Herencia.EjercicioE3.Entity.SuperSuper.Alojamiento;

public interface ServiceAlojamientos {

	ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	public static void menu() {

		int opc;

		do {

			System.out.println("- - - M - E - N - U - - -");
			System.out.println("");
			System.out.println("1 - Crear alojamientos");
			System.out.println("2 - Ver TODOS los alojamientos");
			System.out.println("3 - Ver hoteles de caro a barato");
			System.out.println("4 - Ver campings con restaurant");
			System.out.println("5 - Ver residencias con descuento");
			System.out.println("0 - Salir");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese una opción");
			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				crearAlojamientos();
				break;
			case 2:
				verTodo();
				break;
			case 3:
				verHotelCaroBarato();
				break;
			case 4:
				verCampingResto();
				break;
			case 5:
				verResidenciasDescuento();
				break;
			case 0:
				break;
			default:
				System.out.println("Opción incorrecta");
			}

		} while (opc != 0);

	}

	public static void crearAlojamientos() {

		int opc;
		String nombre, direccion, localidad, gerente;

		do {

			System.out.println("- - - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("1 - Hotel");
			System.out.println("2 - ExtraHotelero");
			System.out.println("");
			System.out.println("- - - - - - - - - - - - - -");
			System.out.println("");
			System.out.println("Ingrese una opción");

			opc = leer.nextInt();
			leer.nextLine();

		} while (opc < 1 || opc > 2);

		System.out.println("Ingrese nombre del alojamiento");
		nombre = leer.nextLine();

		System.out.println("Ingrese dirección del alojamiento");
		direccion = leer.nextLine();

		System.out.println("Ingrese localidad del alojamiento");
		localidad = leer.nextLine();

		System.out.println("Ingrese nombre del gerente del alojamiento");
		gerente = leer.nextLine();

		switch (opc) {

		case 1:

			boolean gimnasio;
			String nombreResto;
			int capResto;

			do {

				System.out.println("- - - - - - - - - - - - - -");
				System.out.println("");
				System.out.println("1 - Hotel 4 estrellas");
				System.out.println("2 - Hotel 5 estrellas");
				System.out.println("");
				System.out.println("- - - - - - - - - - - - - -");
				System.out.println("");
				System.out.println("Ingrese una opción");

				opc = leer.nextInt();
				leer.nextLine();

			} while (opc < 1 || opc > 2);

			int cantHab, cantCamas, cantPisos;
			double precioHab;

			System.out.println("Ingrese cantidad de habitaciones");
			cantHab = leer.nextInt();
			leer.nextLine();

			System.out.println("Ingrese cantidad de camas");
			cantCamas = leer.nextInt();
			leer.nextLine();

			System.out.println("Ingrese cantidad de pisos");
			cantPisos = leer.nextInt();
			leer.nextLine();

			System.out.println("Ingrese el precio de la habitacion");
			precioHab = leer.nextDouble();
			leer.nextLine();

			System.out.println("Tipo de gimnasio A/B");
			String gym = leer.nextLine();

			if (gym.equalsIgnoreCase("A") || gym.equalsIgnoreCase("B")) {
				if (gym.equalsIgnoreCase("A")) {
					gimnasio = true;
				} else {
					gimnasio = false;
				}
			} else {
				gimnasio = false;
			}

			System.out.println("Ingrese nombre del restaurant");
			nombreResto = leer.nextLine();

			System.out.println("Ingrese capacidad del restaurant");
			capResto = leer.nextInt();
			leer.nextLine();

			switch (opc) {

			case 1:
				Hotel4 hotel4 = new Hotel4(nombre, direccion, localidad, gerente, cantHab, cantCamas, cantPisos,
						precioHab, gimnasio, nombreResto, capResto);
				listaAlojamientos.add(hotel4);
				break;

			case 2:
				int cantConf, cantSuites, cantLimo;

				System.out.println("Ingrese cantidad de salas de conferencia");
				cantConf = leer.nextInt();
				leer.nextLine();

				System.out.println("Ingrese cantidad de suites");
				cantSuites = leer.nextInt();
				leer.nextLine();

				System.out.println("Ingrese cantidad de limusinas");
				cantLimo = leer.nextInt();
				leer.nextLine();

				Hotel5 hotel5 = new Hotel5(nombre, direccion, localidad, gerente, cantHab, cantCamas, cantPisos,
						precioHab, gimnasio, nombreResto, capResto, cantConf, cantSuites, cantLimo);

				listaAlojamientos.add(hotel5);
				break;

			default:
				System.out.println("Error, ingrese opción nuevamente");
			}

		}

	}

	public static void verTodo() {
		// TODO Auto-generated method stub

	}

	public static void verHotelCaroBarato() {
		// TODO Auto-generated method stub

	}

	public static void verCampingResto() {
		// TODO Auto-generated method stub

	}

	public static void verResidenciasDescuento() {
		// TODO Auto-generated method stub

	}
}

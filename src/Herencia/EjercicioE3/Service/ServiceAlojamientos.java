package Herencia.EjercicioE3.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Herencia.EjercicioE3.Entity.Sub.Extra.Camping;
import Herencia.EjercicioE3.Entity.Sub.Extra.Residencia;
import Herencia.EjercicioE3.Entity.Sub.Hotel.*;
import Herencia.EjercicioE3.Entity.Super.Hotel;
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
				System.out.println("0 - Salir");
				System.out.println("");
				System.out.println("- - - - - - - - - - - - - -");
				System.out.println("");
				System.out.println("Ingrese una opción");

				opc = leer.nextInt();
				leer.nextLine();

			} while (opc < 1 || opc > 2);

			int cantHab, cantCamas, cantPisos;
			double precioHab = 50;

			System.out.println("Ingrese cantidad de habitaciones");
			cantHab = leer.nextInt();
			leer.nextLine();

			System.out.println("Ingrese cantidad de camas");
			cantCamas = leer.nextInt();
			leer.nextLine();

			System.out.println("Ingrese cantidad de pisos");
			cantPisos = leer.nextInt();
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
			
			

			precioHab = leer.nextDouble()

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

			case 0: break;
				
			default:
				System.out.println("Error, intente nuevamente");
			}

		case 2: 
			
			boolean privado;
			int m2;
			
			do {

				System.out.println("- - - - - - - - - - - - - -");
				System.out.println("");
				System.out.println("1 - Camping");
				System.out.println("2 - Residencia");
				System.out.println("0 - Salir");
				System.out.println("");
				System.out.println("- - - - - - - - - - - - - -");
				System.out.println("");
				System.out.println("Ingrese una opción");

				opc = leer.nextInt();
				leer.nextLine();

			} while (opc < 1 || opc > 2);
			
			System.out.println("Privado o público? 0/1");
			String pop = leer.nextLine();

			if (pop.equalsIgnoreCase("0") || pop.equalsIgnoreCase("1")) {
				if (pop.equalsIgnoreCase("1")) {
					privado = true;
				} else {
					privado = false;
				}
			} else {
				privado = false;
			}
			
			System.out.println("Ingrese los metros cuadrados:");
			m2 = leer.nextInt(); leer.nextLine();
			
			switch(opc) {
			
			case 1: 
				int cantCarpas, cantBano;
				boolean resto;
				
				System.out.println("Ingrese cantidad de carpas; ");
				cantCarpas = leer.nextInt(); leer.nextLine();
				
				System.out.println("Ingrese cantidad de baños");
				cantBano = leer.nextInt(); leer.nextLine();
				
				System.out.println("Tiene restaurant? 0/1");
				String restoo = leer.nextLine();

				if (restoo.equalsIgnoreCase("0") || restoo.equalsIgnoreCase("1")) {
					if (restoo.equalsIgnoreCase("1")) {
						resto = true;
					} else {
						resto = false;
					}
				} else {
					resto = false;
				}
				
				Camping camping = new Camping(nombre, direccion, localidad, gerente, privado, m2, cantCarpas, cantBano, resto);
				listaAlojamientos.add(camping);
				break;
				
				
			case 2: 
				
				int cantHabR;
				boolean descuento, campoDeport;
				
				System.out.println("Ingrese cantidad de habitaciones");
				cantHabR = leer.nextInt(); leer.nextLine();
				
				
				System.out.println("Tiene descuento por gremio? 0/1");
				String desc = leer.nextLine();

				if (desc.equalsIgnoreCase("0") || desc.equalsIgnoreCase("1")) {
					if (desc.equalsIgnoreCase("1")) {
						descuento = true;
					} else {
						descuento = false;
					}
				} else {
					descuento = false;
				}
				
				
				System.out.println("Tiene campo deportivo? 0/1");
				String camp = leer.nextLine();

				if (camp.equalsIgnoreCase("0") || camp.equalsIgnoreCase("1")) {
					if (camp.equalsIgnoreCase("1")) {
						campoDeport = true;
					} else {
						campoDeport = false;
					}
				} else {
					campoDeport = false;
				}
				
				Residencia resi = new Residencia( nombre,  direccion,  localidad,  gerente,  privado,  m2,
						 cantHabR,  descuento,  campoDeport);
				
				listaAlojamientos.add(resi);
				break;
			
			case 0: break;
			
			default:
				System.out.println("Error, intente nuevamente");
			
			}
			
			
			
		}

	}

	public static void verTodo() {

		for(Alojamiento alojamiento : listaAlojamientos) {
			if(alojamiento instanceof Hotel4) {
				
				((Hotel4)alojamiento).toString();
				
			} else if(alojamiento instanceof Hotel5) {
				
				((Hotel5)alojamiento).toString();
				
			} else if(alojamiento instanceof Camping) {
				
				((Camping)alojamiento).toString();
				
			} else {
				
				((Residencia)alojamiento).toString();
				
			}
		}
		
	}

	public static void verHotelCaroBarato() {
		for(Alojamiento alojamiento : listaAlojamientos) {
			if(alojamiento instanceof Hotel) {
				
				((Hotel4)alojamiento).toString();
				
			}
		}

	}

	public static void verCampingResto() {
		// TODO Auto-generated method stub

	}

	public static void verResidenciasDescuento() {
		// TODO Auto-generated method stub

	}
}

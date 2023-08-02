/*Ejercicio1 (utilizar ArrayList)
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.

Necesidades:
	 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
objetos de este tipo.
	 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
para no hacer carga manual de los datos)
	 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
apellido de forma ascendente.
	 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
nombre de forma descendente.
	 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas,
utilizando el atributo fecha de nacimiento.
	 Crear listas paralelas de Alumnos, según la nacionalidad.
	 Realizar un reporte final de datos que informe:
		o Cuantos alumnos son mayores de 25 años.
		o Cuantos alumnos tiene su apellido que comienzan con letra L o P
		o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.

Recordar:
	 Hacer uso de paquetes y clases correspondientes para buena estructura de
nuestro proyecto.
	 Todos los métodos deben ser pensados para reutilizar y adaptarse a futuros
cambios (por ejemplo, mañana quiero carga de 30 alumnos, y las instrucciones
deben prevenir esta modificación)*/

package Colecciones.EjercicioExtraExtra1.Service;

import java.util.*;

import Colecciones.EjercicioExtraExtra1.Entity.*;

public class ServiceAlumnos {

	Scanner leer = new Scanner(System.in);

	ArrayList<Alumnos> lista = new ArrayList<Alumnos>();

	ArrayList<Alumnos> listaArg = new ArrayList<Alumnos>();
	ArrayList<Alumnos> listaVen = new ArrayList<Alumnos>();
	ArrayList<Alumnos> listaChi = new ArrayList<Alumnos>();

	public void menu() {

		int opc;

		do {

			System.out.println(" M E N U ");
			System.out.println("1 - ALTA");
			System.out.println("2 - BAJA");
			System.out.println("3 - MODIFICACION");
			System.out.println("4 - MOSTRAR ALUMNO");
			System.out.println("5 - MOSTRAR TODOS LOS ALUMNOS");
			System.out.println("6 - MOSTRAR Y ORDENAR ALUMNOS POR APELLIDO DESCENDENTE");
			System.out.println("7 - MOSTRAR Y ORDENAR ALUMNOS POR APELLIDO ASCENDENTE");
			System.out.println("8 - MPSTRAR EDAD DEL ALUMNO");
			System.out.println("9 - REPORTE FINAL");
			System.out.println("0 - SALIR");

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("INGRESE SU OPCIÓN");
			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				crearLista();
				break;
			case 2:
				b();
				break;
			case 3:
				m();
				break;
			case 4:
				mostrarAlumno();
				break;
			case 5:
				mostrarTodo();
				break;
			case 6:
				ordenarApellidoDesc();
				break;
			case 7:
				ordenarApellidoAsc();
				break;
			case 8:
				mostrarEdad();
				break;
			case 9:
				LOP();
				
				may25();
				cantidadNac();
				break;
			case 0:
				break;
			default:
				System.out.println("ERROR: Ingrese nuevamente opción");
			}

		} while (opc != 0);

	}

	private void crearLista() {
		String opc;

		do {
			lista.add(a());
			listasNac();

			do {

				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));

	}

	private void listasNac() {

		for (Alumnos alumno : lista) {

			if (alumno.getNacionalidad().equals("ARGENTINA")) {

				listaArg.add(alumno);

			} else if (alumno.getNacionalidad().equals("VENEZOLANA")) {

				listaVen.add(alumno);

			} else if (alumno.getNacionalidad().equals("CHILENA")) {

				listaChi.add(alumno);

			}

		}

	}

	private Alumnos a() {

		Alumnos alumno = new Alumnos();

		String nacionalidad;

		boolean nac = false;

		int dia, mes, ano;

		System.out.println("Ingrese nombre del alumno");
		alumno.setNombre(leer.nextLine().toUpperCase());

		System.out.println("Ingrese apellido del alumno " + alumno.getNombre());
		alumno.setApellido(leer.nextLine().toUpperCase());

		do {

			System.out.println("Ingrese nacionalidad del alumno: (ARGENTINA, VENEZOLANA O CHILENA)");
			nacionalidad = leer.nextLine().toUpperCase();
			if (nacionalidad.equals("ARGENTINA") || nacionalidad.equals("VENEZOLANA")
					|| nacionalidad.equals("CHILENA")) {

				alumno.setNacionalidad(nacionalidad);
				nac = true;
			}

		} while (nac == false);

		System.out.println("INGRESAR EL DIA DE NACIMIENTO DE " + alumno.getNombre() + " " + alumno.getApellido());
		dia = leer.nextInt();
		leer.nextLine();

		System.out.println("INGRESAR MES DE NACIMIENTO DE " + alumno.getNombre() + " " + alumno.getApellido());
		mes = leer.nextInt();
		leer.nextLine();

		System.out.println("INGRESAR AÑO DE NACIMIENTO DE " + alumno.getNombre() + " " + alumno.getApellido());
		ano = leer.nextInt();
		leer.nextLine();

		alumno.setFechaNac(dia, mes, ano);

		return alumno;

	}

	private void b() {

		System.out.println("Ingrese nombre del alumno: ");
		String nombre = leer.nextLine().toUpperCase();

		System.out.println("Ingrese apellido del alumno: ");
		String apellido = leer.nextLine().toUpperCase();

		for (Alumnos alumno : lista) {

			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {

				lista.remove(alumno);

				break;

			}

		}

	}

	private void m() {

		int opc;

		System.out.println("Ingrese nombre del alumno: ");
		String nombre = leer.nextLine().toUpperCase();

		System.out.println("Ingrese apellido del alumno: ");
		String apellido = leer.nextLine().toUpperCase();

		boolean encontrado = false;

		for (Alumnos alumno : lista) {

			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {

				do {

					System.out.println(" M O D I F I C A C I O N");
					System.out.println("1 - MOFICAR NOMBRE");
					System.out.println("2 - MODIFICAR APELLIDO");
					System.out.println("3 - MODIFICAR NACIONALIDAD");
					System.out.println("4 - MODIFICAR FECHA DE NACIMIENTO");
					System.out.println("0 - SALIR");

					System.out.println("");
					System.out.println("");
					System.out.println("");

					System.out.println("INGRESE SU OPCIÓN");
					opc = leer.nextInt();
					leer.nextLine();

					switch (opc) {
					case 1:
						System.out.println("INGRESE EL NOMBRE A MODIFICAR");
						alumno.setNombre(leer.nextLine());
						break;
					case 2:
						System.out.println("INGRESE EL APELLIDO A MODIFICAR");
						alumno.setApellido(leer.nextLine());
						break;
					case 3:

						boolean nac = false;
						String nacionalidad;

						do {

							System.out.println("Ingrese nacionalidad del alumno: (ARGENTINA, VENEZOLANA O CHILENA)");
							nacionalidad = leer.nextLine().toUpperCase();
							if (nacionalidad.equals("ARGENTINA") || nacionalidad.equals("VENEZOLANA")
									|| nacionalidad.equals("CHILENA")) {

								alumno.setNacionalidad(nacionalidad);
								nac = true;
							}

						} while (nac == false);

						break;

					case 4:

						int dia, mes, ano;

						System.out.println(
								"INGRESAR EL DIA DE NACIMIENTO DE " + alumno.getNombre() + " " + alumno.getApellido());
						dia = leer.nextInt();
						leer.nextLine();

						System.out.println(
								"INGRESAR MES DE NACIMIENTO DE " + alumno.getNombre() + " " + alumno.getApellido());
						mes = leer.nextInt();
						leer.nextLine();

						System.out.println(
								"INGRESAR AÑO DE NACIMIENTO DE " + alumno.getNombre() + " " + alumno.getApellido());
						ano = leer.nextInt();
						leer.nextLine();

						alumno.setFechaNac(dia, mes, ano);

						break;

					case 0:

						break;

					default:

						System.out.println("ERROR: Ingrese nuevamente opción");
					}

				} while (opc != 0);

				encontrado = true;

				break;

			}

		}

		if (encontrado == false) {

			System.out.println("Alumno no encontrado");

		}

	}

	private void mostrarAlumno() {

		System.out.println("Ingrese nombre del alumno: ");
		String nombre = leer.nextLine().toUpperCase();

		System.out.println("Ingrese apellido del alumno: ");
		String apellido = leer.nextLine().toUpperCase();

		for (Alumnos alumno : lista) {

			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {

				System.out.println(alumno.toString());

				break;

			}

		}

	}

	private void mostrarTodo() {
		
		for (Alumnos alumno : lista) {

			System.out.println(alumno.toString());

		}
	}

	private void ordenarApellidoDesc() {

		Collections.sort(lista, Alumnos.ordenarApellidoDesc);
		
		System.out.println("Alumnos ordernados descendentemente por apellido");		//interface(DE JAVA) != interfaz(GUI INTERFAZ GRAFICA)
		
        for (Alumnos alumno : lista) {
        	
            System.out.println(alumno.toString());
            
        }
        
        System.out.println("");
		
	}

	private void ordenarApellidoAsc() {
		
		Collections.sort(lista, Alumnos.ordenarApellidoAsc);
		
		System.out.println("Alumnos ordernados ascendentemente por apellido");		
		
        for (Alumnos alumno : lista) {
        	
            System.out.println(alumno.toString());
            
        }
        
        System.out.println("");
	}

	@SuppressWarnings("deprecation")
	private void mostrarEdad() {
	
		System.out.println("Ingrese nombre del alumno: ");
		String nombre = leer.nextLine().toUpperCase();

		System.out.println("Ingrese apellido del alumno: ");
		String apellido = leer.nextLine().toUpperCase();

		
		for (Alumnos alumno : lista) {
			
			if (alumno.getNombre().equals(nombre) && alumno.getApellido().equals(apellido)) {
				
				if (alumno.getFechaActual().getMonth() > alumno.getFechaNac().getMonth()) {
					
					System.out.println("Edad:" + (alumno.getFechaActual().getYear() - alumno.getFechaNac().getYear()));
					
					
				} else if (alumno.getFechaActual().getMonth() == alumno.getFechaNac().getMonth() && alumno.getFechaActual().getDate() >= alumno.getFechaNac().getDate())
					
					System.out.println("Edad:" + (alumno.getFechaActual().getYear() - alumno.getFechaNac().getYear()));
				
				
				} else {
					
					System.out.println("Edad:" + ((alumno.getFechaActual().getYear() - alumno.getFechaNac().getYear())-1));
				
			}
			break;
			
			
		}
		
		

	}

	private void LOP() {

		int cant = 0;
		
		for(Alumnos alumno : lista) {
			
			if (alumno.getApellido().startsWith("L") || alumno.getApellido().startsWith("P")) {
				
				cant++;
				
			}
			
		}
		
		System.out.println("La cantidad de alumnos cuyo apellido empiezan con L o P es: " + cant);
		

	}

	@SuppressWarnings("deprecation")
	private void may25() {
		
		int cant = 0;
		int edad = 0;
		
		for(Alumnos alumno : lista) {
			if (alumno.getFechaActual().getMonth() > alumno.getFechaNac().getMonth()) {
				
				edad = alumno.getFechaActual().getYear() - alumno.getFechaNac().getYear();
				
			} else if (alumno.getFechaActual().getMonth() == alumno.getFechaNac().getMonth() && alumno.getFechaActual().getDate() >= alumno.getFechaNac().getDate()) {
				
				edad = (alumno.getFechaActual().getYear() - alumno.getFechaNac().getYear());
				
			} else {
				
				edad =  ((alumno.getFechaActual().getYear() - alumno.getFechaNac().getYear())-1);
			}
			if (edad >= 25) {
				
				cant++;
				
			}
		}
		
		System.out.println("Cantidad de alumnos mayores de 25: " + cant);
		
		
		

	}

	private void cantidadNac() {

		System.out.println("Cntidad de alumnos Argentinos: " + (listaArg.size()/2));
		System.out.println("Cntidad de alumnos Venezolanos: " + (listaVen.size()/2));
		System.out.println("Cntidad de alumnos Chilenos: " + (listaChi.size())/2);
		

	}

}

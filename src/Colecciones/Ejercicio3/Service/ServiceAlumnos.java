package Colecciones.Ejercicio3.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Colecciones.Ejercicio3.Entity.Alumnos;

public class ServiceAlumnos {

	ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
	Scanner leer = new Scanner(System.in);
	String opc;

	public void menu() {

		do {

			listaAlumnos.add(crearAlumnos());

			do {

				System.out.println("¿Continuar ingresando? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));

		do {

			notaFinal();

			do {
				
				System.out.println("¿Continuar con otro alumno? (S/N)");
				opc = leer.nextLine().toUpperCase();

				if (opc.equals("N") || opc.equals("S")) {
					break;
				}

			} while (true);

		} while (opc.equals("S"));
		
		for(Alumnos alumno : listaAlumnos) {
			System.out.println(alumno.toString());
			System.out.println(" - - - - - ");
		}

	}

	public Alumnos crearAlumnos() {

		Alumnos alumno = new Alumnos();

		ArrayList<Integer> listaNotas = new ArrayList<>();

		System.out.println("Ingrese el nombre del alumno: ");
		alumno.setNombre(leer.nextLine());

		System.out.println("Ingrese las tres notas del alumno " + alumno.getNombre());

		for (int aux = 0; aux < 3; aux++) {

			listaNotas.add(leer.nextInt());
			leer.nextLine();

		}
		alumno.setNotas(listaNotas);

		return alumno;
	}

	public void notaFinal() {

		double notaFinal = 0;

		System.out.println("Ingrese el nombre del alumno para saber su nota final: ");
		String nombre = leer.nextLine();

		for (Alumnos alumno : listaAlumnos) {

			if (alumno.getNombre().equals(nombre)) {
				for (Integer nota : alumno.getNotas()) {
					notaFinal = notaFinal + nota;
				}
			}

		}

		System.out.println("La nota final del alumno " + nombre + " es: " + (notaFinal / 3));

	}

}

package Excepciones.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5_main {

	/*
	 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
	 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
	 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
	 * un valor, la computadora debe decirle al usuario si el número que tiene que
	 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
	 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
	 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
	 * algo que no es un número, se debe controlar esa excepción e indicarlo por
	 * pantalla. En este último caso también se debe contar el carácter fallido como
	 * un intento.
	 */

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int intentos = 0;
		int numRandom = (int) (Math.random() * 500 + 1);
		int adivinar;

		do {
			try {
				System.out.println("Ingrese el numero a adivinar: ");
				intentos++;
				adivinar = leer.nextInt(); 
				if(adivinar == numRandom) {
					System.out.println("ADIVINASTE! El numero era: " + numRandom);
					System.out.println("Numero de intentos total: " + intentos);
					break;
				} else {
					if(adivinar > numRandom) {
						System.out.println("El numero a adivinar es menor que " + adivinar);
					} else {
						System.out.println("El numero a adivinar es mayor que " + adivinar);
					}
				}
				
			} catch (Exception ex) {
				System.out.println("Caracter inválido, solo ingrese números");
				leer.nextLine();
			}

		} while (true);

		leer.close();
		
	}

}

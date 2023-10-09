package Excepciones.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_main {

	public static void main(String[] args) {

		DivisionNumero divNum = new DivisionNumero();

		do {
			Scanner leer = new Scanner(System.in);

			try {

				String num1 = leer.nextLine();
				String num2 = leer.nextLine();

				System.out.println(num1 + "/" + num2 + " = " + divNum.dividir(num1, num2));

			} catch (Exception ex) {

				System.out.println("Error 1: " + ex);
				System.out.println("------------------------------------------------");
				System.out.println("Error 2: " + ex.getMessage());
				System.out.println("------------------------------------------------");
				System.out.println("Error 3: " + ex.fillInStackTrace());

			}

			leer.close();

		} while (true);

	}

}

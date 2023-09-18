package Excepciones.Ejercicio2;

public class Ejercicio2_main {

	public static void main(String[] args) {

		int listaInts[] = new int[10];
		
		for(int aux = 0; aux < 10; aux++) {
			listaInts[aux] = aux+1;
		}
		
		try {
			for(int aux = 0; aux <= 10; aux++) {
				System.out.println("Posición " + aux + ": " + listaInts[aux]);
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			
			System.out.println("Error 1: " + ex);
			System.out.println("------------------------------------------------");
			System.out.println("Error 2: " + ex.getMessage());
			System.out.println("------------------------------------------------");
			System.out.println("Error 3: " + ex.fillInStackTrace());
			
		}
		
		System.out.println("hola soy una linea debajo del error");
		
	}

}

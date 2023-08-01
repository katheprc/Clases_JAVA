package POO.Ejercicio10.Forma2.Service;

import java.text.DecimalFormat;
import java.util.Arrays;

import POO.Ejercicio10.Forma2.Entity.*;

public class ServiceArrayss2 {
	
	double[] a = new double[50];						 //Creamos los arrays
	double[] b = new double[20];
	
	public void rellenar() {
		
		Arrayss2 arrays = new Arrayss2();
		
		
		
		
		Arrays.fill(a, 0, 49, randomm());
		
		
		
		Arrays.sort(a, 0, 50);							 //ordenamos el array a
		
		for (int aux = 0 ; aux < 20 ; aux++) {
			if (aux < 10) {
				Arrays.fill(b, aux, aux+1, a[aux]);  	 //Rellenamos array b con los primeros 10 numeros de a
			} else {
				Arrays.fill(b, aux, aux+1, 0.5);		 //Rellenamos el resto  del array con 0.5
			}
		}
		
		arrays.setA(a);								     //seteamos directamente por parámetro enviando los arrays creados acá
		arrays.setB(b);
		
		System.out.println("Array A: ");
		for (int aux = 0 ; aux < 50 ; aux++) {
			System.out.print(arrays.getA()[aux] + "|");  //Geteamos el array completo desde el objeto y buscamos y rellenamos el index en cada iteración
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Array B: ");
		for (int aux = 0 ; aux < 20 ; aux++) {
			System.out.print(arrays.getB()[aux] + "|");
		}
		
	}
	
	public double randomm() {
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.parseDouble(df.format((Math.random()*100))); //Numeros random del 1 al 100 con dos digitos luego del punto
	}

	
}

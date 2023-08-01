package POO.Ejercicio10.Forma1.Service;

import java.text.DecimalFormat;
import java.util.Arrays;

import POO.Ejercicio10.Forma1.Entity.*;

public class ServiceArrayss {
	
	double[] a = new double[50];						 //Creamos los arrays
	double[] b = new double[20];
	
	public void rellenar() {
		//objeto = clase
		//instancia = nombre de la variable de tipo objeto.
		
		//Arrayss = clase (objeto)
		//arrays = instancia (nombre)
		
		String hola = "sajdjs";
		
		//String = clase(objeto)
		//hola = instancia(nombre)
		
		//variable de referencia ==== instancia
		
		ArraysCreado nombre = new ArraysCreado();					//Notar que utilizamos minúsculas en el nombre de la variable para no causr conflicto con la clase java nativa Arrays
														// A su vez, llamamos la clase creada "Arrayss" por el mismo motivo
		for (int aux = 0 ; aux < 50 ; aux++) {
			Arrays.fill(a, aux, aux+1, randomm());		 //rellenamos el array a. Arrays.fill(NombreDelArray, posiciónDeInicio, posiciónDeFinalización, datoARellenar)
		}

		hola.equals("asdkjah"); //método de la CLASE OBJETO STRING
		hola.substring(0, 0+1); //métodos de la CLASE OBJETO STRING
		
		Arrays.sort(a, 0, 50);							 //ordenamos el array a Arrays.sort(nombre, posI, PosF)
		
		
		for (int aux = 0 ; aux < 20 ; aux++) {
			if (aux < 10) {
				Arrays.fill(b, aux, aux+1, a[aux]);  	 //Rellenamos array b con los primeros 10 numeros de a
			} else {
				Arrays.fill(b, aux, aux+1, 0.5);		 //Rellenamos el resto  del array con 0.5
			}
		}
		
		nombre.setA(a);								     //seteamos directamente por parámetro enviando los arrays creados acá
		nombre.setB(b);
		
		System.out.println("Array A: ");
		for (int aux = 0 ; aux < 50 ; aux++) {
			System.out.print(nombre.getA()[aux] + "|");  //Geteamos el array completo desde la instancia del objeto y buscamos el index en cada iteración
													    //GETA() ES UN MÉTODO DE LA CLASE ArraysCreado, lo utiliza "nombre" ya que es una instancia de esa clase
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Array B: ");
		for (int aux = 0 ; aux < 20 ; aux++) {
			System.out.print(nombre.getB()[aux] + "|");	//acá utilizmos la variable importada de la instancia
			//system.out.print(a[aux] + "|"); acá utilizamos la variable local, NO la importada de la instancia
		}
		
		
	}
	
	public double randomm() {
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.parseDouble(df.format((Math.random()*100))); //Numeros random del 1 al 100 con dos digitos luego del punto
	}

	
}

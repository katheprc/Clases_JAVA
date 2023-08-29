package Herencia.Ejercicio2y3.Entity.subclass;

import Herencia.Ejercicio2y3.Entity.superclass.*;
import java.util.*;

public class Lavadora extends Electrodomestico {
	
	int carga;
	
	Scanner leer = new Scanner(System.in);

	public Lavadora() {
	}

	public Lavadora(double precio, double peso, String color, char consumo, int carga) {
		
		super(precio, peso, color, consumo);

		this.carga = carga;
		
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void crearLavadora() {
		
		System.out.println("Ingrese la carga en KG");
		
		this.carga = leer.nextInt(); leer.nextLine();
		
		if(this.carga > 30) {
			
			crearElectrodomestico(500);
			
		} else {
			
			crearElectrodomestico(0);
		
		}
		
	}

	public void stringLava() {
		System.out.println("Tipo: Lavadora || Carga: " + carga + " || Color: " + getColor() + " || Precio: " + getPrecio() + " || Peso: " + getPeso() + " || Consumo: " + getConsumo());
	}
	
	
}

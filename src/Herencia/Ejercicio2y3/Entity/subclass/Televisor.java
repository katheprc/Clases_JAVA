package Herencia.Ejercicio2y3.Entity.subclass;

import Herencia.Ejercicio2y3.Entity.superclass.*;
import java.util.*;

public class Televisor extends Electrodomestico {

	int pulgadas;
	boolean sintonizador = false;

	Scanner leer = new Scanner(System.in);

	public Televisor() {
	}

	public Televisor(double precio, double peso, String color, char consumo, int pulgadas, boolean sintonizador) {

		super(precio, peso, color, consumo);

		this.pulgadas = pulgadas;

		this.sintonizador = sintonizador;

	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	public void crearTelevisor() {

		System.out.println("Ingrese la resolución en pulgadas");

		this.pulgadas = leer.nextInt();
		leer.nextLine();

		do {
			
			System.out.println("Tiene sintonizador TDT? (S/N)");
			String opc = leer.nextLine().toUpperCase();

			if (opc.equals("S") || opc.equals("N")) {
				
				if (opc.equals("S")) {
					
					this.sintonizador = true;
					crearElectrodomestico(500);
					
				} else {
					
					crearElectrodomestico(0);
				}
				
				break;
				
			}

		} while (true);
		
		if(this.pulgadas > 40) {
			
			setPrecio(getPrecio() + ((getPrecio()*30)/100));
			
		}
		

	}
	
	public void stringTele() {
		System.out.println("Tipo: Televisor || Pulgadas: " + pulgadas + " || Sintonizador: " + sintonizador + " || Color: " + getColor() + " || Precio: " + getPrecio() + " || Peso: " + getPeso() + " || Consumo: " + getConsumo());
	}

}

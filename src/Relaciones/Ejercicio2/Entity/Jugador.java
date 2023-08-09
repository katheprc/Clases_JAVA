/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a true*/

package Relaciones.Ejercicio2.Entity;

public class Jugador {
	
	private int id;
	private String nombre;
	boolean mojado = false;
	
	
	public int getId() {
		return id;
	}
	
	
	public void setNombreEId(int id) {
		
		this.id = id;
		
		this.nombre = "Jugador " + id;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getMojado() {
		return mojado;
	}
	
	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}
	
	public boolean disparo(RevolverDeAgua revolver) {
		
		if(revolver.mojar()) {
			
			this.mojado = true;
			return true;
			
		}
		
		revolver.siguienteChorro();
		
		return false;
		
	}

}

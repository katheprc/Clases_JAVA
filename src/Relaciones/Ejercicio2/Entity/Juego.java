/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/

package Relaciones.Ejercicio2.Entity;

import java.util.*;

public class Juego {
	
	private ArrayList<Jugador> listaJugadores = new ArrayList<>();
	
	public void llenarJuego(Jugador jugador) {
		
		this.listaJugadores.add(jugador);
		
	}
	
	public void ronda(RevolverDeAgua revolver) {
		
		Jugador jugador;
		
		for(int aux = 0; aux <= listaJugadores.size(); aux++) {
			
			jugador = listaJugadores.get(aux);
			System.out.println("Posicion del tambor = " + revolver.getPosActual());
			System.out.println("");
			
			if(jugador.disparo(revolver)) {
				
				System.out.println(jugador.getNombre() + " ha perdido!");
				System.out.println(revolver.toString());
				break;
				
			} else {
				
				System.out.println(jugador.getNombre() + " se salvó!");
				
				System.out.println(""); System.out.println("");
				
				if (aux == listaJugadores.size()-1) {
					aux = -1;
				}
				
			}
			
		}

	}
	
	
	
	

}

















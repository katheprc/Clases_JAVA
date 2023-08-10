/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/

package Relaciones.Ejercicio3.Service;

import java.util.*;

import Relaciones.Ejercicio3.Entity.Carta;

public class ServiceBaraja {

	ArrayList<Carta> baraja = new ArrayList<>();
	
	ArrayList<Carta> baraja2 = new ArrayList<>();
	
	ArrayList<Carta> mano = new ArrayList<>();

	Scanner leer = new Scanner(System.in);

	public void menu() {

		int opc;

		crearBaraja();
		baraja2.addAll(baraja);

		do {

			System.out.println("");
			System.out.println("");
			System.out.println(" - - - M E N U - - -");
			System.out.println("1 - Barajar(mezclar)");
			System.out.println("2 - Siguiente Carta");
			System.out.println("3 - Mostrar cantidad de cartas disponibles");
			System.out.println("4 - Dar x cantidad de cartas");
			System.out.println("5 - Mostrar las cartas dadas");
			System.out.println("6 - Mostrar baraja completa");
			System.out.println("0 - salir");

			System.out.println("");
			System.out.println("");

			System.out.println("Ingrese su opción");
			opc = leer.nextInt();
			leer.nextLine();

			switch (opc) {
			case 1:
				barajar();
				break;
			case 2:
				siguienteCarta();
				cartasMonton();
				break;
			case 3:
				cartasDisponibles();
				break;
			case 4:
				darCartas();
				break;
			case 5:
				cartasMonton();
				break;
			case 6:
				mostrarBaraja();
				break;
			case 0:
				break;
			default:
				System.out.println("error: ingrese opc correcta");
			}

		} while (opc != 0);

	}

	private void crearBaraja() {

		for (int aux = 1; aux <= 4; aux++) {

			for (int aux2 = 1; aux2 <= 12; aux2++) {

				if (aux2 != 8 && aux2 != 9) {

					switch (aux) {

					case 1:
						crearCarta(aux2, "Espada");
						break;

					case 2:
						crearCarta(aux2, "Oro");
						break;

					case 3:
						crearCarta(aux2, "Copa");
						break;

					case 4:
						crearCarta(aux2, "Basto");
						break;

					}

				}

			}

		}

	}

	public void crearCarta(int num, String palo) {

		Carta carta = new Carta();

		carta.setNumero(num);
		carta.setPalo(palo);

		baraja.add(carta);

	}
	
	private void barajar() {
		
		Collections.shuffle(baraja2);
		System.out.println("Cartas mezcladas!");
		System.out.println("");
		
	}

	private void siguienteCarta() {
		
		if(baraja2 == null) {
			System.out.println("No hay mas cartas para dar!");
		} else {
			mano.add(baraja2.get(0));
			baraja2.remove(0);
		}
		
		
	}

	private void cartasDisponibles() {

		System.out.println("Cartas disponibles = " + baraja2.size());
		
	}

	private void darCartas() {
		
		System.out.println("Ingrese la cantidad de cartas deseadas: ");
		int cant = leer.nextInt(); leer.nextLine();
		
		if(cant > baraja2.size()) {

			System.out.println("No hay suficientes cartas");
			cartasDisponibles();
		
		} else {
			for(int aux = 0; aux < cant; aux++) {
				siguienteCarta();
			}
		}
		cartasMonton();
		
	}

	private void cartasMonton() {
		
		if(mano == null) {
			System.out.println("No hay cartas en la mano");
		} else {
			System.out.println("mano = ");
			for(Carta carta : mano) {
				System.out.print(carta.toString());
			}
		}
		
	}

	private void mostrarBaraja() {
		
		System.out.println("Baraja = ");
		for(Carta carta : baraja2) {
			System.out.print(carta.toString());
		}
		
	}

}

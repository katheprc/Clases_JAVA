package Colecciones.EjercicioExtra2;

import java.util.ArrayList;

import Colecciones.EjercicioExtra2.Entity.Cantante;
import Colecciones.EjercicioExtra2.Service.ServiceCantante;

public class EjercicioExtra2_main {

	public static void main(String[] args) {
		
		ArrayList<Cantante> listaCantantes = new ArrayList<>(); //original
		
		ServiceCantante srvCantante = new ServiceCantante();
		
		Cantante cantante1 = new Cantante("SHAKIRA", "BIZARRAP SESSION");
		Cantante cantante2 = new Cantante("KAROL G", "TQG");
		Cantante cantante3 = new Cantante("M. BECERRA", "OJALÁ");
		Cantante cantante4 = new Cantante("TINI", "BAR");
		Cantante cantante5 = new Cantante("L-GANTE", "EN CANA");
		
		listaCantantes.add(cantante1);
		listaCantantes.add(cantante2);
		listaCantantes.add(cantante3);
		listaCantantes.add(cantante4);
		listaCantantes.add(cantante5);
		
		srvCantante.mostrar(listaCantantes);
			
		listaCantantes = srvCantante.menu(listaCantantes); //lo pasamos mediante parametro
		//actualizo 
		//con lo cambios
		
		srvCantante.mostrar(listaCantantes);
	}
	
}



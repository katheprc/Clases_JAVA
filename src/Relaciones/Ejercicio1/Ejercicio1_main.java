/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/



package Relaciones.Ejercicio1;

import Relaciones.Ejercicio1.Service.ServiceAdopcion;

public class Ejercicio1_main {

	public static void main(String[] args) {

		ServiceAdopcion srvAdop = new ServiceAdopcion();
		
		srvAdop.crearEntidades();
		

	}

}

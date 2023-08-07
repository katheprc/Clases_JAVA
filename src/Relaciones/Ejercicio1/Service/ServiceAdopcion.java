/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

package Relaciones.Ejercicio1.Service;


import java.util.*;
import Relaciones.Ejercicio1.Entity.*;


public class ServiceAdopcion {
	
	public void crearEntidades() {
		
		Perro perro = new Perro("Puchicho", "caniche", "pequeño", 2);
		Persona persona = new Persona("Maria", "Lopez", "11.111.111", 30, perro);
		
		mostrar(persona);
		
		Perro perro2 = new Perro("Puchi", "mestizo", "mediano", 6);
		Persona persona2 = new Persona("Yael", "Valdez", "22.222.222", 25, perro2);
		
		mostrar(persona2);
		
	}
	
	public void mostrar(Persona persona) {
		
		System.out.println(persona.toString());
		
	}
	
}

/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/


package Relaciones.Ejercicio1Extra.Entity;

public class Persona {
	
	private String nombre, apellido, documento;
	private int edad;
	
	private Perro perro;

	public Persona() {
	}

	public Persona(String nombre, String apellido, String documento, int edad, Perro perro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
		this.perro = perro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

	@Override
	public String toString() {
		
		if (perro != null) {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad
					+ ", perro=" + perro.toString() + "]";
		} else {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad
					+ ", perro= SIN ADOPTAR ]";
		}
		

	}
}

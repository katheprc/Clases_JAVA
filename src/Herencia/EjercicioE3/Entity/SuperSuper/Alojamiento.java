package Herencia.EjercicioE3.Entity.SuperSuper;

public abstract class Alojamiento {

	protected String nombre, direccion, localidad, gerente;

	public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.gerente = gerente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
}


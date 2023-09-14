package Relaciones.Ejercicio4Extra.Entity.SuperSuperclass;

public abstract class Persona {

	protected String nombre, apellido, id, estCivil;

	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String id, String estCivil) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.estCivil = estCivil;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstCivil() {
		return estCivil;
	}

	public boolean setEstCivil(String estCivil) {

		switch (estCivil) {

			case "SOLTERO":
			case "CASADO":
			case "EN PAREJA":
				this.estCivil = estCivil;
				return true;

			default:
				System.out.println("Error");
				return false;

		}

	}

}

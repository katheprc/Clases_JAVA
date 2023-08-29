package Herencia.EjercicioE1.entity.subclass;

import Herencia.EjercicioE1.entity.superclass.Barco;

public class Motor extends Barco{

	private int potenciaEnCV;
	
	public Motor() {
		
	}
	
	public Motor(String matricula, int eslora, int anoFabricacion, int potenciaEnCV) {
		super(matricula, eslora, anoFabricacion);
		this.potenciaEnCV = potenciaEnCV;
	}

	public int getPotenciaEnCV() {
		return potenciaEnCV;
	}

	public void setPotenciaEnCV(int potenciaEnCV) {
		this.potenciaEnCV = potenciaEnCV;
	}
		
}

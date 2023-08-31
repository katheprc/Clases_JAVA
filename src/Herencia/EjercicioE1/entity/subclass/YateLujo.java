package Herencia.EjercicioE1.entity.subclass;

import Herencia.EjercicioE1.entity.superclass.Barco;

public class YateLujo extends Barco{

	private int potenciaEnCV, numCamarotes;
	
	public YateLujo() {
		
	}
	
	public YateLujo(String matricula, int eslora, int anoFabricacion, int potenciaEnCV, int numCamarotes) {
		super(matricula, eslora, anoFabricacion);
		this.potenciaEnCV = potenciaEnCV;
		this.numCamarotes = numCamarotes;
	}
	
	public int getPotenciaEnCV() {
		return potenciaEnCV;
	}

	public void setPotenciaEnCV(int potenciaEnCV) {
		this.potenciaEnCV = potenciaEnCV;
	}

	public int getNumCamarotes() {
		return numCamarotes;
	}

	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}

	@Override
	public String toString() {
		return "YateLujo [potenciaEnCV=" + potenciaEnCV + ", numCamarotes=" + numCamarotes + "matricula=" + getMatricula() + ", eslora=" + getEslora() + ", anoFabricacion=" + getAnoFabricacion() +"]";
	}
	
	
	
}

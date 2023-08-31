package Herencia.EjercicioE1.entity.subclass;

import Herencia.EjercicioE1.entity.superclass.Barco;

public class Velero extends Barco{

	private int numMastiles;
	
	public Velero() {
		
	}

	public Velero(String matricula, int eslora, int anoFabricacion, int numMastiles) {
		super(matricula, eslora, anoFabricacion);
		this.numMastiles = numMastiles;
	}

	public int getNumMastiles() {
		return numMastiles;
	}

	public void setNumMastiles(int numMastiles) {
		this.numMastiles = numMastiles;
	}

	@Override
	public String toString() {
		return "Velero [numMastiles=" + numMastiles + "matricula=" + getMatricula() + ", eslora=" + getEslora() + ", anoFabricacion=" + getAnoFabricacion() +"]";
	}
	
	
	
}

package POO.Ejercicio10.Forma2.Entity;

public class Arrayss2 {

	double[] a = new double[50];
	double[] b = new double[20];
	
	public Arrayss2() {
	}
	
	public double[] getA() {
		return a;
	}
	
	public double[] getB() {
		return b;
	}
	
	public void setA(double[] a) {			//Seteamos el array del objeto recibiendo un array por parametro
		this.a = a;
	}
	
	public void setB(double[] b) {  
		this.b = b;
	}	
	
}

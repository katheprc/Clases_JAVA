package Herencia.EjercicioE3.Entity.Sub.Hotel;

public class Hotel5 extends Hotel4{

	private int cantConf, cantSuites, cantLimo;

	public Hotel5(String nombre, String direccion, String localidad, String gerente, int cantHab, int cantCamas,
			int cantPisos, double precioHab, boolean gimnasio, String nombreResto, int capResto, int cantConf,
			int cantSuites, int cantLimo) {
		super(nombre, direccion, localidad, gerente, cantHab, cantCamas, cantPisos, precioHab, gimnasio, nombreResto, capResto);
		this.cantConf = cantConf;
		this.cantSuites = cantSuites;
		this.cantLimo = cantLimo;
	}

	public int getCantConf() {
		return cantConf;
	}

	public void setCantConf(int cantConf) {
		this.cantConf = cantConf;
	}

	public int getCantSuites() {
		return cantSuites;
	}

	public void setCantSuites(int cantSuites) {
		this.cantSuites = cantSuites;
	}

	public int getCantLimo() {
		return cantLimo;
	}

	public void setCantLimo(int cantLimo) {
		this.cantLimo = cantLimo;
	}

	@Override
	public String toString() {
		return "Hotel5 [cantConf=" + cantConf + ", cantSuites=" + cantSuites + ", cantLimo=" + cantLimo + ", gimnasio="
				+ gimnasio + ", nombreResto=" + nombreResto + ", capResto=" + capResto + ", cantHab=" + cantHab
				+ ", cantCamas=" + cantCamas + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + ", nombre="
				+ nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + "]";
	}
	
	
	
}

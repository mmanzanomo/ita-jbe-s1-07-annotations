package n1exercici1.treballador;

public class TreballadorOnline extends Treballador {
	public static final double PREU_TARIFA_PLANA = 40.0;
	
	
	public TreballadorOnline(String nom, String cognom, double preu_hora) {
		super(nom, cognom, preu_hora);
	}
	
	
	@Override
	public double calcularSou(double hores) {
		return PREU_TARIFA_PLANA + super.calcularSou(hores);
	}
	
	// Example of deprecated method for n1exercici2 
	/**
	 * @deprecated
	 * This method is no longer acceptable for calculating the
	 * salary of online workers. Instead should be use calcularSou()
	 */
	@Deprecated
	public void calcularPreuHora() {
		System.out.println("Calcula preu-hora treballador online");
	}
	
	public static double getPreuTarifaPlana() {
		return PREU_TARIFA_PLANA;
	}
	
	
	
}

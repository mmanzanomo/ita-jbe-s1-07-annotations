package n1exercici1.treballador;

public class TreballadorPresencial extends Treballador {
	private static double benzina;
	
	public TreballadorPresencial(String nom, String cognom, double preu_hora) {
		super(nom, cognom, preu_hora);
	}
	
	
	@Override
	public double calcularSou(double hores) {
		return benzina + super.calcularSou(hores);
	}
	
	// Example of deprecated method for n1exercici2 
	/**
	 * @deprecated
	 * This method is no longer acceptable because benzina argument
	 * does not use Benzina class argument.
	 * Instead should be use calcularSou()
	 */
	@Deprecated
	public double calcularSou(double hores, double benzina) {
		return hores + benzina + getPreu_hora();
	}
	

	public static double getBenzina() {
		return benzina;
	}

	public static void setBenzina(double benzina) {
		TreballadorPresencial.benzina = benzina;
	}
	
	
	
}

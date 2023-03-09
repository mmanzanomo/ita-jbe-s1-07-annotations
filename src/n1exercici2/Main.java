package n1exercici2;

import n1exercici1.treballador.TreballadorOnline;
import n1exercici1.treballador.TreballadorPresencial;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		double sou;
		TreballadorOnline treballadorOnline = new TreballadorOnline("Cristina", "Olivares", 45.25);
		TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Lucas", "Montana", 40);
		
		// Calls deprecated methods of the child classes of n1exercici1
		treballadorOnline.calcularPreuHora();
		
		sou = treballadorPresencial.calcularSou(35, 6.12);
		System.out.println(sou);
	}

}

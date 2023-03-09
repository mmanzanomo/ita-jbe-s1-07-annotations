package n1exercici1;

import n1exercici1.treballador.Treballador;
import n1exercici1.treballador.TreballadorOnline;
import n1exercici1.treballador.TreballadorPresencial;

public class Main {

	public static void main(String[] args) {
		double sou;
		
		/* Create an instance of each class with the same price-hours to check
		 * the working of @Override 
		 * */
		Treballador treballador = new Treballador("Albert", "Casas", 50.25);
		Treballador treballadorPresencial = new TreballadorPresencial("Ana", "Vendrell", 50.25);
		Treballador treballadorOnline = new TreballadorOnline("Alicia", "Casellas", 50.25);
		
		// Adding a value to the 'benzina' attribute of the 'TreballadorPresencial' class
		TreballadorPresencial.setBenzina(41.6);
		
		// Call 'calcularSou' method directly to the 'Treballador' class
		sou = treballador.calcularSou(40);
		System.out.println(sou);
		
		// Call 'calcularSou()' to the 'TreballadorPresencial' class
		sou = treballadorPresencial.calcularSou(40);
		System.out.println(sou);
		
		// Call 'calularSou()' to the 'TreballadorOnline' class
		sou = treballadorOnline.calcularSou(40);
		System.out.println(sou);
	}

}

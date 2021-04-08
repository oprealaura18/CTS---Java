package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;

public class Program {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("FCSB", "Dinamo", "Gigel");
		bilet.rezervaBilet();
		DecoratorCuMesajSustinere decorator = new DecoratorCuMesajSustinere(bilet);
		decorator.rezervaBilet();

	}

}

package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;
import ro.ase.cts.decorator.clase.DecoratorMesajLMA;

public class Program {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("FCSB", "Dinamo", "Gigel");
		bilet.rezervaBilet();
		DecoratorCuMesajSustinere decorator = new DecoratorCuMesajSustinere(bilet);
		decorator.rezervaBilet();
		
		DecoratorMesajLMA decorator2 = new DecoratorMesajLMA(bilet);
		System.out.println("A doua decorare");
		
		decorator2.rezervaBilet();

		System.out.println("A treia decorare");
		DecoratorAbstract decorator3 = new DecoratorMesajLMA(decorator);
		decorator3.rezervaBilet();
	}

}

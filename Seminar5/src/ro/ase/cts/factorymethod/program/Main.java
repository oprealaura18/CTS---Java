package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.factory.AtacantFactory;
import ro.ase.cts.factorymethod.factory.MijlocasFactory;
import ro.ase.cts.factorymethod.factory.PortarFactory;

public class Main {
	
	public static void printeazaJucator( JucatorFactory fabrica ,String nume) {
		Jucator jucator1 = fabrica.createJucator(nume);
		System.out.println(jucator1.toString());
	}

	public static void main(String[] args) {
		printeazaJucator(new PortarFactory(), "Razvan");
		printeazaJucator(new AtacantFactory(), "Florin");
		printeazaJucator(new MijlocasFactory(), "Vasile");

	}

}

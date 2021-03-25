package ro.ase.cts.factorymethod.factory;

import ro.ase.cts.factorymethod.clase.Fundas;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;

public class FundasFactory implements  JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Fundas(nume);
	}

}

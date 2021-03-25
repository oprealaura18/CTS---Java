package ro.ase.cts.factorymethod.factory;

import ro.ase.cts.factorymethod.clase.Atacant;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;

public class AtacantFactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Atacant(nume);
	}

}

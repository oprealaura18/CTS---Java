package ro.ase.cts.factorymethod.factory;

import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.Mijlocas;

public class MijlocasFactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume);
	}

}

package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Factory;
import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {
		
	
	try {
		Jucator jucator1 =Factory.creatJucator(TipJucator.Fundas, "Laura");
		Jucator jucator2 =Factory.creatJucator(TipJucator.Portar, "Tania");
	System.out.println(jucator1.toString());
	System.out.println(jucator2.toString());
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

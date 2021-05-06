package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContDeCredit;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent("laura", 100);
		Cont contEconomii = new ContEconomii("laura", 200);
		Cont contDeCredit = new ContDeCredit("laura", 500);
		Cont contIndisponibil = new ContIndisponibil("laura");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contDeCredit);
		contDeCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizeazaPlata(50);
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(300);
	
		contCurent.realizeazaPlata(500);
		
		
		

	}

}

package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Program {
	public static void main(String[] args) {
		
		ContBancar cont = new ContBancar("Laura");
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(cont, 50));
		manager.invoca(new ComandaDepunere(cont, 30));
		
		manager.executaComanda();
		
		manager.invoca(new ComandaRetragere(cont,90));
		
		manager.executaComanda();
		manager.executaComanda();
	}
}

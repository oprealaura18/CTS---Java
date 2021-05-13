package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientFidel;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.ManagerSalaAbstract;

public class Program {

	public static void main(String[] args) {
		ClientFidel client1 = new ClientFidel("Laura");
		ClientFidel client2 = new ClientFidel("Teo");
		ClientFidel client3 = new ClientFidel("Razvan");
		ClientFidel client4 = new ClientFidel("Maria");
		
		ManagerSala manager = new ManagerSala();
		
		manager.adaugaAbonat(client1);
		manager.adaugaAbonat(client2);
		manager.adaugaAbonat(client3);
		manager.adaugaAbonat(client4);
		
		manager.anuntaMeci("Fotbal");
		
		System.out.println("----------------");
		
		manager.stergeAbonat(client3);
		
		manager.anuntaMeci("Volei");
	}

}

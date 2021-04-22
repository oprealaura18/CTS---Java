package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Program {

	public static void main(String[] args) {
		Cash cash = new Cash(500);
	Client client = new Client("Laura", cash);
	
	client.platesteNota(300);
	
	client.setModalitatePlata(new Card());
	client.platesteNota(50);
	
	client.setModalitatePlata(cash);
	client.platesteNota(250);

	}

}

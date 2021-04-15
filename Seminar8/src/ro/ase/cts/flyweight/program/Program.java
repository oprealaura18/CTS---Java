package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare("12", 5, 6);
		Rezervare rezervare2 = new Rezervare("14", 2, 5);
		Rezervare rezervare3 = new Rezervare("14", 8, 2);
		
		FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
		Client client = (Client) fabricaFlyweight.getClient("0712365478");
		client.afiseazaInformatii(rezervare);
		
		
		Client client2 = (Client) fabricaFlyweight.getClient("0732222222");
		client.afiseazaInformatii(rezervare2);
		
		fabricaFlyweight.getClient("0712355555").afiseazaInformatii(rezervare3);
	}

}

package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private	Zookeeper zookeeper;
	private List<Animal> listaAnimale;
	
	//param
	public Zoo(Zookeeper zookeeper, List<Animal> listaAnimale) {
		super();
		this.zookeeper = zookeeper;
		this.listaAnimale = listaAnimale;
	}
	
	
	//fara param
	public Zoo() {
		
		this.zookeeper = new Zookeeper();
		this.zookeeper.setName("Gigel");
		this.listaAnimale = new ArrayList<>();
	}
	
	//adaugam un nou animal (metoda)
	public void addAnimal(Animal animal)
	{
		this.listaAnimale.add(animal);
	}

	//hraneste toate animalele
	public void feedAllAnimals()
	{
		//pentru fiecare ob din colectia lista
		for(Animal a : this.listaAnimale)
			zookeeper.feed(a);
			
	}
}

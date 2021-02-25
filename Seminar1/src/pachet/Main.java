package pachet;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Giraffe g2= new Giraffe("Maia");
		Giraffe g1 = new Giraffe("Tania", 300);
		
		Zebra z1 = new Zebra("Raluca");
		Zebra z2 = new Zebra("Andra", 400);
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAllAnimals();
	}

}

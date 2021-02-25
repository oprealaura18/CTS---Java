package pachet;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Giraffe g2= new Giraffe("Maia");
		Giraffe g1 = new Giraffe("Tania", 300);
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.feedAllAnimals();
	}

}

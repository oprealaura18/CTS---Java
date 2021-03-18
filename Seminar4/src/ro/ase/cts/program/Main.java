package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		//Eager
		ManagerSpital m1 = ManagerSpital.getInstance();
		ManagerSpital m2 = ManagerSpital.getInstance();

		System.out.println(m1.toString());
		System.out.println(m2.toString());

		
		//lazy
		ManagerSpitalLazy managerLazy1 = ManagerSpitalLazy.getInstance("Popel", 26, 3611);
		ManagerSpitalLazy managerLazy2 = ManagerSpitalLazy.getInstance("Maria", 29, 6652);
		
		managerLazy1.setVarsta(49);
		managerLazy2.setNume("Ionel");
		
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
	
	}

}

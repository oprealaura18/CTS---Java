package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;

public class Program {

	public static void main(String[] args) {
	 Masa masa = new Masa(20);
	 masa.rezerva();
	 masa.ocupa();
	 
	 masa.rezerva();
	 
	 masa.setStare(new Libera());
	 masa.rezerva();
	 masa.elibereaza();

	}

}

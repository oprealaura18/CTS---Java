package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.Proxy;
public class Program {

	public static void main(String[] args) {
		OperatorRezervare operatorRezervare = new OperatorRezervare("Local X");
		operatorRezervare.rezerva(12);
		operatorRezervare.rezerva(3);
		
		Proxy proxy = new Proxy(operatorRezervare,4); 
		proxy.rezerva(2);
		proxy.rezerva(7);
	}

}
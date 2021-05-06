package ro.ase.cts.command.clase;

public class ContBancar {
 private String detinator;
 private float sold;
 
public ContBancar(String detinator) {
	super();
	this.detinator = detinator;
}
 
public void constituire(float suma) {
	System.out.println("S-a constituit contul cu suma de "+suma);
	sold = suma;
}
 
public void retragere(float suma) {
	if (suma <= sold) {
		System.out.println("S-a retras suma de "+suma);
		sold = sold - suma;
	}
	else {
		System.out.println("Nu s-a putut retrage suma "+ suma + "INDISPONIBILA");
	}
}

public void depunere(float suma) {
	System.out.println("S-a depus suma de " + suma);
	sold = sold + suma;
}
}

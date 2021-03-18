package ro.ase.cts.clase;

public class LibrarieDepozit {
int numarCarti;
String denumire;
float pret;

private static LibrarieDepozit instanta = null;
public static synchronized LibrarieDepozit getInstance(int numarCarti, String denumire, float pret) {
	if (instanta == null) {
		instanta = new LibrarieDepozit(numarCarti, denumire, pret);
		
	}
	return instanta;
}

private LibrarieDepozit(int numarCarte, String denumire, float pret) {
	super();
	this.numarCarti = numarCarte;
	this.denumire = denumire;
	this.pret = pret;
}
@Override
public String toString() {
	return "LibrarieManager [numarCarti=" + numarCarti + ", denumire=" + denumire + ", pret=" + pret + "]";
}
public void setNumarCarte(int numarCarte) {
	this.numarCarti = numarCarte;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
public void setPret(float pret) {
	this.pret = pret;
}


}

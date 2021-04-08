package ro.ase.cts.facade.clase;

public class Bilet {
private String nume;
private String loc;
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public Bilet(String nume, String loc) {
	super();
	this.nume = nume;
	this.loc = loc;
}


}

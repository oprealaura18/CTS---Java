package ro.ase.cts.state.clase;

public class Masa {

	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.setNrMasa(nrMasa);
		this.setStare(new Libera());
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezerva() {
	Rezervata rezervata = new Rezervata();
	rezervata.schimbaStarea(this);
	}
	
	public void ocupa() {
		Ocupata ocupata = new Ocupata();
		ocupata.schimbaStarea(this);
	}
	public void elibereaza() {
		Libera libera = new Libera();
		libera.schimbaStarea(this);
		}
	
	
}

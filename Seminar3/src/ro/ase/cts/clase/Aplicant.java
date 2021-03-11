package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void AfisareStatutProiect(Proiect proiect){
		boolean esteAcceptat= punctaj>proiect.getPragPunctaj();
		StringBuilder str = new StringBuilder();
		str.append("Aplicantul ").append(nume).append(" ").append(prenume);
		str.append(esteAcceptat ? " a fost acceptat." :" nu a fost acceptat." );
		
		System.out.println(str);
		}
	
	
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	
	

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		
	}


	public String[] getDenumireProiect() {
		return denumireProiect;
	}
	
	public void setDenumireProiect(String[] denumireProiect) {
		
	}
	
	public void setDenumiriProiecte(int nrProiecte,String[] denumiriProiecte) {
		
		this.nr_proiecte = nrProiecte;
		this.denumireProiect = denumiriProiecte;
		
		
	}
	
	public abstract float getSumaFinantata();
	@Override
	public String toString() {
		return " nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nr_proiecte=" + nr_proiecte + ", denumireProiect=" + Arrays.toString(denumireProiect) ;
	}
	
	
}

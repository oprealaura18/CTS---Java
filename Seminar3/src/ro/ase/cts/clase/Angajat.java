package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata = 10; 
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		StringBuilder str= new StringBuilder("Angajatul :");
		str.append(super.toString()).append(" Ocupatie ").append(ocupatie).append(" Salariu").append(salariu);
	return str.toString();
	}
	
	

	public  static void setSumaFinantata(float sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}
	
	public static float getFinantare() {
		// TODO Auto-generated method stub
		return sumaFinantata;
	}
	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return sumaFinantata;
	}
	
}

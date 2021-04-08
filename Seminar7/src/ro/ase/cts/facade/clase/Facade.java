package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean sePermiteAccesulPeStadion(Persoana persoana, Bilet bilet) {
		if(persoana.getNume().equals(bilet.getNume())) {
			if(!Politie.esteUrmarita(persoana)) {
				if(!BazaDeDateHuligani.esteInListaDeHuligani(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}

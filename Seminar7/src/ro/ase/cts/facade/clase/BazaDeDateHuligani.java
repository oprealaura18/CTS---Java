package ro.ase.cts.facade.clase;

public class BazaDeDateHuligani {
	public static boolean esteInListaDeHuligani(Persoana persoana)
	{
		return Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0;

	}
}

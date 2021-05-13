package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract{
 private String numeSpectator;
 
	public Spectator(String numeSpectator) {
	super();
	this.numeSpectator = numeSpectator;
}

	@Override
	void asezareCoada() {
		System.out.println(numeSpectator + " s-a asezat la coada ");
		
	}

	@Override
	void prezintaBilet() {
		System.out.println(numeSpectator + " a prezentat bilet ");
		
	}

	@Override
	void realizareControlCorporal() {
		System.out.println(numeSpectator + " realizeaza control corporal ");
		
	}

	@Override
	void intraPeStadion() {
		System.out.println(numeSpectator + " intra pe stadion ");
		
	}

	@Override
	void ocupaLoc() {
		System.out.println(numeSpectator + " ocupa loc ");
		
	}

}

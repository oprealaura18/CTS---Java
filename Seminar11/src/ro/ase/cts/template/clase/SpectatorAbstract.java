package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	abstract void asezareCoada();
	abstract void prezintaBilet();
	abstract void realizareControlCorporal();
	abstract void intraPeStadion();
	abstract void ocupaLoc();
	
	public final void intrareSpectatorStadion() {
		asezareCoada();
		prezintaBilet();
		realizareControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
}

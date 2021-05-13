package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVip;

public class Program {

	public static void main(String[] args) {
		SpectatorAbstract spectator = new Spectator("Gigel");
		
		spectator.intrareSpectatorStadion();
		
		SpectatorAbstract spectatorVip = new SpectatorVip("Ionescu");
		
		spectatorVip.intrareSpectatorStadion();

	}

}

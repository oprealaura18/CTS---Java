package ro.ase.cts.command.clase;

public class ComandaRetragere extends Command{

	public ComandaRetragere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().retragere(super.getSuma());
		
	}

}

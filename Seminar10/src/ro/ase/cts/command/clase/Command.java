package ro.ase.cts.command.clase;

public abstract class Command {

	private ContBancar cont;
	private float suma;
	
	
	
	public Command(ContBancar cont, float suma) {
		super();
		this.cont = cont;
		this.suma = suma;
	}



	public ContBancar getCont() {
		return cont;
	}



	public float getSuma() {
		return suma;
	}



	public abstract void executa();
}

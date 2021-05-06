package ro.ase.cts.chain.clase;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String detinator) {
		super(detinator, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Nu se poate realiza plata!");
		
	}

}

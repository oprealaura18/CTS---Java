package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata{

	@Override
	public void achita(float suma) {
		System.out.println("S-a actitat cu cardul suma de "+ suma);
		
	}

}

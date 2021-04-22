package ro.ase.cts.strategy.clase;

public class Cash implements ModalitatePlata {
	
	private float sold;
	
	

	public Cash(float sold) {
		super();
		this.sold = sold;
	}



	@Override
	public void achita(float suma) {
		
		if (suma <= sold) {
			System.out.println("S-a achitat cash " +suma + "lei");
			sold -= suma;
		}else
			System.out.println("Nu sunt fonduri suficiente");
		
		
	}

}

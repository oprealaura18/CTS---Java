package ro.ase.cts.state.clase;

public class Rezervata implements Stare{

	@Override
	public void schimbaStarea(Masa masa) {
		if(masa.getStare() instanceof Libera) {
			System.out.println("Ati rezervat masa " + masa.getNrMasa());
			masa.setStare(this);
		}else
		{
			System.out.println("Nu poate sa fie rezervata masa cu codul "+masa.getNrMasa());
		}
		
	}

}

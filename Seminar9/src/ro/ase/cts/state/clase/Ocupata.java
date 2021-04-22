package ro.ase.cts.state.clase;

public class Ocupata implements Stare{

	@Override
	public void schimbaStarea(Masa masa) {
		if(!(masa.getStare() instanceof Ocupata)) {
			System.out.println("Ati ocupat masa numarul "+ masa.getNrMasa());
			masa.setStare(this);
		}else 
		{
			System.out.println("Masa este deja ocupata sau rezervata");
		}
		
	}

}

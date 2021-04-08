package ro.ase.cts.adapter.clase;

//obiect
public class AdapterBilet implements BiletOnline{

	private Bilet bilet;
	


	public AdapterBilet(Bilet bilet) {
		super();
		this.bilet = bilet;
	}


	@Override
	public void vindeBilet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		
	}

}
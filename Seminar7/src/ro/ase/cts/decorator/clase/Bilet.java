package ro.ase.cts.decorator.clase;

public class Bilet implements BiletAbstract {
private String numeGazda;
private String numeOaspeti;
private String numeClient;
	
	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		System.out.println(numeClient +"are bilet la meciul "+numeGazda+ " care joaca cu "+ numeOaspeti);
	}

	public Bilet(String numeGazda, String numeOaspeti, String numeClient) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.numeClient = numeClient;
	}

	public String getNumeGazda() {
		return numeGazda;
	}

	public String getNumeOaspeti() {
		return numeOaspeti;
	}

	public String getNumeClient() {
		return numeClient;
	}

}

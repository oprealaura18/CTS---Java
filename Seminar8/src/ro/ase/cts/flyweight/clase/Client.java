package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract {

	private String numeClient;
	private String nrTelefon;
	private String adresaEmail;
	

	public Client(String numeClient, String nrTelefon, String adresaEmail) {
		super();
		this.numeClient = numeClient;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", adresaEmail=");
		builder.append(adresaEmail);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void afiseazaInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+rezervare.toString());
	}
	
	
}

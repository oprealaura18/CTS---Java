package ro.ase.cts.observer.clase;

public class ClientFidel implements Observer{
	private String numeClient;
	
	

	public ClientFidel(String numeClient) {
		super();
		this.numeClient = numeClient;
	}



	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(numeClient + " a primit mesajul : " +mesaj);
	}

}

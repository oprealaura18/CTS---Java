package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {

	private Map<String, FlyweightAbstract> clienti;

	public FabricaFlyweight() {
		this.clienti = new HashMap<String, FlyweightAbstract>();
	}
	
	public FlyweightAbstract getClient(String nrTel) {
		Client client = (Client) clienti.get(nrTel);
		if(client == null)
		{
			client = new Client("X",nrTel,"x@gmail.com");
			clienti.put(nrTel, client);
		}
		return client;
	}
}
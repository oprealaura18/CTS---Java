package ro.ase.cts.proxy.clase;
public class OperatorRezervare implements IOperatorRezervare{

	private String numeLocatie;
	@Override
	public void rezerva(int nrPersoane) {
		System.out.println("Ati rezervat pentru "+nrPersoane+" persoane la "+numeLocatie);
	}
	public OperatorRezervare(String numeLocatie) {
		super();
		this.numeLocatie = numeLocatie;
	}
	public String getNumeLocatie() {
		return numeLocatie;
	}

}
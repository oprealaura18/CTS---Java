package ro.ase.cts.proxy.clase;
public class Proxy implements IOperatorRezervare{

	private OperatorRezervare operatorRezervare;
	private int nrMinimPersoane;
	@Override
	public void rezerva(int nrPersoane) {
		if(nrPersoane > nrMinimPersoane)
			operatorRezervare.rezerva(nrPersoane);
		else {
			System.out.println("Nu se poate realiza rezervarea pentru "+nrPersoane);;
		}
	}
	public Proxy(OperatorRezervare operatorRezervare, int nrMinimPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinimPersoane = nrMinimPersoane;
	}

}
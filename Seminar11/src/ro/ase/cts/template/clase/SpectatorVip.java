package ro.ase.cts.template.clase;

public class SpectatorVip extends SpectatorAbstract{
	private String numeVip;
	
	

	public SpectatorVip(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	void asezareCoada() {
		System.out.println(numeVip + " se prezinta direct la usa");
		
	}

	@Override
	void prezintaBilet() {
		System.out.println(numeVip + " prezinta bilet VIP");
		
	}

	@Override
	void realizareControlCorporal() {
		System.out.println(numeVip + " realizeaza control Vip");
		
	}

	@Override
	void intraPeStadion() {
		System.out.println(numeVip + " intra in tribuna Vip");
		
	}

	@Override
	void ocupaLoc() {
		System.out.println(numeVip + " ocupa loc in loja");
		
	}

}

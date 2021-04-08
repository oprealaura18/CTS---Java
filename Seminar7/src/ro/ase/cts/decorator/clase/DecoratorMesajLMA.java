package ro.ase.cts.decorator.clase;

public class DecoratorMesajLMA extends DecoratorAbstract {

	public DecoratorMesajLMA(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rezervaBilet() {
		System.out.println("La multi ani!");
	}
}

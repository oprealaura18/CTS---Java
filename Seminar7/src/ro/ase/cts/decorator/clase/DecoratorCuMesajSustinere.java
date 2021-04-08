package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajSustinere extends DecoratorAbstract{

	public DecoratorCuMesajSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
	}

	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println(" Sustinem echipa gazda "+ ((Bilet)super.getBiletAbstract()).getNumeGazda());
	}
}

package ro.ase.cts.simplefactory.clase;

public class Factory {

	public static Jucator creatJucator(TipJucator tipJucator, String nume) throws Exception
	{
		switch (tipJucator) {
		case Portar:
			return new Portar(nume);
			
		case Fundas:
			return new Fundas(nume);
		case Atacant:
			return new Atacant(nume);
		default:
			throw new Exception("Nu am gasit tipul!!!");
		}
		
	}
}

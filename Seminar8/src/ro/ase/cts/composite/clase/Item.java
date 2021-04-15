package ro.ase.cts.composite.clase;

public class Item implements ComponentaMeniu{

	private String numeItem;
	
	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugareNod(ComponentaMeniu componenta) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componenta) {
		throw new IllegalArgumentException("Metoda nu este implementata");
		
	}

	@Override
	public void afiseazaInformatii() {
System.out.println("Nume item " +numeItem);
		
	}

	@Override
	public ComponentaMeniu getComponenta(int index) {
		throw new IllegalArgumentException("Metoda nu este implementata");
	}

}

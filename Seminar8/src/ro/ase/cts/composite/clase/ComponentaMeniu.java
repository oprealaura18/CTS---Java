package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	void adaugareNod(ComponentaMeniu componenta);
	void stergeNod(ComponentaMeniu componenta);
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;
}

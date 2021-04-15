package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	
	private String nume;
	private List<ComponentaMeniu> listaComponente;
	
	
	
	
	public Sectiune(String nume) {
		super();
		this.nume = nume;
		this.listaComponente = new ArrayList<ComponentaMeniu>();
	}

	@Override
	public void adaugareNod(ComponentaMeniu componentaMeniu) {
		listaComponente.add(componentaMeniu);
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		listaComponente.remove(componentaMeniu);
		
	}

	@Override
	public ComponentaMeniu getComponenta(int pozitie) throws Exception {
		if(pozitie>=0&&pozitie<listaComponente.size())
		return listaComponente.get(pozitie);
		else
			throw new Exception("index invalid");
		
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea "+nume);
		for(ComponentaMeniu componenta:listaComponente) {
			componenta.afiseazaInformatii();
		}
		
	}

}
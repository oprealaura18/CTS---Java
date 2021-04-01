package ro.ase.cts.builder.clase;

public class RezervareBuilder implements BuilderAbstract{
	private Rezervare rezervare;

	@Override
	public Rezervare build() {
	
		return rezervare;
	}

	public RezervareBuilder() {
		super();
		rezervare = new Rezervare(0, false, false, false, false, " ");
	}
	
public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare); 
		return this;
	}
public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
	rezervare.setAreMancareInclusa(areMancareInclusa);
	return this;
}

public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
	rezervare.setAreBauturaInclusa(areBauturaInclusa);
	return this;
}

public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
	rezervare.setAreScaunErgonomic(areScaunErgonomic);
	return this;
}

public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
	rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
	return this;
}

public RezervareBuilder setGenMuzical(String genMuzical) {
	rezervare.setGenMuzical(genMuzical);
	return this;
}
}

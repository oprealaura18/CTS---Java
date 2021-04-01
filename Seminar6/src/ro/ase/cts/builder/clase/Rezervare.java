package ro.ase.cts.builder.clase;

public class Rezervare {
 private int codRezervare;
 private boolean areMancareInclusa;
 private boolean areBauturaInclusa;
 private boolean areScaunErgonomic;
 private boolean areMuzicaAmbientala;
 private String genMuzical;


public void setCodRezervare(int codRezervare) {
	this.codRezervare = codRezervare;
}

public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic,
		boolean areMuzicaAmbientala, String genMuzical) {
	super();
	this.codRezervare = codRezervare;
	this.areMancareInclusa = areMancareInclusa;
	this.areBauturaInclusa = areBauturaInclusa;
	this.areScaunErgonomic = areScaunErgonomic;
	this.areMuzicaAmbientala = areMuzicaAmbientala;
	this.genMuzical = genMuzical;
}


public void setAreMancareInclusa(boolean areMancareInclusa) {
	this.areMancareInclusa = areMancareInclusa;
}

public void setAreBauturaInclusa(boolean areBauturaInclusa) {
	this.areBauturaInclusa = areBauturaInclusa;
}

public void setAreScaunErgonomic(boolean areScaunErgonomic) {
	this.areScaunErgonomic = areScaunErgonomic;
}

public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
	this.areMuzicaAmbientala = areMuzicaAmbientala;
}

public void setGenMuzical(String genMuzical) {
	this.genMuzical = genMuzical;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Rezervare [codRezervare=");
	builder.append(codRezervare);
	builder.append(", areMancareInclusa=");
	builder.append(areMancareInclusa);
	builder.append(", areBauturaInclusa=");
	builder.append(areBauturaInclusa);
	builder.append(", areScaunErgonomic=");
	builder.append(areScaunErgonomic);
	builder.append(", areMuzicaAmbientala=");
	builder.append(areMuzicaAmbientala);
	builder.append(", genMuzical=");
	builder.append(genMuzical);
	builder.append("]");
	return builder.toString();
}


}

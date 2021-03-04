package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {
	
	protected String fileName;
	
	
	
	public Reader(String fileName) {
		super();
		this.fileName = fileName;
	}



	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
		
	

}

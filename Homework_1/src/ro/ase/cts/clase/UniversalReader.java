package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.readers.Reader;

public class UniversalReader {

	public static List<Aplicant> readAplicants(Reader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants();
		
	}

}

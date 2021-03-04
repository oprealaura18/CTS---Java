package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.readers.Reader;

public class UniversalReader {

	//punct de legatura catre readere
	
	public static List<Aplicant> readAplicants(Reader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readAplicants();
		
	}

}

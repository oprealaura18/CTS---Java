package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.readers.AngajatReader;

public class Program {

	public static void main(String[] args) {
		System.out.println(Student.getFinantare());
		System.out.println(Angajat.getFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = UniversalReader.readAplicants(new AngajatReader("angajati.txt"));
			Proiect proiect = new Proiect(80);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				aplicant.AfisareStatutProiect(proiect);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

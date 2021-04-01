package ro.ase.cts.builder.program;



import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Builder1");
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		Rezervare rezervare1 = rezervareBuilder.setAreBauturaInclusa(true).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzical("rock").build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		
		//Builder v2
		System.out.println("Builder2");
				BuilderRezervareV2 builder2 = new BuilderRezervareV2();
				Rezervare rezervare3 = builder2.setAreBauturaInclusa(true).build();
				Rezervare rezervare4 = builder2.setAreMancareInclusa(true).build();

				System.out.println(rezervare3);
				System.out.println(rezervare4);
	}

}

package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import dubluri.StudentDummy;
import dubluri.StudentFake;
import tests.categorii.TesteGetPromovabilitate;

public class TestGrupaWithFake {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for(int i=0; i< 8 ; i++) {
			StudentFake s = new StudentFake();
			s.setValoareAreRestante(false);
			grupa.adaugaStudent(s);
			
		}
		for(int i=0; i< 2 ; i++) {
			StudentFake s = new StudentFake();
			s.setValoareAreRestante(true);
			grupa.adaugaStudent(s);
			
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	}
	
	
	

}

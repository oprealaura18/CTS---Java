package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;
import tests.categorii.TesteUrgente;

public class TestGrupaWithDummy {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Category(TesteUrgente.class)
	public void testAdaugaStudenti() {
		IStudent student = new StudentDummy();
		Grupa grupa = new Grupa(1076);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

}

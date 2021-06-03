package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;

public class TestGrupaWithStub {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPromovabilitate() {
		IStudent student = new StudentDummy();
		Grupa grupa = new Grupa(1076);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}

}

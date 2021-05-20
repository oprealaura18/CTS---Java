package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume ="Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
		}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(2);
		student.adaugaNota(10);
		assertTrue("Studentul care are restanta este marcat ca neavand restanta ",student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(7);
		student.adaugaNota(10);
		assertFalse("Studentul care nu are restanta este marcat ca avand restanta ",student.areRestante());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(7);
		
		assertEquals(1, student.getNote().size());
	}
	
	
	@Test
	public void testAdaugareNotaCorecta() {
		Student student = new Student();
		int nota = 7;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testCalculeazaMedia() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		assertEquals(5.5, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		
		student.adaugaNota(8);
		assertEquals(8, student.calculeazaMedie(), 0.01);
	}
	
	
	@Test
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		int nota = 15;
		try {
			student.adaugaNota(nota);
			fail("Nu trebuia sa ajunga aici. Metoda trebuia sa arunce o exceptie");
		} catch(IllegalArgumentException err) {
			
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJU4() {
		Student student = new Student();
		int nota = 15;
		student.adaugaNota(nota);
	}

	}



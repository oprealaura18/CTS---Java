package tests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupa {


	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundarySup() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		Grupa grupa = new Grupa(1200);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic() {
		Grupa grupa = new Grupa(900);
		
	}
	
	@Test(timeout = 500)
	public void testConstuctorPerformance() {
		Grupa grupa = new Grupa(1076);
		
	}
	
	
	@Test
	public void testConstuctorExistance() {
		Grupa grupa = new Grupa(1076);
		assertNotNull(grupa.getStudenti());
		
	}
	
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for (int i =0; i< 7 ; i++) {
			Student student = new Student("Laura");
			student.adaugaNota(6);
			student.adaugaNota(2);
			student.adaugaNota(9);
			student.adaugaNota(3);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		
		for (int i =0; i< 5 ; i++) {
			Student student = new Student("Anca");
			student.adaugaNota(6);
			student.adaugaNota(10);
			student.adaugaNota(9);
			student.adaugaNota(9);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.41, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testPromovabilitateBoundryInf() {
		Grupa grupa = new Grupa(1076);
		for (int i =0; i< 5 ; i++) {
			Student student = new Student("Anca");
			student.adaugaNota(3);
			student.adaugaNota(2);
			student.adaugaNota(6);
			student.adaugaNota(4);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.00, grupa.getPromovabilitate(), 0.01);
		
	}
	
	@Test
	public void testPromovabilitateBoundrySup() {
		Grupa grupa = new Grupa(1076);
		for (int i =0; i< 5 ; i++) {
			Student student = new Student("Anca");
			student.adaugaNota(10);
			student.adaugaNota(9);
			student.adaugaNota(6);
			student.adaugaNota(6);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPromovabilitateCross() {
		Grupa grupa = new Grupa(1076);
		grupa.getPromovabilitate();
	}
	

	
	
}


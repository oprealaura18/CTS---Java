package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;

public class TestGrupa {

	@Before
	public void setUp() throws Exception {
	}

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
	
	
	
	
}

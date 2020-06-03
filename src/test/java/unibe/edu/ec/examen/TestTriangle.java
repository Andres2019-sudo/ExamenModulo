package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

	private Triangle triangle;

	@Before
	public void before() {
		this.triangle= new Triangle(3);
	}

	@Test
	public void testcalculatePerimeter() {
		assertEquals(9, triangle.calculatePerimeter(), 0.10);
	}

}

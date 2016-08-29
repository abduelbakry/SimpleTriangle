package shape.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import shape.Triangle;

public class TriangleTest {

	@Test
	public final void testValidate() {
		// Null list
		assertFalse(Triangle.validate(null));
		// empty list 
		assertFalse(Triangle.validate(new ArrayList()));
		// invalid number of triangle sides
		ArrayList sides = new ArrayList();
		sides.add(new Double(1));
		sides.add(new Double(1));
		assertFalse(Triangle.validate(sides));
		
		//invalid side values
		sides.add(null);
		assertFalse(Triangle.validate(sides));
		
		sides = new ArrayList();
		sides.add(new Double(1));
		sides.add(new Double(1));
		sides.add(new Double(2));
		assertFalse(Triangle.validate(sides));
		
	}

	@Test
	public final void testGetTriangleType() {
		//
	}

}

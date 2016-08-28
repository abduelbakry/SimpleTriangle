package shape.start;

import java.util.ArrayList;
import java.util.List;

import shape.Shape;
import shape.Triangle;

/**
 * 
 */

/**
 * @author aelbakry
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double sideA = 3.5;
		double sideB = 2;
		double sideC = 3;

		List<Double> sides = new ArrayList<Double>();
		sides.add(sideA);
		sides.add(sideB);
		sides.add(sideC);

		Shape triangle = null;

		if (Triangle.validate(sides)) { 
			triangle = new Triangle();
			triangle.setShapeSides(sides);
			String triangleType = ((Triangle) triangle).getTriangleType();
			System.out.println(triangleType);

		} else {
			System.err.println("Not valid triangle dimensions");
		}

	}

}

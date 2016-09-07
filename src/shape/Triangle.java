/**
 * 
 */
package shape;

import java.util.List;

/**
 * @author aelbakry
 *
 */
public class Triangle implements Shape {

	private List<Double> shapeSides;

	public static final int NUM_OF_SIDES = 3;

	public static final String EQUILATERAL_TYPE = "Equilateral";
	public static final String ISOSCELES_TYPE = "Isosceles";
	public static final String SCALENE_TYPE = "Scalene";

	public static boolean validate(List<Double> sides) {

		// Triangle has 3 sides
		if (Shape.validate(sides) && sides.size() == NUM_OF_SIDES) {
			Double sideA = sides.get(0);
			Double sideB = sides.get(1);
			Double sideC = sides.get(2);
			// Nullpointer check
			if (null != sideA && null != sideB && null != sideC) {
				// Valid Triangle dimensions
				if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * @return the triangleSides
	 */
	public List<Double> getShapeSides() {
		return shapeSides;
		
	}

	/**
	 * @param triangleSides
	 *            the triangleSides to set
	 */
	public void setShapeSides(List<Double> shapeSides) {
		this.shapeSides = shapeSides;
	}

	@Override
	public List<Double> calculateAngles(List<Double> sides) {
		sides.forEach(System.out::println);
		return null;
	}

	public String getTriangleType() {
		Double sideA = shapeSides.get(0);
		Double sideB = shapeSides.get(1);
		Double sideC = shapeSides.get(2);
		if (sideA.doubleValue() == sideB.doubleValue() && sideA.doubleValue() == sideC.doubleValue())
			return EQUILATERAL_TYPE;
		else if (sideA.doubleValue() == sideB.doubleValue() || sideA.doubleValue() == sideC.doubleValue()
				|| sideB.doubleValue() == sideC.doubleValue())
			return ISOSCELES_TYPE;
		else
			return SCALENE_TYPE;
	}
}

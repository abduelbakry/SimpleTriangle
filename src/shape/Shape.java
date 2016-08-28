package shape;

import java.util.List;

public interface Shape {
	public static boolean validate(List<Double> sides) {
		if (null != sides && sides.size() > 0)
			return true;
		return false;
	}

	public List<Double> calculateAngles(List<Double> sides);

	public void setShapeSides(List<Double> sides);
}

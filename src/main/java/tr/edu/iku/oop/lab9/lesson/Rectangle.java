package tr.edu.iku.oop.lab9.lesson;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle() {
		length = 1;
		width = 1;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getArea(String unitType) {
		if (unitType.equals("metric"))
			return length * width;
		else if (unitType.equals("imperial")) {
			// convert cm to inch
			return (length / 2.54) * (width / 2.54);
		} else {
			System.out.println("unknown unitType choose metric or imperial");
			return 0.0;
		}
	}

	public double getCircumference() {
		return (length + width) * 2;
	}

	public double getCircumference(String unitType) {
		if (unitType.equals("metric"))
			return (length + width) * 2;
		else if (unitType.equals("imperial")) {
			// convert cm to inch
			return (length + width) / 2.54 * 2;
		} else {
			System.out.println("unknown unitType choose metric or imperial");
			return 0.0;
		}
	}
}

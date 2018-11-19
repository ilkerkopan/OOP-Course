package tr.edu.iku.oop.lab9.lesson;

public class Circle {
	private final double PI = 3.14;
	private double radius;

	public Circle() {
		radius = 1;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}

	public double getArea(String unitType) {
		if (unitType.equals("metric"))
			return radius * radius * PI;
		else if (unitType.equals("imperial")) {
			// convert cm to inch
			return radius / 2.54 * radius / 2.54 * PI;
		} else {
			System.out.println("unknown unitType choose metric or imperial");
			return 0.0;
		}
		
	}

	public double getCircumference() {
		return 2 * radius * PI;
	}

	public double getCircumference(String unitType) {
		if (unitType.equals("metric"))
			return 2 * radius * PI;
		else if (unitType.equals("imperial")) {
			// convert cm to inch
			return 2 * radius / 2.54 * PI;
		} else {
			System.out.println("unknown unitType choose metric or imperial");
			return 0.0;
		}
	}
}

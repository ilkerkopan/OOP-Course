package tr.edu.iku.oop.lesson7.shape;

public class Circle {
	private double radius = 1.0;
	private String color = "red";

	public Circle(double radius, String color) {
		this.color = color;
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
	
	public String getColor() {
		return color;
	}
}

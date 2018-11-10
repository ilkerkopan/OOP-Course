package tr.edu.iku.oop.lab7.lesson;

public class Circle {
	private final double PI = 3.14;
	private double radius;
	private String color;
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}

	public String getColor() {
		return color;
	}
}

package tr.edu.iku.oop.lesson7.shape;

public class Rectangle {
	private int length;
	private int width;
	private String color;
	
	public Rectangle(int length, int width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}
	
	public int getArea() {
		return length * width;
	}

	public String getColor() {
		return color;
	}
}

package tr.edu.iku.oop.lab7.lesson;

public class Shapes {

	public static void main(String[] args) {
		Circle myFirstCircle = new Circle(3.0, "red");
		System.out.println("Color of the circle: " + myFirstCircle.getColor());
		System.out.println("Area of the circle: " + myFirstCircle.getArea());
		
		Circle mySecondCircle = new Circle(4.0, "white");
		System.out.println("Color of the circle: " + mySecondCircle.getColor());
		System.out.println("Area of the circle: " + mySecondCircle.getArea());
		
		
		Rectangle myRectangle = new Rectangle(4, 10, "yellow");
		System.out.println("Color of the rectangle: "+myRectangle.getColor());
		System.out.println("Area of the rectangle: " + myRectangle.getArea());
	}

}

package tr.edu.iku.oop.lab9.lesson;

public class Shapes {

	public static void main(String[] args) {
		Circle myFirstCircle = new Circle(3.0);
		System.out.println("Area of the circle: " + myFirstCircle.getArea());
		System.out.println("Area of the circle in inches: " + myFirstCircle.getArea("imperial"));
		System.out.println("Circumference of the circle: " + myFirstCircle.getArea());
		System.out.println("Circumference of the circle in inches: " + myFirstCircle.getArea("imperial"));
		
		Circle mySecondCircle = new Circle();
		System.out.println("Area of the circle: " + mySecondCircle.getArea());
		System.out.println("Area of the circle in inches: " + mySecondCircle.getArea("imperial"));
		System.out.println("Circumference of the circle: " + mySecondCircle.getArea());
		System.out.println("Circumference of the circle in inches: " + mySecondCircle.getArea("imperial"));
		
		
		Rectangle myRectangle = new Rectangle(4, 10);
		System.out.println("Area of the rectangle: " + myRectangle.getArea());
		System.out.println("Area of the rectangle in inches: " + myRectangle.getArea("imperial"));
		System.out.println("Circumference of the rectangle: " + myRectangle.getArea());
		System.out.println("Circumference of the rectangle in inches: " + myRectangle.getArea("imperial"));
		
	}

}

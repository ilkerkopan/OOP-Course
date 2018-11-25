package tr.edu.iku.oop.lab10.quiz2;

public class Car extends Vehicle {

	public Car(String licenceNumber) {
		super(licenceNumber, "white", "Honk Honk", 4, "Car");
	}

	public Car(String licenceNumber, String color) {
		super(licenceNumber, color, "Honk Honk", 4, "Car");
	}
}

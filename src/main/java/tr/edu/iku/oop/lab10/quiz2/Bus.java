package tr.edu.iku.oop.lab10.quiz2;

public class Bus extends Vehicle {

	public Bus(String licenceNumber) {
		super(licenceNumber, "yellow", "Whoop Whoop", 24, "Bus");
	}

	public Bus(String color, String licenceNumber) {
		super(licenceNumber, color, "Whoop Whoop", 24, "Bus");
	}

}

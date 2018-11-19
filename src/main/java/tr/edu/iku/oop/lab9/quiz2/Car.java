package tr.edu.iku.oop.lab9.quiz2;

public class Car {
	private final int SEAT_COUNT = 4;
	private final String HORN = "Honk Honk";
	private String color;
	private String licenceNumber;
	
	public Car(String licenceNumber) {
		this.licenceNumber = licenceNumber;
		color = "white";
	}

	public Car(String licenceNumber, String color) {
		this.licenceNumber = licenceNumber;
		this.color = color;
	}
	
	public void forward() {
		System.out.println(color + " Car with licence number " + licenceNumber + " going at 30km/h");
	}

	public void forward(int speed) {
		System.out.println(color + " Car with licence number " + licenceNumber + " going at " + speed + "km/h");
	}
	
	public String horn() {
		return HORN;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSeatCount() {
		return SEAT_COUNT;
	}
}

package tr.edu.iku.oop.lab9.quiz2;

public class Motorcycle {
	private final int SEAT_COUNT = 2;
	private final String HORN = "Bip Bip";
	private String color;
	private String licenceNumber;
	
	public Motorcycle(String licenceNumber) {
		this.licenceNumber = licenceNumber;
		color = "black";
	}
	
	public Motorcycle(String licenceNumber, String color) {
		this.licenceNumber = licenceNumber;
		this.color = color;
	}
	
	public void forward() {
		System.out.println(color + " Motorcycle with licence number " + licenceNumber + " going at 30km/h");
	}

	public void forward(int speed) {
		System.out.println(color + " Motorcycle with licence number " + licenceNumber + " going at " + speed + "km/h");
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

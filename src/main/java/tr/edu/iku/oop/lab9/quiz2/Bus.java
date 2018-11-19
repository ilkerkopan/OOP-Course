package tr.edu.iku.oop.lab9.quiz2;

public class Bus {
	private final int SEAT_COUNT = 24;
	private final String HORN = "Whoop Whoop";
	private String color;
	private String licenceNumber;

	public Bus(String licenceNumber) {
		this.color = "yellow";
		this.licenceNumber = licenceNumber;
	}

	public Bus(String color, String licenceNumber) {
		this.color = color;
		this.licenceNumber = licenceNumber;
	}

	public void forward() {
		System.out.println(color + " Bus with licence number " + licenceNumber + " going at 30km/h");
	}

	public void forward(int speed) {
		System.out.println(color + " Bus with licence number " + licenceNumber + " going at " + speed + "km/h");
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

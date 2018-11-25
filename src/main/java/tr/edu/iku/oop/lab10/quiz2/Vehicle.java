package tr.edu.iku.oop.lab10.quiz2;

public class Vehicle {
	int seatCount;
	String horn;
	String color;
	String licenceNumber;
	String vehicleType;

	public Vehicle(String licenceNumber, String color, String horn, int seatCount, String vehicleType) {
		this.licenceNumber = licenceNumber;
		this.color = color;
		this.horn = horn;
		this.seatCount = seatCount;
		this.vehicleType = vehicleType;
	}

	public void forward() {
		System.out.println(color + " " + vehicleType + " with licence number " + licenceNumber + " going at 30km/h");
	}

	public void forward(int speed) {
		System.out.println(color + " " + vehicleType + " Bus with licence number " + licenceNumber + " going at "
				+ speed + "km/h");
	}

	public String horn() {
		return horn;
	}
	
	public String getType() {
		return vehicleType;
	}

	public String getColor() {
		return color;
	}

	public int getSeatCount() {
		return seatCount;
	}
}

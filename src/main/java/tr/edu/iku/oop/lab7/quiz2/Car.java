package tr.edu.iku.oop.lab7.quiz2;

public class Car {
	private final int SEAT_COUNT = 4;
	private final String HORN = "Honk Honk";
	private String color;
	
	public Car(String color) {
		this.color = color;
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

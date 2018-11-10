package tr.edu.iku.oop.lab7.quiz2;

public class Motorcycle {
	private final int SEAT_COUNT = 2;
	private final String HORN = "Bip Bip";
	private String color;
	
	public Motorcycle(String color) {
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

package tr.edu.iku.oop.lab7.quiz2;

public class Bus {
	private final int SEAT_COUNT = 24;
	private final String HORN = "Whoop Whoop";
	private String color;
	
	public Bus(String color) {
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

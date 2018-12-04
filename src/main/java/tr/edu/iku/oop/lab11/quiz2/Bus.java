package tr.edu.iku.oop.lab11.quiz2;

public class Bus extends Vehicle {

	public Bus(String licenceNumber) {
		super(licenceNumber, "yellow", "Whoop Whoop", 24, "Bus");
	}

	public Bus(String color, String licenceNumber) {
		super(licenceNumber, color, "Whoop Whoop", 24, "Bus");
	}

	@Override
	public void print() {
		System.out.println("        __");
		System.out.println(".-----------------------'  |");
		System.out.println("/| _ .---. .---. .---. .---.|");
		System.out.println("|j||||___| |___| |___| |___||");
		System.out.println("|=|||=======================|");
		System.out.println("[_|j||(O)\\__________|(O)\\___]");
	}

}

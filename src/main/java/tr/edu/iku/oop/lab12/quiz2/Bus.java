package tr.edu.iku.oop.lab12.quiz2;

public class Bus extends Vehicle implements Printable{

	public Bus(String licenceNumber) {
		super(licenceNumber, "yellow", "Whoop Whoop", 24, "Bus");
	}

	public Bus(String color, String licenceNumber) {
		super(licenceNumber, color, "Whoop Whoop", 24, "Bus");
	}

	public void print() {
		System.out.println("        __");
		System.out.println(".-----------------------'  |");
		System.out.println("/| _ .---. .---. .---. .---.|");
		System.out.println("|j||||___| |___| |___| |___||");
		System.out.println("|=|||=======================|");
		System.out.println("[_|j||(O)\\__________|(O)\\___]");
	}

}

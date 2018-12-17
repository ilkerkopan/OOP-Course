package tr.edu.iku.oop.lab12.quiz2;

public class Motorcycle extends Vehicle implements Printable{
	
	public Motorcycle(String licenceNumber) {
		super(licenceNumber, "black", "Bip Bip", 2, "Motorcycle");
	}
	
	public Motorcycle(String licenceNumber, String color) {
		super(licenceNumber, color, "Bip Bip", 2, "Motorcycle");
	}

	public void print() {
		System.out.println("   ,");
		System.out.println(".-/c-.,:: ");
		System.out.println("(_)'==(_)");
	}
}

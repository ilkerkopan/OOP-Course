package tr.edu.iku.oop.lab12.quiz2;

public class Car extends Vehicle implements Printable{

	public Car(String licenceNumber) {
		super(licenceNumber, "white", "Honk Honk", 4, "Car");
	}

	public Car(String licenceNumber, String color) {
		super(licenceNumber, color, "Honk Honk", 4, "Car");
	}

	public void print() {
		System.out.println("		  ______");
		System.out.println("		  /|_||_\\`._");
		System.out.println("		 (   _    _ _\\");
		System.out.println("		 =`-(_)--(_)-'  ");
	}
}

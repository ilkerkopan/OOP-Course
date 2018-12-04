package tr.edu.iku.oop.lab11.quiz2;

public class Car extends Vehicle {

	public Car(String licenceNumber) {
		super(licenceNumber, "white", "Honk Honk", 4, "Car");
	}

	public Car(String licenceNumber, String color) {
		super(licenceNumber, color, "Honk Honk", 4, "Car");
	}

	@Override
	public void print() {
		System.out.println("		  ______");
		System.out.println("		  /|_||_\\`._");
		System.out.println("		 (   _    _ _\\");
		System.out.println("		 =`-(_)--(_)-'  ");
	}
}

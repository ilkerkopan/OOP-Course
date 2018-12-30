package tr.edu.iku.oop.finale;

public class InheritanceTest {
	public static void main(String[] args) {
		Vehicle firstCar = new Car();
		Vehicle vehicle = new Vehicle();
		firstCar.horn();
		vehicle.horn();
		System.out.println("vehicle a is " + Vehicle.a);
		System.out.println("first car b is " + firstCar.b);
		System.out.println("vehicle b is " + vehicle.b);
	}
}

class Vehicle {
	static int a = 0;
	int b;

	public Vehicle() {
		a++;
		b = a;
	}

	public void horn() {
		System.out.println("Honk!");
	}
}

class Car extends Vehicle {
	public void horn() {
		System.out.println("Biiip!");
	}
}
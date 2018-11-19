package tr.edu.iku.oop.lab9.quiz2;

public class Vehicles {

	public static void main(String[] args) {
		Car myFirstCar = new Car("34 AB 123");
		Car mySecondCar = new Car("06 AAA 01", "Red");
		Motorcycle myBike = new Motorcycle("34 NG 001");
		Bus schoolBus = new Bus("34 NG 321");
		
		myFirstCar.forward();
		mySecondCar.forward(60);
		myBike.forward(120);
		schoolBus.forward(40);
		
		System.out.println(myFirstCar.getColor() + " car " + myFirstCar.horn());
		System.out.println(mySecondCar.getColor() + " car " + mySecondCar.horn());
		System.out.println(myBike.getColor() + " motorcycle " + myBike.horn());
		System.out.println(schoolBus.getColor() + " bus " + schoolBus.horn());

		System.out.println(myFirstCar.getColor() + " car has " + myFirstCar.getSeatCount() + " seats.");
		System.out.println(mySecondCar.getColor() + " car has " + mySecondCar.getSeatCount() + " seats.");
		System.out.println(myBike.getColor() + " motorcycle has " + myBike.getSeatCount() + " seats.");
		System.out.println(schoolBus.getColor() + " bus has " + schoolBus.getSeatCount() + " seats.");
	}

}

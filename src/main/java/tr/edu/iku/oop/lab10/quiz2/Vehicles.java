package tr.edu.iku.oop.lab10.quiz2;

public class Vehicles {

	public static void main(String[] args) {
		Vehicle myFirstCar = new Car("34 AB 123");
		Vehicle mySecondCar = new Car("06 AAA 01", "Red");
		Vehicle myBike = new Motorcycle("34 NG 001");
		Vehicle schoolBus = new Bus("34 NG 321");
		
		myFirstCar.forward();
		mySecondCar.forward(60);
		myBike.forward(120);
		schoolBus.forward(40);
		
		System.out.println(myFirstCar.getColor() + " "+myFirstCar.getType()+" " + myFirstCar.horn());
		System.out.println(mySecondCar.getColor() + " car " + mySecondCar.horn());
		System.out.println(myBike.getColor() + " motorcycle " + myBike.horn());
		System.out.println(schoolBus.getColor() + " bus " + schoolBus.horn());

		System.out.println(myFirstCar.getColor() + " car has " + myFirstCar.getSeatCount() + " seats.");
		System.out.println(mySecondCar.getColor() + " car has " + mySecondCar.getSeatCount() + " seats.");
		System.out.println(myBike.getColor() + " motorcycle has " + myBike.getSeatCount() + " seats.");
		System.out.println(schoolBus.getColor() + " bus has " + schoolBus.getSeatCount() + " seats.");
	}

}

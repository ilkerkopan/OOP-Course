package tr.edu.iku.oop.lab7.quiz2;

public class Vehicles {

	public static void main(String[] args) {
		Car myFirstCar = new Car("Black");
		Car mySecondCar = new Car("Red");
		Motorcycle myBike = new Motorcycle("White");
		Bus schoolBus = new Bus("Yellow");
		
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

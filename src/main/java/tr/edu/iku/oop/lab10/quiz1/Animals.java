package tr.edu.iku.oop.lab10.quiz1;

public class Animals {

	public static void main(String[] args) {
		Cat myCat = new Cat("Smokey", "yellow");
		Dog myDog = new Dog("Oscar");
		Dog mySecondDog = new Dog("Rex", "black");
		Duck myDuck = new Duck("Daffy");
		
		myCat.walk();
		myDog.walk(5);
		myDog.talk();
		mySecondDog.walk();
		myDuck.walk(10);

		System.out.println(myCat.getName() + " has " + myCat.getLegCount() + " legs.");
		System.out.println(myDog.getName() + " has " + myDog.getLegCount() + " legs.");
		System.out.println(myDuck.getName() + " has " + myDuck.getLegCount() + " legs.");
	}

}

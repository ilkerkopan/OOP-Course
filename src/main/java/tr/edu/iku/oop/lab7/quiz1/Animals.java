package tr.edu.iku.oop.lab7.quiz1;

public class Animals {

	public static void main(String[] args) {
		Cat myCat = new Cat("Smokey");
		Dog myDog = new Dog("Oscar");
		Dog mySecondDog = new Dog("Rex");
		Duck myDuck = new Duck("Daffy");
		
		System.out.println(myCat.getName() + " says " + myCat.talk());
		System.out.println(myDog.getName() + " says " + myDog.talk());
		System.out.println(myDuck.getName() + " says " + myDuck.talk());
		System.out.println(mySecondDog.getName() + " says " + mySecondDog.talk());

		System.out.println(myCat.getName() + " has " + myCat.getLegCount() + " legs.");
		System.out.println(myDog.getName() + " has " + myDog.getLegCount() + " legs.");
		System.out.println(myDuck.getName() + " has " + myDuck.getLegCount() + " legs.");
	}

}

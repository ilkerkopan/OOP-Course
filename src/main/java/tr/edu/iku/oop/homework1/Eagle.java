package tr.edu.iku.oop.homework1;

public class Eagle extends WildAnimal {

	public Eagle(String name) {
		super(name);
		numberOfLegs = 2;
		numberOfWings = 2;
	}

	public void run() {
		System.out.println(name + " cannot run");
	}

	public void fly() {
		System.out.println(name + " is flying");
	}
}

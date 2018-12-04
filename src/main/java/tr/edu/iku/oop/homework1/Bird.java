package tr.edu.iku.oop.homework1;

public class Bird extends Pet {

	public Bird(String name) {
		super(name);
		numberOfLegs = 2;
		numberOfWings = 2;
	}

	public void talk() {
		System.out.println("chirp");
	}
	
	public void fly() {
		System.out.println(name + " is flying");
	}
	
	public void run() {
		System.out.println(name + " cannot run");
	}
}

package tr.edu.iku.oop.homework1;

public class Animal {
	String name;
	int numberOfLegs;
	int numberOfWings;
	
	public Animal(String name) {
		this.name =name;
		numberOfLegs = 4;
		numberOfWings = 0;
	}
	
	public void fly() {
		System.out.println(name + " cannot fly");
	}
	
	public void run() {
		System.out.println(name + " is running");
	}
	
	public void talk() {
		System.out.println("<Silence>");
	}
}

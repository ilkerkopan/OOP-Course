package tr.edu.iku.oop.lab12.quiz1;

public class Cat extends Animal implements Printable {
	
	public Cat(String name) {
		super(name, "White", 4, "Meow");
	}

	public Cat(String name, String color) {
		super(name, color, 4, "Meow");
	}

	public void print() {
		System.out.println(" /\\_/\\");
		System.out.println("( o.o )");
		System.out.println(" > ^ <");
	}
}

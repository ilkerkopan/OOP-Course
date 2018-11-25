package tr.edu.iku.oop.lab10.quiz1;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name, "White", 4, "Meow");
	}

	public Cat(String name, String color) {
		super(name, color, 4, "Meow");
	}
}

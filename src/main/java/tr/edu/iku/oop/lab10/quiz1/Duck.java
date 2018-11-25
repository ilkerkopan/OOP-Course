package tr.edu.iku.oop.lab10.quiz1;

public class Duck extends Animal {
	public Duck(String name) {
		super(name, "White", 2, "Quack");
	}

	public Duck(String name, String color) {
		super(name, color, 2, "Quack");
	}

}

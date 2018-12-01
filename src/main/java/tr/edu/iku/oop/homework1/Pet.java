package tr.edu.iku.oop.homework1;

public class Pet extends Animal {
	int costOfFeeding;
	
	public Pet(String name) {
		super(name);
	}

	public void feed (int amount) {
		costOfFeeding +=amount;
	}
}

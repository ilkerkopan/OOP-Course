package tr.edu.iku.oop.homework1;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void talk() {
		System.out.println("bark");
	}

	public void walk() {
		System.out.println(name + " walked");
	}

}

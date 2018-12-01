package tr.edu.iku.oop.homework1;

public class Fish extends Pet {

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println(name + " cannot run");
	}

	public void swim() {
		System.out.println(name + " is swimming");
	}
}

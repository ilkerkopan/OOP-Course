package tr.edu.iku.oop.homework1;

public class Cat extends Pet{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void talk() {
		System.out.println("meow");
	}
	
	public void cleanHimself() {
		System.out.println(name + " is clean now");
	}
}

package tr.edu.iku.oop.lesson10.worker;

public class Person {
	String name;
	int birthYear;
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void eat() {
		System.out.println("I am eating..");
	}
	
	public void sleep() {
		System.out.println("I am sleeping..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}

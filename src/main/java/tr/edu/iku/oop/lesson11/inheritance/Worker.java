package tr.edu.iku.oop.lesson11.inheritance;

public class Worker extends Person {
	private int salary;
	
	public Worker(String name, int birthyear, int salary) {
		setName(name);
		setBirthyear(birthyear);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + " salary:" + salary;
	}
	
}

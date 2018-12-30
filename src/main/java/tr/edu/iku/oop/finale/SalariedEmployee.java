package tr.edu.iku.oop.finale;

public class SalariedEmployee extends Employee {
	double salary;

	public SalariedEmployee(String name, int id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
}

package tr.edu.iku.oop.lesson11.employees;

public class SalariedEmployee extends Employee {
	double salary;
	
	public SalariedEmployee(String firstname, String lastname, int ssn, int salary) {
		super(firstname, lastname, ssn);
		this.salary = salary;
	}

	public double calculateEarnings() {
		return salary;
	}
	
	public String toString() {
		return "Salaried Employee: " + firstname + " " + lastname + "\n" 
				+ "social security number: " + ssn + "\n" 
				+ "weekly salary: " + salary;
	}

}

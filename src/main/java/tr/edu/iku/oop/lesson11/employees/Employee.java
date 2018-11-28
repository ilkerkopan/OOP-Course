package tr.edu.iku.oop.lesson11.employees;

public abstract class Employee {
	String firstname, lastname;
	int ssn;
	
	public Employee(String firstname, String lastname, int ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssn = ssn;
	}
	
	public abstract double calculateEarnings();
	
	public String toString() {
		
		return firstname + " " + lastname + "\n" 
				+ "social security number: " + ssn;
	}
}

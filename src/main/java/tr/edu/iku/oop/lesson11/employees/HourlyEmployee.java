package tr.edu.iku.oop.lesson11.employees;

public class HourlyEmployee extends Employee{
	int hourlyWage; 
	int hoursWorked;
	
	public HourlyEmployee(String firstname, String lastname, int ssn, 
			int hourlyWage, int hoursWorked) {
		super(firstname, lastname, ssn);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public double calculateEarnings() {
		if (hoursWorked <= 40) {
			return hoursWorked * hourlyWage;
		} else if (hoursWorked > 40) {
			return (40 * hourlyWage) + ((hoursWorked-40) * hourlyWage * 1.5);
		}
		return 0;
	}
	
	public String toString() {
		return "Hourly Salaried Employee: " + firstname + " " + lastname + "\n" 
				+ "social security number: " + ssn + "\n" 
				+ "hourly wage: " + hourlyWage + "\n"
				+ "hours worked: " + hoursWorked ;
	}
}

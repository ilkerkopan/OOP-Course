package tr.edu.iku.oop.lesson11.employees;

public class BasePlusComissionEmployee extends ComissionEmployee {
	double baseSalary;

	public BasePlusComissionEmployee(String firstname, String lastname, int ssn, double grossSales,
			double comissionRate, double baseSalary) {
		super(firstname, lastname, ssn, grossSales, comissionRate);
		this.baseSalary = baseSalary;
	}

	public double calculateEarnings() {
		return baseSalary + (grossSales * comissionRate);
	}
	
	public String toString() {
		return "Hourly Salaried Employee: " + firstname + " " + lastname + "\n" 
				+ "social security number: " + ssn + "\n" 
				+ "gross sales: " + grossSales + "\n"
				+ "comission rate: " + comissionRate + "\n"
				+ "base salary: " + baseSalary;
	}
}

package tr.edu.iku.oop.lesson11.employees;

public class ComissionEmployee extends Employee {
	double grossSales;
	double comissionRate;
	
	public ComissionEmployee(String firstname, String lastname, int ssn,
			double grossSales, double comissionRate) {
		super(firstname, lastname, ssn);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}

	public double calculateEarnings() {
		return grossSales * comissionRate;
	}
	
	public String toString() {
		return "Hourly Salaried Employee: " + firstname + " " + lastname + "\n" 
				+ "social security number: " + ssn + "\n" 
				+ "gross sales: " + grossSales + "\n"
				+ "comission rate: " + comissionRate ;
	}
}

package tr.edu.iku.oop.lesson11.employees;

public class BaseSalaryComissionOvertime extends Employee{
	double baseSalary;
	double comissionRate;
	double grossSales;

	public BaseSalaryComissionOvertime(String firstname, String lastname, int ssn) {
		super(firstname, lastname, ssn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateEarnings() {
		// TODO Auto-generated method stub
		return 0;
	}

}

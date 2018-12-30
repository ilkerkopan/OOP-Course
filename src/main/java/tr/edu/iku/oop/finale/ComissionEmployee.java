package tr.edu.iku.oop.finale;

public class ComissionEmployee extends Employee {
	private double totalSales; 
	private double comissionRate;
	
	public ComissionEmployee(String name, int id, double totalSales, double comissionRate) {
		super(name, id);
		this.totalSales = totalSales;
		this.comissionRate = comissionRate;
	}

	@Override
	public double getSalary() {
		return totalSales * comissionRate;
	}
}

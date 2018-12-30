package tr.edu.iku.oop.finale;

public class HourlyEmployee extends Employee {
	private double hourlySalary;
	private int hoursWorked;
	
	public HourlyEmployee(String name, int id, double hourlySalary, int hoursWorked) {
		super(name, id);
		this.hourlySalary = hourlySalary;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double getSalary() {
		return hourlySalary * hoursWorked;
	}
}

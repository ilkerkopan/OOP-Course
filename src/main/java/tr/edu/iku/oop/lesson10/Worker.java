package tr.edu.iku.oop.lesson10;

public class Worker extends Person {
	private int salary;
	private int hoursWorked;
	final private int MONTHLY_WORK_HOURS = 40 * 4;

	public Worker(int salary) {
		this.salary = salary;
	}

	public void work(int hours) {
		hoursWorked += hours;
	}

	public int getSalary() {
		return salary / MONTHLY_WORK_HOURS * hoursWorked;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

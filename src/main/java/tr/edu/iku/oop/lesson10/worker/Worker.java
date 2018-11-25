package tr.edu.iku.oop.lesson10.worker;

public class Worker extends Person {

	int hourRate;
	int hoursWorked;
	
	public Worker(String name, int birthyear, int hourRate) {
		super(name, birthyear);
		this.hourRate = hourRate;
	}
	
	public void eat() {
		System.out.println("Worker "+name+" is on eat break.");
		super.eat();
	}
	
	public void work(int hours) {
		hoursWorked += hours;
	}

	public int getSalary() {
		return hourRate * hoursWorked;
	}
	
	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}

	public int getHourRate() {
		return hourRate;
	}
	
}

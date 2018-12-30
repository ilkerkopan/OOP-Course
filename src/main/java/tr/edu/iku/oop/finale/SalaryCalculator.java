package tr.edu.iku.oop.finale;

import java.util.ArrayList;
import java.util.List;


public class SalaryCalculator {
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new SalariedEmployee("John", 10000012, 1500.0));
		employees.add(new HourlyEmployee("Jane", 10000013, 50.0, 35));
		employees.add(new ComissionEmployee("Jim", 10000014, 15050.0, 0.15));

		
		for (int i=0; i<employees.size(); i++) {
			System.out.println("This months salary for " + employees.get(i).getName()
					+ " is " + employees.get(i).getSalary() + " tl");
		}
	}

}

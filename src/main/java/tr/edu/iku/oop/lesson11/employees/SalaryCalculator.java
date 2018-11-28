package tr.edu.iku.oop.lesson11.employees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/main/resources/employees.txt");
		Scanner inputFile = new Scanner(file);
		
		Employee[] employees = new Employee[10];
		int i=0;
		inputFile.nextLine();
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			String[] columns = line.split(",");
		
			if (columns[3].equals("salary"))
				employees[i] = new SalariedEmployee(columns[0], columns[1], 
						Integer.parseInt(columns[2]), Integer.parseInt(columns[4]));
			else if (columns[3].equals("hourly"))
				employees[i] = new HourlyEmployee(columns[0], columns[1], 
						Integer.parseInt(columns[2]), Integer.parseInt(columns[4]), 
						Integer.parseInt(columns[5]));
			else if (columns[3].equals("comission"))
				employees[i] = new ComissionEmployee(columns[0], columns[1], 
						Integer.parseInt(columns[2]), Integer.parseInt(columns[4]), 
						Double.parseDouble(columns[5]));
			else if (columns[3].equals("basePlusComission"))
				employees[i] = new BasePlusComissionEmployee(columns[0], columns[1], 
						Integer.parseInt(columns[2]), Integer.parseInt(columns[4]), 
						Double.parseDouble(columns[6]), Double.parseDouble(columns[5]));
			else
				System.out.println("unknown type of employee");
			
			i++;
		}
		
		for (i=0; i<6;i++) {
			 if (employees[i] instanceof SalariedEmployee) {
				System.out.println("You will have a salary raise this week!!");
			}
			System.out.println(employees[i].toString());
			System.out.println("Earned: " + employees[i].calculateEarnings());
			System.out.println("----------------------------");
		}

	}

}

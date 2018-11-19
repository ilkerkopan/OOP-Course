package tr.edu.iku.oop.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WorkLog {

	public static void main(String[] args) {
		Person[] people = new Person[10];

		File file = new File(".\\src\\resources\\lesson10\\input.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(file);
			int i = 0;
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				System.out.println(line);
				String[] tokens = line.split(" ");
				people[i] = new Worker(Integer.parseInt(tokens[2]));
				people[i].setName(tokens[0]);
				people[i].setBirthyear(Integer.parseInt(tokens[1]));
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String[] command = scanner.nextLine().split(" ");
			if (command[0].equals("work")) {
				int i = 0;
				while (!people[i].getName().equals(command[1])) {
					i++;
				}
				((Worker)people[i]).work(4);
			} else if (command[0].equals("salary")) {
				int i = 0;
				while (!people[i].getName().equals(command[1])) {
					i++;
				}
				System.out.println(people[i].getName()+" earned "+((Worker)people[i]).getSalary()+" tl");
			} else {
				System.exit(0);
			}
		}
	}

}

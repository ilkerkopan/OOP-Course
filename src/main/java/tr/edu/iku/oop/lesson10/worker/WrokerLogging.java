package tr.edu.iku.oop.lesson10.worker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WrokerLogging {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		Worker[] workers = new Worker[4];

		File file = new File("./src/main/resources/input.txt");
		Scanner inputFile = new Scanner(file);

		int i=0;
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			String[] columns = line.split(",");
			
			workers[i] = new Worker(columns[0], Integer.parseInt(columns[1]), Integer.parseInt(columns[2]));
			i++;
		}

		for(i=0; i<4; i++) {
			System.out.println("name:"+workers[i].name +" birthyear:" + workers[i].getBirthYear()
					+ " hour rate:"+workers[i].getHourRate());
		}
		
		workers[0].eat();
		
		System.out.println("work is keyword use work ali 5 command to enter work");
		System.out.println("salary is keyword use salary ali command to get salary");
		System.out.println("exit is keyword use exit to terminate programm");
		
		while (true) {
			String command = scanner.nextLine();
			String keyword = command.split(" ")[0];
			
			if (keyword.equals("work")) {
				String name = command.split(" ")[1];
				for (int j=0; j<workers.length; j++) {
					if (workers[j].getName().equals(name)) {
						int hours = Integer.parseInt(command.split(" ")[2]);
						workers[j].work(hours);
					}
				}
			} else if (keyword.equals("salary")) {
				String name = command.split(" ")[1];
				for (int j=0; j<workers.length; j++) {
					if (workers[j].getName().equals(name)) {
						System.out.println(workers[j].getName()+" has a salary:"+ workers[j].getSalary());
					}
				}
			} else if(keyword.equals("exit")) {
				System.exit(0);
			} else {
				System.out.println("unknown command");
			}
		}
	}
}

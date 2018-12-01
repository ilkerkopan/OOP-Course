package tr.edu.iku.oop.homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework {
	

	public static void main(String[] args) {
		Animal[] animals = new Animal[100];
		File file = new File(".\\src\\resources\\homework1\\input.txt");
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(file);
			int i = 0;
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				System.out.println(line);
				String[] tokens = line.split(" ");
				
				if (tokens[1].equals("Bird")) {
					animals[i] = new Bird(tokens[0]);
				} else if (tokens[1].equals("Cat")) {
					animals[i] = new Cat(tokens[0]);
				} else if (tokens[1].equals("Dog")) {
					animals[i] = new Dog(tokens[0]);
				} else if (tokens[1].equals("Eagle")) {
					animals[i] = new Eagle(tokens[0]);
				} else if (tokens[1].equals("Fish")) {
					animals[i] = new Fish(tokens[0]);
				} else if (tokens[1].equals("Snake")) {
					animals[i] = new Snake(tokens[0]);
				} else {
					System.out.println("unknown animal!!");
				}
				
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine()) {
			String[] command = scanner.nextLine().split(" ");
			if (command[0].equals("talk")) {
				int i=0;
				while (!animals[i].name.equals(command[1])) {
					i++;
				}
				animals[i].talk();
			} else if (command[0].equals("talk")) {
				System.exit(0);
			}
		}
	}

}

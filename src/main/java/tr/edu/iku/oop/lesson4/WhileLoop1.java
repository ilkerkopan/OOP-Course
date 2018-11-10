package tr.edu.iku.oop.lesson4;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter line count of triangle");
		int lineCount = scanner.nextInt();

		int space = 20;
		int dotCount = 1;

		for (int i = 0; i < lineCount; i++) {
			// print space
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<dotCount; j++) {
				System.out.print("*");
			}
			space--;
			dotCount = dotCount + 2;
			System.out.println("");	
		}
	}

}

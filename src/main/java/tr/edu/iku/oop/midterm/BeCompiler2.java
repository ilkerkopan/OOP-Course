package tr.edu.iku.oop.midterm;

public class BeCompiler2 {
	public static void main(String[] args) {
		int lineCount = 5;
		int space = 5;
		int dotCount = 1;

		for (int i = 0; i < lineCount; i++) {
			// print space
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < dotCount; j++) {
				System.out.print("*");
			}
			space--;
			dotCount = dotCount + 2;
			System.out.println("");
		}
	}
}

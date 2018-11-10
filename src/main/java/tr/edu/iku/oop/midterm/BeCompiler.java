package tr.edu.iku.oop.midterm;

public class BeCompiler {
	public static void main(String[] args) {
		System.out.println("Some calculation result is: " + someCalculation(5));
	}
	
	public static int someCalculation(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
}

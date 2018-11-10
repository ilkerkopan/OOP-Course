package tr.edu.iku.oop.lesson5;

public class Lesson5 {

	public static void main(String[] args) {

		System.out.println("permutation:" + permutation(4, 2));
		System.out.println("combination:" + combination(4, 2));

	}

	public static int factorial(int n) {
		int factorialValue = 1;
		for (int i = 1; i <= n; i++) {
			factorialValue = factorialValue * i;
		}

		return factorialValue;
	}

	public static double permutation(int n, int k) {
		if (n > 0 && k > 0 && n >= k) {
			return (factorial(n) / factorial(n - k));
		} else {
			return 0;
		}
	}

	public static double combination(int n, int k) {
		if (n > 0 && k > 0 && n >= k) {
			return factorial(n) / (factorial(n - k) * factorial(k));
		} else {
			return 0;
		}
	}

}

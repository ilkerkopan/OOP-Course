package tr.edu.iku.oop.midterm;

public class MaxNumberInArray {
	public static void main(String[] args) {
		int[] numbers = { 14, 33, 41, 99, 3, 20, 9 };
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("Max number is: " + max);
	}
}

package tr.edu.iku.oop.midterm;

public class PalindromeUtil {
	private char[] inputText;
	
	public PalindromeUtil(char[] inputText) {
		this.inputText = inputText;
	}

	public boolean isPalindrome() {
		for (int i=0; i<inputText.length/2;i++) {
			if (inputText[i]!=inputText[inputText.length-1-i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String text = "madam";
		PalindromeUtil palindromeUtil = new PalindromeUtil(text.toCharArray());
		System.out.println(palindromeUtil.isPalindrome());

	}

	
}


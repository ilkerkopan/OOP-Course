package tr.edu.iku.oop.lab12.quiz2;

public class Square implements Printable {

	public void print() {
		System.out.println(color);
		System.out.println( "**********");
		for (int i=0; i<4; i++)
			System.out.println("*        *");
		System.out.println( "**********");
	}

}

package tr.edu.iku.oop.lab12.quiz2;

public class Vehicles {

	public static void main(String[] args) {
		Printable[] printables = new Printable[6];
		printables[0] = new Car("34 AB 123");
		printables[1] = new Car("06 AAA 01", "Red");
		printables[2] = new Motorcycle("34 NG 001");
		printables[3] = new Bus("34 NG 321");
		printables[4] = new Square();
		printables[5] = new Circle();
		
		for (int i=0; i<printables.length; i++) {
			printables[i].print();
			System.out.println("---------------------------------------");
		}
		
	}

}

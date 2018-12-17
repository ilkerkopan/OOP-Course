package tr.edu.iku.oop.lab12.quiz1;

public class Animals {

	public static void main(String[] args) {
		Printable[] printables = new Printable[10];
		printables[0] = new Cat("Smokey", "yellow");
		printables[1] = new Dog("Oscar");
		printables[2] = new Dog("Rex", "black");
		printables[3] = new Duck("Daffy");
		printables[4] = new Square();
		printables[5] = new Circle();
		
		for (int i=0; i<printables.length; i++) {
			printables[i].print();
			System.out.println("----------------------");
		}

	}

}

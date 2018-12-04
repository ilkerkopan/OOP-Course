package tr.edu.iku.oop.lab11.quiz1;

public class Animals {

	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Cat("Smokey", "yellow");
		animals[1] = new Dog("Oscar");
		animals[2] = new Dog("Rex", "black");
		animals[3] = new Duck("Daffy");
		
		for (int i=0; i<animals.length; i++) {
			animals[i].print();
			animals[i].walk(4);
			animals[i].talk();
			System.out.println("----------------------");
		}

	}

}

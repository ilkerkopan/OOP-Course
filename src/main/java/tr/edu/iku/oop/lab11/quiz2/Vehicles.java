package tr.edu.iku.oop.lab11.quiz2;

public class Vehicles {

	public static void main(String[] args) {
		Vehicle[] vehicles =  new Vehicle[4];
		vehicles[0] = new Car("34 AB 123");
		vehicles[1] = new Car("06 AAA 01", "Red");
		vehicles[2] = new Motorcycle("34 NG 001");
		vehicles[3] = new Bus("34 NG 321");
		
		for (int i=0; i<4; i++) {
			vehicles[i].forward(50);
			vehicles[i].print();
			System.out.println("---------------------------------------");
		}
		
	}

}

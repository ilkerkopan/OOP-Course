package tr.edu.iku.oop.lesson8.game;

public class Player {
	int number;

	public int guess() {
		number = (int) (Math.random() * 10);
		return number;
	}
	
}

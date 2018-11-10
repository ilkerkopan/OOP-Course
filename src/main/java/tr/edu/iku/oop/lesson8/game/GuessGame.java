package tr.edu.iku.oop.lesson8.game;

public class GuessGame {
	Player p1, p2, p3;
	int numberToBeGuessed;

	public void start() {
		numberToBeGuessed = (int) (Math.random() * 10);
		System.out.println("Number to be guessed: " + numberToBeGuessed);

		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		boolean isP1Guessed = false;
		boolean isP2Guessed = false;
		boolean isP3Guessed = false;

		int p1Guess;
		int p2Guess;
		int p3Guess;

		while (!isP1Guessed && !isP2Guessed && !isP3Guessed) {
			p1Guess = p1.guess();
			p2Guess = p2.guess();
			p3Guess = p3.guess();

			System.out.println("Player 1 guessed: " + p1Guess);
			System.out.println("Player 2 guessed: " + p2Guess);
			System.out.println("Player 3 guessed: " + p3Guess);

			if (p1Guess == numberToBeGuessed)
				isP1Guessed = true;
			if (p2Guess == numberToBeGuessed)
				isP2Guessed = true;
			if (p3Guess == numberToBeGuessed)
				isP3Guessed = true;
		}
		if (isP1Guessed)
			System.out.println("Player 1 guessed true");
		if (isP2Guessed)
			System.out.println("Player 2 guessed true");
		if (isP3Guessed)
			System.out.println("Player 3 guessed true");

	}

}

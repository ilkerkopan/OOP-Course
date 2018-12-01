package tr.edu.iku.oop.homework1;

public class Snake extends WildAnimal {
	
	public Snake(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + " cannot run");
	}

	public void crawl() {
		System.out.println(name + " is crawling");
	}
}

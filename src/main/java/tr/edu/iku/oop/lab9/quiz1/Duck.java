package tr.edu.iku.oop.lab9.quiz1;

public class Duck {
	private String name;
	private String color;
	final private int LEG_COUNT = 2;
	final private String SOUND = "Quack";
	
	public Duck(String name) {
		this.name = name;
	}

	public String talk() {
		return SOUND;
	}
	
	public int getLegCount() {
		return LEG_COUNT;
	}
	
	public String getName() {
		return name;
	}
	
	public void walk() {
		System.out.println(color + " Duck walked 1 meter");
	}

	public void walk(int meters) {
		System.out.println(color + " Duck walked " + meters + " meters");
	}
}

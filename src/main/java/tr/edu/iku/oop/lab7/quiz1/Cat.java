package tr.edu.iku.oop.lab7.quiz1;

public class Cat {
	private String name;
	final private int LEG_COUNT = 4;
	final private String SOUND = "Meow";
	
	public Cat(String name) {
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
}

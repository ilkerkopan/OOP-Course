package tr.edu.iku.oop.lab7.quiz1;

public class Duck {
	private String name;
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
}

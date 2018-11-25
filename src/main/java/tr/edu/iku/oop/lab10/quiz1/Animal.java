package tr.edu.iku.oop.lab10.quiz1;

public class Animal {
	String name;
	String color;
	int legCount;
	String sound;

	public Animal(String name, String color, int legCount, String sound) {
		this.name = name;
		this.color = color;
		this.legCount = legCount;
		this.sound = sound;
	}

	public void talk() {
		System.out.println(name + " says " + sound);
	}
	
	public int getLegCount() {
		return legCount;
	}
	
	public String getName() {
		return name;
	}
	
	public void walk() {
		System.out.println(name + " walked 1 meter");
	}

	public void walk(int meters) {
		System.out.println(name + " walked " + meters + " meters");
	}
}

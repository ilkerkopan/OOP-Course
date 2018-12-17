package tr.edu.iku.oop.lesson13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("ilker");
		names.add("Ceyda");
		names.add("Reyhan");
		names.add("Can Deniz");
		
		System.out.println("contains ilker? " + names.contains("ilker"));
		System.out.println("contains Yunus? " + names.contains("Yunus"));
		System.out.println("index of reyhan: " + names.indexOf("Reyhan"));
		System.out.println("names size: " + names.size());
	}

}

package tr.edu.iku.oop.lesson12.chatbot;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandBase {
	private String commandKeyword;
	static List<String> items = new ArrayList<>();
	
	public CommandBase(String commandKeyword) {
		this.commandKeyword = commandKeyword;
	}
	
	public String getCommandKeyword() {
		return commandKeyword;
	}
}

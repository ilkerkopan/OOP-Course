package tr.edu.iku.oop.lesson12.chatbot;

public interface Command {

	public void execute(String argument);
	
	public String commandDescription();
	
	public String getCommandKeyword();
}

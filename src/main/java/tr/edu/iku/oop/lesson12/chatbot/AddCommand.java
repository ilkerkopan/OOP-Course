package tr.edu.iku.oop.lesson12.chatbot;

public class AddCommand extends CommandBase implements Command {

	public AddCommand() {
		super("add");
	}

	public void execute(String argument) {
		items.add(argument);
		System.out.println("item " + argument + " added.");
	}

	@Override
	public String commandDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}

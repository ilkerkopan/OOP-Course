package tr.edu.iku.oop.lesson12.chatbot;

public class RemoveCommand extends CommandBase implements Command {

	public RemoveCommand() {
		super("remove");
	}

	@Override
	public void execute(String argument) {
		if (items.contains(argument)) {
			items.remove(argument);
			System.out.println("removed item " + argument);
		} else {
			System.out.println("item " + argument + " not found!");
		}

	}

	@Override
	public String commandDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}

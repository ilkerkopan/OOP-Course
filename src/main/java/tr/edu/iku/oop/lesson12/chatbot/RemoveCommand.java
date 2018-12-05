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

	public String commandDescription() {
		return "type 'remove <item>' to remove an item";
	}

}

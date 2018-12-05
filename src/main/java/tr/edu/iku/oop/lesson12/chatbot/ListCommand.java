package tr.edu.iku.oop.lesson12.chatbot;

public class ListCommand extends CommandBase implements Command {

	public ListCommand() {
		super("list");
	}

	@Override
	public void execute(String argument) {
		System.out.println("item list contains");
		System.out.println("--------------");
		for (int i=0; i<items.size(); i++) {
			System.out.println(i+". item:" + items.get(i));
		}

	}

	@Override
	public String commandDescription() {
		return "type 'list' to list an items";
	}

}

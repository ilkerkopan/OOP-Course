package tr.edu.iku.oop.lesson12.chatbot;

public class ExitCommand extends CommandBase implements Command {

	public ExitCommand() {
		super("exit");
		// TODO Auto-generated constructor stub
	}

	public void execute(String argument) {
		System.out.println("bye...");
		System.exit(0);
	}

	public String commandDescription() {
		return "type 'exit' to terminate chatbot";
	}

}

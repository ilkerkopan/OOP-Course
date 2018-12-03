package tr.edu.iku.oop.lesson12.chatbot;

public class ExitCommand extends CommandBase implements Command {

	public ExitCommand() {
		super("exit");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(String argument) {
		System.exit(0);
	}

	@Override
	public String commandDescription() {
		return "exit will terminate chatbot";
	}

}

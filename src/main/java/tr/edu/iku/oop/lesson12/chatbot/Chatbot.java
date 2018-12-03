package tr.edu.iku.oop.lesson12.chatbot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
	private Map<String, Command> commands = new HashMap<>();
	public Chatbot() {
		commands.put("add", new AddCommand());
		commands.put("remove", new RemoveCommand());
		commands.put("list", new ListCommand());
		commands.put("exit", new ExitCommand());
	}

	public void startChat() {
		System.out.println("Shopping list chatbot ready.");
		listCommands();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			String[] inputTokenized = input.toLowerCase().split(" ");
			if (commands.containsKey(inputTokenized[0])) {
				Command inputCommand = commands.get(inputTokenized[0]);
				String commandArgument = inputTokenized.length>1 ? inputTokenized[1] : "";
				inputCommand.execute(commandArgument);
				
			} else {
				System.out.println("unknown command.");
				listCommands();
			}
			System.out.print(">");
		}
	}
	
	private void listCommands() {
		for (String commandName: commands.keySet()) {
			System.out.println(commands.get(commandName).commandDescription());
		}
	}
}

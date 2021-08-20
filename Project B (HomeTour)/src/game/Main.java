package game;

import fixtures.Appliance;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		RoomManager RM = new RoomManager();
		Player p1 = new Player();
		RM.init();
		p1.setCurrentRoom(RM.startingRoom);
		String[] command = new String[3];
		
		
		
		System.out.println("Welcome to this project! Press enter to continue.");
		
		command = collectInput();
		
		
		while(command[0].equals("quit") != true) {
			
			printInfo(p1);
		
			System.out.println("\nPlease input a command statement.");
			
			command = collectInput();
			
			System.out.println("You have inputed \"" + command[0] + "\" as a command");
			
			parse(command,p1);
		}
		
	}
	
	private static void printInfo(Player player) {
		player.printCurrentRoom();
		System.out.println("----------------------------------------------------------\n");
		System.out.println("                     Room Directions \n");
		System.out.println("----------------------------------------------------------\n");
		player.printCurrentExits();
		player.printCurrentAppliances();
	}
	
	private static String[] collectInput() {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		// System.out.println("Attempting to " + input);
		
		String[] command = input.split(" "); 
		
		/* 
		 * Command is rather interesting- you take your input and split it into two syntaxic tokens. 
		 * The first word being the "command" which is what you are trying to do
		 * and the second word being the "target" which is what you are trying to apply the command to. 
		 */
		
		return command;

	}
	
	private static void parse(String[] command, Player player) {
		
			switch(command[0]) {
			case "quit":
				System.out.println("Goodbye!");
				break;
			case "go":
				player.go(command);
				break;
			case "cook":
				player.cook(command);
				break;
			case "sleep":
				player.Sleep();
				break;
			case "examine":
				player.Examine(command);
				break;
			default: 
				System.out.println(command[0] + " is not a command I recognize, please try a different command.");
				break;
		}
	}
}

package game;

import fixtures.Room;

public class Player {
	
	protected Room currentRoom;
	protected Room applianceLocation;

	public Room getCurrentRoom() {
		return this.currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	
	/*
	 * Prints the current room details that the player is currently in. 
	 */
	
	public void printCurrentRoom() {
		System.out.println(getCurrentRoom().name);
		// System.out.println(currentRoom.shortDescription);
		System.out.println(getCurrentRoom().longDescription);
	}
	
	
	public void printCurrentExits() {
		getCurrentRoom().getExits();
	}
	
	public void printCurrentAppliances() {
		currentRoom.printAppliancesInformation();
	}
	
	
	public void go(String[] command) {
		
		System.out.println("\n");
		
		String direction = "";
		
		switch(command[1]) {
		
		case "north":
			direction = "north";
			//System.out.println("Attempting to go north.");
			break;
	
		case "east":
			direction = "east";
			//System.out.println("Attempting to go east.");
			break;
			
		case "south":
			direction = "south";
			//System.out.println("Attempting to go south.");
			break;
			
		case "west":
			direction = "west";
			//dSystem.out.println("Attempting to go west.");
			break;

		default: 
			System.out.println("The direction was either not supplied or not an existing direction.");
			break;
		}
		
		if (!currentRoom.getExit(direction).name.equals("Empty")) {
			this.currentRoom = currentRoom.getExit(direction);
		} else {
			System.out.println("\n\nYou literally smacked into a wall. Way to go.");
		}
		
	}
	
	public void cook(String[] command) {
		if(currentRoom.getAppliances().name.equals("Gas Stove") & currentRoom.name.equals("Kitchen")) {
			
				System.out.println("You cooked some amazing " + command[1] + "(s)!!!\n\n\n");
				
				
				currentRoom.updateDescription("The kitchen was adorn with white high cabinets as well as cabinets below the countertop as well. It had a " + "\n"
		    	+ "Bar counter extension that was seperating it from the living space as well as had hardwood floors that creak" + "\n"
		    	+ "With every step. Due to the recent cooking that you performed however- the kitchen has becomee rather messy as a result " + "\n" 
		    	+ " of all the ingredients scattered around the counters");
			
		}
	}
	
	public void Sleep() {
		if(currentRoom.getAppliances().name.equals("Bed") & currentRoom.name.equals("Bedroom")) {
			
			System.out.println("You felt rather tired and decided to sleep\n\n\n");
			
			int i = 0;
			while (i < 3) {
				try {
				Thread.sleep(1500);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("ZZZzzz...\n\n");
				i++;
			}
			
			System.out.println("You wake up feeling refreshed\n\n");
			
			
			currentRoom.updateDescription("The bedroom had a large queen mattress against the wall- Layed at the center of the room with a red comforter " + "\n"
					+ "that seemed rather soft. There are two black shelves onn the left that have all sorts of figurines and books. " + "\n"
					+ "The bed that you recently slept in has its comforter Disturbed as well as a few pillows have fallen off the bed.");
		
		}	
	}
	
	public void Examine(String[] command) {
		
		System.out.println("You began to examine the appliance in this room, and obtain its stats!");
		System.out.println("\n\n\n");
		
		if(!currentRoom.getAppliances().name.equals("Empty")) {
			
			System.out.println(currentRoom.getAppliances().name);
			System.out.println(currentRoom.getAppliances().longDescription);
		} else {
			System.out.println("There is not an appliance to examine in this room");
		}
		System.out.println("\n\n\n");
	}
	
	
	
}

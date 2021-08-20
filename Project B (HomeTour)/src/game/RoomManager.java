package game;

import fixtures.Room;
import fixtures.Appliance;

public class RoomManager {
	public Room startingRoom;
	public Room[] rooms = new Room[9];
	
	public Room[] livingSpaceExits = new Room[4];
	public Room[] kitchenExits = new Room[4];
	public Room[] bedroomExits = new Room[4];
	
	public Appliance kitchenAppliances;
	public Appliance bedroomAppliances;
	public Appliance livingSpaceAppliances;
	
	public void init() {
		
		
		Room livingSpace = new Room( "Living Space",
				"A very small living room",
				"The living space is rather small for its compact style. Combinging the living space and its high ceilings is " + "\n"
				+ "A Kitchen. To the right of you is a door that leads into a bedroom. Theres a flat screen tv to the left" + "\n"
				+ "In the right corner there is a desk with a computer set up as well as a leather chair and otterman");
				this.rooms[0] = livingSpace;
		        this.startingRoom = livingSpace;
		       
		Room kitchen = new Room( "Kitchen",
		    	"A pretty impressive kitchen",
		    	"The kitchen was adorn with white high cabinets as well as cabinets below the countertop as well. It had a " + "\n"
		    	+ "Bar counter extension that was seperating it from the living space as well as had hardwood floors that creak" + "\n"
		    	+ "With every step.");
		    	this.rooms[1] = kitchen;
		    	
		Room bedroom = new Room( "Bedroom",
				"A rather dark bedroom",
				"The bedroom had a large queen mattress against the wall- Layed at the center of the room with a red comforter " + "\n"
				+ "that seemed rather soft. There are two black shelves onn the left that have all sorts of figurines and books. " + "\n"
				+ "A lightswitch is also by the door.");
		
				this.rooms[2] = bedroom;
				
		Room empty = new Room (); 
				
				
				
				this.livingSpaceExits[0]= kitchen;
				this.livingSpaceExits[1]= bedroom;
				this.livingSpaceExits[2]= empty;
				this.livingSpaceExits[3]= empty;
				
				this.kitchenExits[0]= empty;
				this.kitchenExits[1]= empty;
				this.kitchenExits[2]= livingSpace;
				this.kitchenExits[3]= empty;
				
				
				this.bedroomExits[0]= empty;
				this.bedroomExits[1]= empty;
				this.bedroomExits[2]= empty;
				this.bedroomExits[3]= livingSpace;
				
				livingSpace.setExits(livingSpaceExits);
				kitchen.setExits(kitchenExits);
				bedroom.setExits(bedroomExits);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
		Appliance Stove = new Appliance("Gas Stove","A four burner gas stove",
				" This four burner gas stove has seen quite some wear and tear from all of its use, but I bet it can still make good food" + "\n"
				+ "With the right knowledge");
		Appliance Bed = new Appliance("Bed","A Queen sized bed",
				"This Queen sized bed looks very comfortable to sleep on as it has a velvet red comforter as well as many pillows." + "\n"
				+ "If you were to touch it you could feel that its a memory foam mattress...");
		Appliance Empty = new Appliance();
		
		
				
				Stove.setLocation(kitchen);
				Bed.setLocation(livingSpace);
				Empty.setLocation(bedroom);
				
				
				this.kitchenAppliances= Stove;
				this.bedroomAppliances= Bed;
				this.livingSpaceAppliances= Empty;
				
				kitchen.setAppliances(kitchenAppliances);
				livingSpace.setAppliances(livingSpaceAppliances);
				bedroom.setAppliances(bedroomAppliances);
		    	        		
	}
	
}

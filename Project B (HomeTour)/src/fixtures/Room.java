package fixtures;

public class Room extends Fixtures{
	
	private Room[] exits; //was originally public
	
	private Appliance appliances; 
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
		//this.appliances = new Appliance[1]; // size is your choice
	}
	
	public Room() {
		super("Empty","","");
		this.exits = new Room[4];
	}
	
	public void printAppliancesInformation() {
		if(!appliances.name.equals("Empty")) {
			System.out.println();
			System.out.println("                     Usable Appliance \n");
			System.out.println("----------------------------------------------------------\n");
			System.out.println(appliances.name);
		}
	}
	
	public Appliance getAppliances() {
		return appliances;
	}

	public void setAppliances(Appliance appliances) {
		
		this.appliances = appliances;
	}
	
	public void updateDescription(String newdesc){
		this.longDescription = newdesc;
	}
	
	public Room[] getExits() {
		
		/*
		 * for every exit, if it is not equal to 'Empty' 
		 * print the name of the exit and direction its in.
		 */
		for(int i=0; i<4 ; i++) {
			if(!exits[i].name.equals("Empty")) {
				System.out.print(exits[i].name);
				
				switch(i) {
				
				case 0: System.out.println(" - North");
				break;
				
				case 1: System.out.println(" - East");
				break;
				
				case 2: System.out.println(" - South");
				break;
				
				case 3: System.out.println(" - West");
				break;
				
				default: System.out.println(" - Error");
				break;
				
				}
			}
		}
		return exits;
	}
		
	public Room getExit(String direction) {
		
		switch(direction) {
		case "north":
			return exits[0];
		case "east":
			return exits[1];
		case "south":
			return exits[2];
		case "west":
			return exits[3];
		}
		return null;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
}

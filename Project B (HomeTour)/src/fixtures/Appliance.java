package fixtures;

public class Appliance extends Fixtures {
	
	private Room location;
	
	public Appliance(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}
	
	public Appliance() {
		super("Empty","","");
	}
	
	public String getLocationName() {
		return location.name;
	}

	public Room getLocation() {
		return location;
	}

	public void setLocation(Room location) {
		this.location = location;
	}
}

package main;

import java.util.Scanner;

public class Converter {
	
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	public static void convertCupsToTeaspoons(double qty) {
		double numberOfTeaspoons = qty * 48;
		System.out.println(qty + " cup(s) is equivalent to about " + numberOfTeaspoons + " teaspoon(s).");
	}
	
	public static void convertMilesToKilometers(double qty) {
		double numberOfKilometers = qty * 1.60934;
		System.out.println(qty + " mile(s) is equivalent to about " + numberOfKilometers + " kilometer(s).");
	}
	
	public static void convertMetersToMiles(double qty) {
		double numberOfMiles = qty * 0.000621371;
		System.out.println(qty + " Meter(s) is equivalent to about " + numberOfMiles + " Mile(s).");
	}
	
	public static void convertUStoImperial(double qty) {
		double numberOfImpGals = qty * 0.832674;
		System.out.println(qty + " US Gallon(s) is equivalent to about " + numberOfImpGals + " Imperial Gallon(s).");
	}
	
	public static void main(String[] args) {
		
		
		int menuselect = 0;
		while (menuselect != 4) {
			System.out.println("Please select an option:\r\n"
					+ "1. Cups to Teaspoons\r\n"
					+ "2. Distance Converstion types\r\n"
					+ "3. US Gallons to Imperial Gallons\r\n"
					+ "4. Quit");
			
		menuselect = (int)getInput();
		
		switch(menuselect) {
		
			case 1:
				System.out.println("Input the amount of cups you wish to convert.");
				
				double numberOfCups = getInput();
				convertCupsToTeaspoons(numberOfCups);
				
				break;
				
			case 2:
				while(menuselect != 3) {
					System.out.println("Please select your conversion:\r\n"
						+ "1. Meters to Miles\r\n"
						+ "2. Miles to Kilometers\r\n"
						+ "3. Back");
					
					menuselect = (int)getInput();
					
					switch(menuselect) {
	
					
						case 1:
							System.out.println("Input the amount of meters you wish to convert.");
							
							double numberOfMeters = getInput();
							convertMetersToMiles(numberOfMeters);
							
							break;
						
						case 2:
							System.out.println("Input the amount of miles you wish to convert.");
							
							double numberOfMiles = getInput();
							convertMilesToKilometers(numberOfMiles);
							
							break;
						default: 
							System.out.println("That is not a valid menu option- please use the available numbers."); 
							break;
					}
				}
				
				menuselect = 2;
				break;
				
			case 3:
				System.out.println("Input the amount of US Gallons you wish to convert.");
				
				double numberOfUSgals = getInput();
				convertUStoImperial(numberOfUSgals);
				
				break;
				
			case 4:
				
				System.out.println("Goodbye!");
				break;
				
			default: 
				System.out.println("That is not a valid menu option- please use the available numbers."); 
				break;
			
			}
		}
	}
}

package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

// import FileDemo.Student;

public class CountriesApp {
	
	// displays menu and responds to user choices
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int userInput;
		
		ArrayList<Country> country = new ArrayList<>();
		country.add(new Country("Matt America", 1));
		country.add(new Country("Alaska", 2));
		country.add(new Country("Jamaica", 3000));
		country.add(new Country("Egypt", 450));
		
		do {
					
			System.out.println("Welcome to the Countries Maintenance Application!");
			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
//			System.out.println("3 - Remove a country");
			System.out.println("3 - Exit\n");
			System.out.println("Enter a menu number: ");
			userInput = scan.nextInt();

			if (userInput == 1) {
				for (Country c : country) {
					System.out.println(c);
				}
				System.out.println();
								
			} else if (userInput == 2) {
				System.out.println("What country would you like to add?");
				String userCountry = scan.next();
				System.out.println("What is the population of " + userCountry + "?");
				int userPopulation = scan.nextInt();
				
				country.add(new Country(userCountry, userPopulation));
				
				for (Country c : country) {
					System.out.println(c);
				}
				System.out.println();
				
//			} else if (userInput == 3) {
//				System.out.println("What country would you like to remove? Please enter number.");
//				
//				int counter = 1;
//				
//				for (Country c : country) {
//					System.out.println(counter++ + " " + c);
//				}
//				
//				int i = scan.nextInt();
//							
//				country.remove(i); remove line("bbb")
//							
//				CountriesTextFile.writeToFile(country);
//				
//				System.out.println(country);
				
			}
			
			
		} while(userInput != 3);
		
		System.out.println("Come back again!");
	}
}

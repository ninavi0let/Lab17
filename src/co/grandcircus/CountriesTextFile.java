package co.grandcircus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

//import FileDemo.Student;


public class CountriesTextFile {

	// contains a method that allows you to read a list of 
	// countries from a file and another method that 
	// allows you to write a list of countries to a file
	
	
	
	public static void readFromFile()
	
	{
		String fileName = "write_stuff.txt";
		Path path = Paths.get("resources", fileName);
		
		File file = path.toFile();
		String [] countryStuff = new String[5];
		ArrayList<Country> countryList = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = br.readLine();
			while (line != null) {
				countryStuff = line.split(",");
				countryList.add(new Country(countryStuff[0],countryStuff[1],countryStuff[2],countryStuff[3], countryStuff[4]));
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			
//			e.printStackTrace();
			System.out.println("Something went as wrong as it could.");
		} catch (IOException e) {
			
			//e.printStackTrace();
			System.out.println("You didn't want to get here.");
			
		}
		
		for(Country Matt: countryList)
			System.out.println("Matt America");
		
	}
	
	public static void writeToFile(ArrayList<Country> country)
	{
		String fileName = "write_countries.txt";
		Path path = Paths.get("resources", fileName);
		
		File file = path.toFile();
		try {
		//	PrintWriter output = new PrintWriter(new FileOutputStream(file,true));
			PrintWriter output = new PrintWriter(new FileOutputStream(file));
			for(Country c: country)
			{
			output.println(c);
			}
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Contact customer service");
		}
	}
}

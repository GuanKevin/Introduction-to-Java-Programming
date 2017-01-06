package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Baby name popularity ranking
 * Revise Programming Exercise 21.11 to prompt 
 * the user to enter year, gender, and name and display the ranking for the name. 
 * Prompt the user to enter another inquiry or exit the program.
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			babyNamePopularity(input);
			
			System.out.print("Would you like to search again (Y|N); ");
			if (Character.toUpperCase(input.next().charAt(0)) != 'Y')
				break;
		}
		
		System.out.println("Ending search..");
		
		input.close();
	}
	
	public static void babyNamePopularity(Scanner input)
	{
		File textFile = getYear(input);
		char gender = getGender(input);
		String name = getName(input);
		
		Map<String, Integer> boyNames = new HashMap<>();
		Map<String, Integer> girlNames = new HashMap<>();
		
		try (Scanner textInput = new Scanner(textFile);)
		{
			while (textInput.hasNext())
			{	
				int key = textInput.nextInt();
				boyNames.put(textInput.next(), key);
				textInput.nextInt();
				girlNames.put(textInput.next(), key);
				textInput.nextInt();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		if (gender == 'F' && girlNames.get(name) != null)
			System.out.println(name + " is ranked " + girlNames.get(name)+ ".");
		else if (gender == 'M' && boyNames.get(name) != null)
			System.out.println(name + " is ranked " + boyNames.get(name)+ ".");
		else
			System.out.println(name + " is not found in this year.");
	}
	
	public static String getName(Scanner input)
	{
		System.out.print("Enter a name: ");
		String name = input.next();
		name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
		
		return name;
	}
	
	public static char getGender(Scanner input)
	{
		System.out.print("Enter gender (M|F): ");
		char gender = 'F';
		boolean getGender = true;
		
		while (getGender)
		{
			try 
			{
				gender = Character.toUpperCase(input.next().charAt(0));
				
				if (gender != 'M' && gender != 'F')
					throw new Exception("Invalid character! Enter gender again (M|F): ");
				
				getGender = false;
			}
			catch (Exception ex)
			{
				System.out.print(ex.getMessage());
			}
		}
		return gender;
	}
	
	public static File getYear(Scanner input)
	{
		System.out.print("Enter the year (2001 - 2010): ");
		File textFile = new File("src/Text_Files/Chapter_21/Baby_Names/babynamesranking" + input.next() + ".txt");
		
		if (!textFile.exists())
		{
			System.out.print("File not found.. ending program..");
			System.exit(1);
		}
		
		return textFile;
	}
}

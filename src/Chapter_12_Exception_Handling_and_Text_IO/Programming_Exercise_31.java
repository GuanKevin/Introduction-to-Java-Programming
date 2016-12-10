package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Baby name popularity ranking
 * The popularity ranking of baby names from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored in files named babynameranking2001.txt, 
 * babynameranking2002.txt, . . . , babynameranking2010.txt. 
 * Each file contains one thousand lines. 
 * Each line contains a ranking, a boy’s name, number for the boy’s name, a girl’s name, and number for the girl’s name.
 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s name Ethan and girl’s name Sophia are ranked #2. 
 * 21,875 boys are named Jacob and 22,731 girls are named Isabella. 
 * Write a program that prompts the user to enter the year, gender, and followed by a name, 
 * and displays the ranking of the name for the year.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_31
{
	public static void main(String[] args) throws FileNotFoundException       
	{
		if (args.length == 0)
		{
			System.out.print("Current directory is empty.");
			System.exit(0);
		}
		
		Scanner input = new Scanner(System.in);
		
		File[] fileList = new File[args.length];
		for (int i = 0; i < fileList.length; i++)
			fileList[i] = new File(args[i]);
		
		String year = getYear(input);
		char gender = getGender(input);
		String name = getName(input);
		
		getData(fileList, year, gender, name);
		
		input.close();
	}
	
	public static void getData(File[] fileList, String year, char gender, String name) throws FileNotFoundException
	{
		for (int i = 0; i < fileList.length; i++)
		{
			if (fileList[i].toString().equals("babynamesranking" + year + ".txt"))
				try (Scanner reader = new Scanner(fileList[i]))
				{
					if (Character.toUpperCase(gender) == 'M')
						while (reader.hasNext())
						{
							String[] getData = reader.nextLine().split(" ");
							
							if (getData[1].equals(name))
							{
								System.out.print(name + " is ranked " + getData[0] + " in " + year + ".");
								System.exit(1);
							}
						}
					
					if (Character.toUpperCase(gender) == 'F')
						while (reader.hasNext())
						{
							String[] getData = reader.nextLine().split(" ");
							
							if (getData[2].equals(name))
							{
								System.out.print(name + " is ranked " + getData[0] + " in " + year + ".");
								System.exit(1);
							}
						}
					System.out.print(name + " is not within top 1000 in year " + year + ".");
				}
		}
	}
	
	public static String getName(Scanner input)
	{
		System.out.print("Enter a name: ");
		String name = input.next();
		boolean correctValue = false;
		
		while (!correctValue)
		{
			for (int i = 0; i < name.length(); i++)
				if (!Character.isAlphabetic(name.charAt(i)))
				{
					System.out.print("Enter another name: ");
					name = input.next();
				}
				else if (name.length() - 1 == i)
					correctValue = true;
		}
		return name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
	}
	
	public static char getGender(Scanner input)
	{
		char gender = 0;
		boolean correctValue = false;
		
		while (!correctValue)
		{
			try 
			{
				System.out.print("Enter a gender (M | F) > ");
				gender = Character.toUpperCase(input.next().charAt(0));
				
				while (gender != 'M' && gender != 'F')
				{
					System.out.print("Enter M or F > ");
					gender = Character.toUpperCase(input.next().charAt(0));
				}
				correctValue = true;
			}
			catch (Exception ex)
			{
				System.out.println("Incorrect value, try again.");
			}
		}	
		return gender;
	}
	
	public static String getYear(Scanner input)
	{
		String year = null;
		boolean correctValue = false;
		
		while (!correctValue)
		{
			try 
			{
				System.out.print("Enter a year (2001 - 2010) > ");
				year = input.next();
				
				while (Integer.parseInt(year) < 2001 || Integer.parseInt(year) > 2010)
				{
					System.out.print("Year must range from 2001 - 2010 > ");
					year = input.next();
				}
				correctValue = true;
			}
			catch (Exception ex)
			{
				System.out.println("Incorrect value, try again.");
			}
		}	
		return year;
	}
}

package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Name for both genders
 * Write a program that prompts the user to enter one of 
 * the filenames described in Programming Exercise 12.31 and displays the names 
 * that are used for both genders in the file. Use sets to store names and find common 
 * names in two sets.
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	 public static void main(String[] args) throws FileNotFoundException 
	 {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name for baby name ranking: ");
		File file = new File(input.nextLine());
		
		if (!file.exists())
		{
			System.out.print("File not found.. ending program..");
			System.exit(1);
		}
		input.close();
		input = new Scanner(file);
		
		Set<String> boyNames = new HashSet<>();
		Set<String> girlNames = new HashSet<>();
		
		while (input.hasNext())
		{
			input.nextInt();
			boyNames.add(input.next());
			input.nextInt();
			girlNames.add(input.next());
			input.nextInt();
		}
		
		boyNames.retainAll(girlNames);
		System.out.println("There are " + boyNames.size() + " total names for both genders.");
		ArrayList<String> names = new ArrayList<>(boyNames);
		
		for (int i = 0; i < names.size(); i++)
			 if ((i + 1) % 10 == 0)
				 System.out.println(names.get(i) + " ");
			 else
				 System.out.print(names.get(i) + " ");
		input.close();
	 }
}

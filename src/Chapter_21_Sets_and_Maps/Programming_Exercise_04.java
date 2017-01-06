package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Count consonants and vowels
 * Write a program that prompts the user to enter a text 
 * file name and displays the number of vowels and consonants in the file. 
 * Use a set to store the vowels A, E, I, O, and U.
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) throws FileNotFoundException  
	{
		if (args.length != 1)
		{
			System.out.println("Missing arguments.. termininating program..");
			System.exit(0);
		}
		
		Set<Character> set = new HashSet<>(Arrays.asList(new Character[] {'A', 'E', 'I', 'O', 'U'}));
		try (Scanner input = new Scanner(new File(args[0]));)
		{
			int vowelCount = 0;
			int consonantCount = 0;
			
			while(input.hasNext())
			{
				String line = input.next().trim();
				System.out.println(line);
				
				for (int i = 0; i < line.length(); i++)
					if (set.contains(Character.toUpperCase(line.charAt(i))))
						vowelCount++;
					else if (Character.isLetter(line.charAt(i)))
						consonantCount++;
			}
			
			System.out.print("Vowels: " + vowelCount 
					+ "\nConsonants: " + consonantCount);
		}
	}
}

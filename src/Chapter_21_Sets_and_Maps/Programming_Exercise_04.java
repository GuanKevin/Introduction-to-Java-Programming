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
 * 01/04/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text file: ");
		
		File textFile = new File(input.nextLine());
		if (!textFile.exists())
		{
			System.out.print("Text file not found! Terminating program..");
			System.exit(0);
		}
		
		Set<Character> set = new HashSet<>(Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'}));
		try (Scanner textReader = new Scanner(textFile))
		{
			int vowelCount = 0;
			int consonantCount = 0;
			while (textReader.hasNext())
			{
				String text = textReader.nextLine().trim();
				System.out.println(text);
				
				for (int i = 0; i < text.length(); i++)
					if (set.contains(Character.toUpperCase(text.charAt(i))))
						vowelCount++;
					else if (Character.isLetter(text.charAt(i)))
						consonantCount++;
			}
			System.out.print("Vowels: " + vowelCount
					+ "\nConsonants: " + consonantCount);
		}
		
		input.close();
	}
}

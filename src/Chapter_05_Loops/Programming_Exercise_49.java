package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Count vowels and consonants
 * Assume letters A, E, I, O, and U as the vowels. 
 * Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
 * 
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_49 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String myString = input.nextLine().toLowerCase();
		int vowelCounter = 0;
		int consonantCounter = 0;
		
		
		//Programming is fun
		//11 consonants
		//5 vowels
		for (int i = 0; i < myString.length(); i++)
		{
			if (myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' 
					|| myString.charAt(i) == 'o' || myString.charAt(i) == 'u')
			{
				vowelCounter++;
			}
			else if (myString.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				consonantCounter++;
			}
		}
		
		System.out.println(myString + " has " +
		"\n" + vowelCounter + " vowel(s)"
		+ "\n" + consonantCounter + " consonant(s)");
		
		input.close();
	}
}

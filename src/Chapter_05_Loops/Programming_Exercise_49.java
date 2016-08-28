package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Count vowels and consonants
 * Assume letters A, E, I, O, and U as the vowels. 
 * Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_49 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String countVC = input.nextLine().toLowerCase();
		int vowelCounter = 0;
		int consonantCounter = 0;
		
		for (int i = 0; i < countVC.length(); i++)
		{
			if (countVC.charAt(i) == 'a' || countVC.charAt(i) == 'e' || countVC.charAt(i) == 'i' || countVC.charAt(i) == 'o' || countVC.charAt(i) == 'u')
				vowelCounter++;
			else if (countVC.charAt(i) == ' ')
				continue;
			else
				consonantCounter++;
		}
		
		System.out.print(countVC + " has " + vowelCounter + " vowels and " + consonantCounter + " consonants.");
		
		input.close();
	}
}

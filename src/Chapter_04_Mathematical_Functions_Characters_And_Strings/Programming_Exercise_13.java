package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Vowel or consonant?
 * Write a program that prompts the user to enter a letter 
 * and check whether the letter is a vowel or consonant.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Vowel -> a e i o u
		//Consonant -> Everything else but vowels
		System.out.print("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		
		//Checking every single letter 
		if (letter == 'a' || letter == 'A' || 
				letter == 'e' || letter == 'E' ||
				letter == 'i' || letter == 'I' ||
				letter == 'o' || letter == 'O' ||
				letter == 'u' || letter == 'U')
		{
			System.out.print(letter + " is a vowel!");
		}
		else if (Character.isLetter(letter))
		{
			System.out.print(letter + " is a consonant!");
		}
		else
		{
			System.out.print(letter + " is not a letter!");
		}
		
		
		input.close();
	}

}

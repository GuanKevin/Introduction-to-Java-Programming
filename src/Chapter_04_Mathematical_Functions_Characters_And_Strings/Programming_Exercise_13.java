package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Vowel or consonant?
 * Write a program that prompts the user to enter a letter 
 * and check whether the letter is a vowel or consonant.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char voc = input.next().charAt(0);
		
		if (voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u')
			System.out.print(voc + " is a vowel");
		else
			System.out.print(voc + " is a consonant");
	
		input.close();
	}
}

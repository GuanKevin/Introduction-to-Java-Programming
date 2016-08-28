package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Count Uppercase Letters
 * Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_50 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String uppercaseLetter = input.nextLine();
		
		int counter = 0;
		
		for (int i = 0; i < uppercaseLetter.length(); i++)
			if (Character.isUpperCase(uppercaseLetter.charAt(i)))
				++counter;
		
		System.out.printf("The number of uppercase lettrs is %d", counter);
		
		input.close();
	}
}

package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Count uppercase letters
 * Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.
 * 
 * 03/24/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_50 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String myString = input.nextLine();
		int uppercaseCounter = 0;
		
		for (int i = 0; i < myString.length(); i++)
		{
			if (myString.charAt(i) >= 65 && myString.charAt(i) <= 90)
			{
				uppercaseCounter++;
			}
		}
		
		System.out.print(myString + " has " + uppercaseCounter + " uppercase letters!");
		
		input.close();
	}
}

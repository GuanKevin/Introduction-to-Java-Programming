package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Process a string
 * Write a program that prompts the user to enter a string and displays its length and its first character.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String processString = input.nextLine();
		
		System.out.print("Length: " + processString.length() 
							+ "\nFirst Character: " + processString.charAt(0));
		
		input.close();
	}
}
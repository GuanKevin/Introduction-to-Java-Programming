package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Process a string
 * Write a program that prompts the user to enter a string and displays its length and its first character.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		
		System.out.print("The length of " + string + " is " + string.length() 
		+ " and its first character is " + string.charAt(0));
		input.close();
	}

}
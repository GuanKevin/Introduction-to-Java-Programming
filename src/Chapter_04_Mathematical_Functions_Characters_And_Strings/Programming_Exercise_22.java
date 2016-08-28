package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Check substring
 * Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
 * 
 * 08/16/2016
 * @author kevgu 
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		if (s1.contains(s2))
			System.out.print(s1 + " contains " + s2);
		else
			System.out.print(s1 + " does not contain " + s2);
		
		input.close();
	}
}
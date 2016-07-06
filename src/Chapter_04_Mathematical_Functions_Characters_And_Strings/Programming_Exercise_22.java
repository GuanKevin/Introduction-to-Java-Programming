package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Check substring
 * Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//String1 --> Hello World!
		//String2 --> Hello
		//If String1 contains anything string or substring of string2
		System.out.print("Enter a string: ");
		String s1 = input.nextLine();
		System.out.print("Enter another string: ");
		String s2 = input.next();
		
		//s1 -> Hellow World!
		//s2 -> hellO
		//boolean is true or false
		if (s1.toLowerCase().contains(s2.toLowerCase()))
		{
			System.out.print(s2 + " is a substring of string " + s1);
		}
		else
		{
			System.out.print(s2 + " is not a substring of string " + s1);
		}
		
		input.close();
	}

}
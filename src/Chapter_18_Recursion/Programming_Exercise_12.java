package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Print the characters in a string reversely
 * Rewrite Programming Exercise 18.9 using a helper method to pass the substring high index to the method. 
 * The helper method header is:
 * public static void reverseDisplay(String value, int high)
 * 
 * 06/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a string: ");
		String value = input.nextLine();
		reverseDisplay(value, value.length() - 1);
	}
	
	/*
	 * Take a string, and it's going to take the length of the string
	 * With the length, which is the "helper value", it will 
	 * figure out which character to print out
	 * Hello --> olleH
	 * 
	 */
	public static void reverseDisplay(String value, int high)
	{
		if (high < 0)
		{
			return;
		}
		
		System.out.print(value.charAt(high));
		reverseDisplay(value, --high);
	}
}

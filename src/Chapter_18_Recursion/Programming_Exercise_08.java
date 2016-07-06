package Chapter_18_Recursion;
import java.util.Scanner;

/**
 * Print the digits in an integer reversely
 * Write a recursive method that displays an int value reversely on the console using the following header: 
 * public static void reverseDisplay(int value) 
 * For example, reverseDisplay(12345) displays 54321. 
 * Write a test program that prompts the user to enter an integer and displays its reversal.
 * 
 * 06/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number to be reversed: ");
		int value = input.nextInt();
		
		System.out.print("The reverse of " + value + " is ");
		reverseDisplay(value);
	}
	
	/*
	 * It takes in an integer and reverse it and display through recursion
	 */
	public static void reverseDisplay(int value)
	{
		if ((value % 10) == 0)
		{
			return;
		}
		
		System.out.print(value % 10);
		reverseDisplay(value / 10);
	}
}

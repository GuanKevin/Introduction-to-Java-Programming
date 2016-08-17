package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Palindrome number
 * Write a program that prompts the user to enter a three-digit integer 
 * and determines whether it is a palindrome number. 
 * A number is palindrome if it reads the same from right to left and from left to right.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args)  
	{
		Scanner input = new Scanner(System.in);
		int digit, lhs, rhs;
		System.out.print("Enter a three-digit integer: ");
		digit = input.nextInt();
		lhs = digit / 100;
		rhs = digit % 10;
		
		if (rhs == lhs) 
		{
			System.out.print(digit + " is a palindrome!");
		}
		else
		{
			System.out.print(digit + " not is a palindrome!");
		}
		
		input.close();
	}
}

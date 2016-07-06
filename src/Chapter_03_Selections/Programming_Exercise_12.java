package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Palindrome number
 * Write a program that prompts the user to enter a three-digit integer 
 * and determines whether it is a palindrome number. 
 * A number is palindrome if it reads the same from right to left and from left to right.
 * 
 * 02/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		int palindrome, right, left;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		palindrome = input.nextInt();
		
		// 1 2 3
		// ? x ?
		// 0 1 0 <--
		right = palindrome % 10;
		left = palindrome / 100;
		
		if (right == left)
		{
			System.out.print(palindrome + " is a palindrome.");
		}
		else
		{
			System.out.print(palindrome + " is not a palindrome.");
		}
		
		input.close();
	}

}

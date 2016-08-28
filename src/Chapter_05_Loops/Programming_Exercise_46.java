package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Reverse a String
 * Write a program that prompts the user to enter a string and displays the string in reverse order. 
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_46 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String reverse = input.nextLine();
		
		for (int i = reverse.length() - 1; i >= 0; i--)
			System.out.print(reverse.charAt(i));
		
		input.close();
	}
}

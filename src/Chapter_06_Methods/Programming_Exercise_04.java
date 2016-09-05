package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Display an integer reversed
 * Write a method with the following header to display an integer in reverse order: 
 * public static void reverse(int number) 
 * For example, reverse(3456) displays 6543. 
 * Write a test program that prompts the user to enter an integer and displays its reversal.
 * 
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		reverse(number);
		
		input.close();		
	}
	
	/**
	 * Display an integer in reverse order
	 * 
	 * @param number
	 */
	public static void reverse(int number)
	{
		System.out.print(new StringBuilder(Integer.toString(number)).reverse().toString());
	}
}

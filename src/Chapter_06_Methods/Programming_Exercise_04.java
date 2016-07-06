package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Display an integer reversed
 * Write a method with the following header to display an integer in reverse order: 
 * public static void reverse(int number) 
 * For example, reverse(3456) displays 6543. 
 * Write a test program that prompts the user to enter an integer and displays its reversal.
 * 
 * 02/16/2016
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
	
	public static void reverse(int number) 
	{
		int sum = 0;
		int counter = 0;
		
		while (number != 0)
		{
			if (counter == 0)
			{
				sum = number % 10;
				number /= 10;
				counter++;
			}
			else
			{
				sum = (sum * 10) + (number % 10);
				number /= 10;
				counter++;
			}
		}
		System.out.print(sum);
	}
}

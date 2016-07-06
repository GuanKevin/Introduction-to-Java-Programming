package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Sort three numbers
 * Write a method with the following header to display three numbers in increasing order: 
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
 *
 * 02/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		displaySortedNumbers(input.nextDouble(), input.nextDouble(), input.nextDouble());
		input.close();		
	}

	public static void displaySortedNumbers(double num1, double num2, double num3)
	{

		if (num1 < num2 && num1 < num2)
		{	
			if (num2 < num3)
			{
				System.out.print(num1 + " " + num2 + " " + num3);
			}
			else
			{
				System.out.print(num1 + " " + num3 + " " + num2);
			}
		}
		else if (num2 < num1 && num2 < num3)
		{
			if (num1 < num3)
			{
				System.out.print(num2 + " " + num1 + " " + num3);
			}
			else
			{
				System.out.print(num1 + " " + num3 + " " + num1);
			}
		}
		else
		{
			if (num1 < num2)
			{
				System.out.print(num3 + " " + num1 + " " + num2);
			}
			else
			{
				System.out.print(num3 + " " + num2 + " " + num1);
			}
		}
	}
}

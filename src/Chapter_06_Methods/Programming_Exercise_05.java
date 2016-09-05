package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Sort three numbers
 * Write a method with the following header to display three numbers in increasing order: 
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
 *
 * 08/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1, num2, num3;
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
		
		input.close();		
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		if (num1 < num2 && num2 < num3)
			System.out.println(num1 + " " + num2 + " " + num3);
		else if (num1 < num3 && num3 < num2)
			System.out.println(num1 + " " + num3 + " " + num2);
		else if (num2 < num1 && num1 < num3)
			System.out.println(num2 + " " + num1 + " " + num3);
		else if (num2 < num3 && num3 < num1)
			System.out.println(num2 + " " + num3 + " " + num1);
		else if (num3 < num1 && num1 < num2)
			System.out.println(num3 + " " + num1 + " " + num2);
		else 
			System.out.println(num3 + " " + num2 + " " + num1);
	}
}

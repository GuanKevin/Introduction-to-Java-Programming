package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Financial application: monetary units
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy 
 * when converting a double value to an int value. 
 * Enter the input as an integer whose last two digits represent the cents.
 * 
 * 02/04/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int value, dollar, quarter, dime, nickel, penny, remaining;
		System.out.print("Enter a value: ");
		value = input.nextInt();
		
		//Find amount of dollars
		dollar = value / 100;
		remaining = value % 100;
		quarter = remaining / 25;
		remaining = remaining % 25;
		dime = remaining / 10;
		remaining = remaining % 10;	
		nickel = remaining / 5;
		remaining = remaining % 5;
		penny = remaining / 1;
		
		System.out.println("Dollars Quarters Dimes Nickels Pennies");
		System.out.print(dollar + "\t" + quarter + "\t" + dime + "\t" + nickel + "\t" + penny);
		
		input.close();
	}
}

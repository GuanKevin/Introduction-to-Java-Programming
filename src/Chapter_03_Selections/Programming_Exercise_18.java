package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Cost of shipping
 * A shipping company uses the following function to calculate the cost (in dollars) of 
 * shipping based on the weight of the package (in pounds).
 * Write a program that prompts the user to enter the weight of the package and display the shipping cost. 
 * If the weight is greater than 50, display a message “the package cannot be shipped.”
 * 
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double weight;
		System.out.print("Enter the weight: ");
		weight = input.nextDouble();
		
		if (weight <= 1)
		{
			System.out.print("Shipping cost is: " + weight * 3.5);
		}
		else if (weight <= 3)
		{
			System.out.print("Shipping cost is: " + weight * 5.5);
		}
		else if (weight <= 10)
		{
			System.out.print("Shipping cost is: " + weight * 8.5);
		}
		else if (weight <= 20)
		{
			System.out.print("Shipping cost is: " + weight * 10.5);
		}
		else if (weight < 50)
		{
			System.out.print("Shipping cost is: " + weight * 11.5);
		}
		else
		{
			System.out.print("The package can not be shipped");
		}
		
		input.close();
	}
}

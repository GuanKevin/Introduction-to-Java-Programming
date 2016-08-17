package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Cost of shipping
 * A shipping company uses the following function to calculate the cost (in dollars) of 
 * shipping based on the weight of the package (in pounds).
 * Write a program that prompts the user to enter the weight of the package and display the shipping cost. 
 * If the weight is greater than 20, display a message “the package cannot be shipped.”
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args)  
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();
		
		if (weight > 20)
			System.out.print("The package cannot be shipped!");
		else if (weight <= 1)
			System.out.print("The cost of the package is " + weight);
		else if (weight <= 3)
			System.out.print("The cost of the package is " + weight * 5.5);
		else if (weight <= 10)
			System.out.print("The cost of the package is " + weight * 8.5);
		else
			System.out.print("The cost of the package is " + weight * 10.5);
		
		input.close();
	}
}

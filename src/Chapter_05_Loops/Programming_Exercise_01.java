package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Count positive and negative numbers and compute the average of numbers
 * Write a program that reads an unspecified number of integers, 
 * determines how many positive and negative values have been read, 
 * and computes the total and average of the input values (not counting zeros). 
 * Your program ends with the input 0. 
 * Display the average as a floating-point number.
 * 
 * 03/24/2016
 * @author kevgu
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		int positiveNumCounter = 0;
		int negativeNumCounter = 0;
		int totalNumCounter = 0;
		float average = 0;
		int userInput;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number. Enter 0 to stop: ");
		userInput = input.nextInt();
		
		while (userInput != 0)
		{
			if (userInput > 0)
			{
				positiveNumCounter++;
				//++positiveNumCounter;
				//positiveNumCounter += 1;
				//positiveNumCounter = positiveNumCounter + 1;
			}
			else
			{
				negativeNumCounter++;
			}
			totalNumCounter++;
			average += userInput;
			
			userInput = input.nextInt();
		}
		
		if (totalNumCounter == 0)
		{
			System.out.println("No numbers were entered!");
		}
		else
		{
			System.out.println("Postive Number Inputs: " + positiveNumCounter 
					+ "\nNegative Number Inputs: " + negativeNumCounter 
					+ "\nTotal Number Inputs: " + totalNumCounter
					+ "\nAverage: " + average/totalNumCounter);
		}
		
		input.close();
	}
}

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
 * 08/18/2016
 * @author kevgu
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		float positiveSum = 0;
		float negativeSum = 0;
		float number;
		int positiveCounter = 0;
		int negativeCounter = 0;
		
		System.out.print("Enter the number: ");
		number = input.nextFloat();
		
		while (number != 0)
		{
			if (number > 0)
			{
				positiveSum += number;
				positiveCounter++;
			}
			else
			{
				negativeSum += number;
				negativeCounter++;
			}
			number = input.nextFloat();
		}
		
		System.out.print("Positive sum: " + positiveSum
				+ "\nNegative sum: " + negativeSum
				+ "\nPositive average: " + positiveSum / positiveCounter
				+ "\nNegative average:: " + negativeSum / negativeCounter);
		
		input.close();
	}
}

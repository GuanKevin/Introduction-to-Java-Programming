package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Statistics: compute deviation
 * Programming Exercise 5.45 computes the standard deviation of numbers. 
 * This exercise uses a different but equivalent formula to compute the standard deviation of n numbers.
 * 
 * 09/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		System.out.print("Enter n size: ");
		double[] deviationArray = new double[input.nextInt()];
		insertNumbers(deviationArray);
		double summationMean = summationWithMean(deviationArray, findMean(deviationArray));
		System.out.print("Mean is: " + findMean(deviationArray)
		+ "\nDeviation is: " + Math.sqrt(summationMean / (deviationArray.length - 1)));
		
		input.close();
	}
	
	/**
	 * Return the summation using mean
	 * 
	 * @param deviationArray
	 * @param mean
	 * @return
	 */
	public static double summationWithMean(double[] deviationArray, double mean)
	{
		double sumMean = 0;
		
		for (int i = 0; i < deviationArray.length; i++)
			sumMean += Math.pow((deviationArray[i] - mean), 2);
		
		return sumMean;
	}
	
	/**
	 * Return the mean of the array
	 * 
	 * @return
	 */
	public static double findMean(double[] deviationArray)
	{
		double mean = 0;
		
		for (int i = 0; i < deviationArray.length; i++)
			mean += deviationArray[i];
		
		return mean / deviationArray.length;
	}
	
	/**
	 * prompts the user to enter n numbers
	 * 
	 * @param minimumElementArray
	 */
	public static void insertNumbers(double[] deviationArray)
	{
		System.out.print("Enter " + deviationArray.length + " numbers: ");
		
		for (int i = 0; i < deviationArray.length; i++)
			deviationArray[i] = input.nextDouble();
	}
}

package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Computing gcd
 * Write a method that returns the gcd of an unspecified number of integers. 
 * The method header is specified as follows: 
 * public static int gcd(int... numbers) 
 * Write a test program that prompts the user to enter five numbers, invokes the method to find the gcd of these numbers, 
 * and displays the gcd.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{		
		final int SIZE = 5;
		int[] myarray = new int[SIZE];
		inputIntegers(myarray);
		System.out.print("The GCD of: ");
		displayNumbers(myarray);
		System.out.print("is " + gcd(myarray)); 
		
	};
	
	/**
	 * Return the GCD of the numbers in the array
	 * @param numbers
	 * @return
	 */
	public static int gcd(int... numbers)
	{
		int smallestelement = minElement(numbers);
		boolean foundgcd = true;

		
		while (foundgcd)
		{
			for (int i = 0; i < numbers.length; i++)
			{
				if ((numbers[i] % smallestelement) != 0)
				{
					smallestelement--;
					break;
				}
				if ((numbers.length - 1) == i)
				{
					foundgcd = false;
				}
			}
		}
		
		return smallestelement;
	}
	
	/**
	 * It takes an array, and fill it up with integer inputs
	 * @param myarray
	 */
	public static void inputIntegers(int[] myarray)
	{
		System.out.print("Enter " + myarray.length + " numbers: ");
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = input.nextInt();
		}
	}
	
	/**
	 * Returns smallest element from an array
	 * @param myarray
	 * @return
	 */
	public static int minElement(int[] myarray)
	{
		int smallestelement = myarray[0];
		
		for (int i = 1; i < myarray.length; i++)
		{
			if (smallestelement > myarray[i])
			{
				smallestelement = myarray[i];
			}
		}
		
		return smallestelement;
	}
	
	/**
	 * Prints out the list of integers in the array
	 * @param myarray
	 */
	public static void displayNumbers(int[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			System.out.print(myarray[i] + " ");
		}
	}
}

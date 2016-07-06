package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Compute the weekly hours for each employee
 * Suppose the weekly hours for all employees are stored in a two-dimensional array. 
 * Each row records an employee’s seven-day work hours with seven columns. 
 * For example, the following array stores the work hours for eight employees. 
 * Write a program that displays employees and their total hours in decreasing order of the total hours.
 *   M  T  W  T  F  S  S
 * 0 [] [] [] [] [] [] []
 * 1 [] [] [] [] [] [] []
 * 2 [] [] [] [] [] [] []
 * 3 [] [] [] [] [] [] []
 * 4 [] [] [] [] [] [] []
 * 5 [] [] [] [] [] [] []
 * 6 [] [] [] [] [] [] []
 * 7 [] [] [] [] [] [] []
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	static Scanner input = new Scanner(System.in);
	static final int DAYS = 7; 
	public static void main(String[] args) 
	{
		System.out.print("Enter the numbers of employees: ");
		int employees = input.nextInt();
		double[][] mymatrix = new double[employees][DAYS];
		insertHours(mymatrix);
		printHourSum(mymatrix);
		sortEmployeeByHour(mymatrix);
		//printEmployeeHours(mymatrix);
		printHourSum(mymatrix);
	}
	
	/**
	 * Print the sum of hours of the employees in descending order
	 * @param mymatrix
	 */
	public static void printHourSum(double[][] mymatrix)
	{
		for (int i = 0; i < mymatrix.length; i++)
		{
			System.out.printf("Employee " + (i + 1) + " worked %.2f hours.\n", sumOfArray(mymatrix[i]));
		}

	}
	
	/**
	 * Sort employee in descending hours by hours in a week
	 * @param mymatrix
	 */
	public static void sortEmployeeByHour(double[][] mymatrix)
	{
		double[] temparray = new double[mymatrix.length];
		
		for (int i = 0; i < mymatrix.length; i++)
		{
			for (int j = 0; j < mymatrix.length - 1; j++)
			{
				if (sumOfArray(mymatrix[j]) < sumOfArray(mymatrix[j + 1]))
				{
					temparray = mymatrix[j];
					mymatrix[j] = mymatrix[j + 1];
					mymatrix[j + 1] = temparray;
				}
			}
		}
	}
	
	/**
	 * Adds up all the hours for that employee, and returns the sum
	 * @param mymatrix
	 * @return
	 */
	public static double sumOfArray(double[] mymatrix)
	{
		double sum = 0;
		
		for (int i = 0; i < mymatrix.length; i++)
		{
			sum += mymatrix[i];
		}
		
		return sum;
	}
	
	/**
	 * Insert hours in double data type into employee matrix
	 * @param mymatrix
	 */
	public static void insertHours(double[][] mymatrix)
	{
		Random rand = new Random();
		
		for (int i = 0; i < mymatrix.length; i++)
		{
			for (int j = 0; j < DAYS; j++)
			{
				mymatrix[i][j] = rand.nextDouble() * 8 + 5;
			}
		}
	}
	
	/**
	 * Prints employees hours for every day of the week
	 * @param mymatrix
	 */
	public static void printEmployeeHours(double[][] mymatrix)
	{
		for (int i = 0; i < mymatrix.length; i++)
		{
			for (int j = 0; j < DAYS; j++)
			{
				System.out.printf("%.2f %-1s", mymatrix[i][j], " ");
			}
			System.out.println();
		}
	}
}

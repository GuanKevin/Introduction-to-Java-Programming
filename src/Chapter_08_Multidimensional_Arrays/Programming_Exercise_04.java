package Chapter_08_Multidimensional_Arrays;

import java.util.Random;

/**
 * Compute the weekly hours for each employee
 * Suppose the weekly hours for all employees are stored in a two-dimensional array. 
 * Each row records an employee’s seven-day work hours with seven columns. 
 * For example, the following array stores the work hours for eight employees. 
 * Write a program that displays employees and their total hours in decreasing order of the total hours.
 * 
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
 * 10/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		int numberOfEmployees = 10;
		int daysOfWeek = 7;
		
		double[][] weeklyHours = new double[numberOfEmployees][daysOfWeek];
		int[] empID = new int[numberOfEmployees];
		
		setIDNum(empID);
		setHours(weeklyHours);
		displayWeeklyHours(weeklyHours, empID);
		sortHours(weeklyHours, empID);
		displayWeeklyHours(weeklyHours, empID);
	}
	
	/**
	 * Set employee ID number
	 * 
	 * @param empID
	 */
	public static void setIDNum(int[] empID)
	{
		for (int i = 0; i < empID.length; i++)
			empID[i] = i + 1;
	}
	
	/**
	 * Sort employee by the amount of hours worked in decreasing order
	 * 
	 * @param weeklyHours
	 */
	public static void sortHours(double[][] weeklyHours, int[] empID)
	{
		for (int i = 0; i < weeklyHours.length - 1; i++)
			for (int j = i + 1; j < weeklyHours.length; j++)
			{
				if (getSum(weeklyHours[i]) > getSum(weeklyHours[j]))
				{
					double[] tempArray = weeklyHours[i];
					weeklyHours[i] = weeklyHours[j];
					weeklyHours[j] = tempArray;
					
					int tempID = empID[i];
					empID[i] = empID[j];
					empID[j] = tempID;
				}
			}
	}
	
	/**
	 * Return the total amount of hours worked in the week
	 * 
	 * @param weeklyHours
	 * @return
	 */
	public static double getSum(double[] weeklyHours)
	{
		double hoursWorked = 0;
		
		for (int i = 0; i < weeklyHours.length; i++)
			hoursWorked += weeklyHours[i];
		
		return hoursWorked;
	}
	
	/**
	 * Display day and employee's work hour
	 * 
	 * @param weeklyHours
	 */
	public static void displayWeeklyHours(double[][] weeklyHours, int[] empID)
	{
		System.out.printf("%10s%7s%7s%7s%7s%7s%7s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		for (int i = 0; i < weeklyHours.length; i++)
		{
			double hourSum = 0;
			System.out.printf("%s%-2d ", "Emp ", empID[i]);
			for (int j = 0; j < weeklyHours[i].length; j++)
			{
				System.out.printf("[%.2f] ", weeklyHours[i][j]);
				hourSum += weeklyHours[i][j];
			}
			System.out.printf("%s%.2f%s\n", "= ", hourSum, " hours");
		}
	}
	
	/**
	 * Set hours for each day of the week for all employees
	 * 
	 * @param weeklyHours
	 */
	public static void setHours(double[][] weeklyHours)
	{
		Random randomHour = new Random();
		
		for (int i = 0; i < weeklyHours.length; i++)
			for (int j = 0; j < weeklyHours[i].length; j++)
				weeklyHours[i][j] = randomHour.nextDouble() * 9.9;
	}
}

package Chapter_02_Elementary_Programming;

import java.util.Scanner;

/**
 * Find the number of years 
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
 * For simplicity, assume a year has 365 days.
 * 
 * 07/31/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int daysInYear = 365;
		System.out.print("Enter the minutes: ");
		int minute = input.nextInt();
		int year = ((minute / 60) / 24) / daysInYear;
		int day = ((minute / 60) / 24) % daysInYear;
		System.out.print(minute + " equates to " + year + " year(s) and " 
							+ day + " day(s)");
		
		input.close();
	}
}

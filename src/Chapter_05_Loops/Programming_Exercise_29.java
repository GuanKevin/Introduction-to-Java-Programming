package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Display calendars
 * Write a program that prompts the user to enter the year 
 * and first day of the year and displays the calendar table for the year on the console. 
 * For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, 
 * your program should display the calendar for each month in the year
 * 
 * 08/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_29 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year and day: ");
		int year = input.nextInt();
		int day = input.nextInt();
		int dayCounter = day;
		
		System.out.printf("\n %13s %d \n", "January", year);
		System.out.println("---------------------------");
		System.out.printf("%s %s %s %s %s %s %s \n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		
		for(int i = 1; i <= day; i++)
			System.out.printf("%-4s", "");
		
		for (int i = 1; i <= 31; i++)
		{
			dayCounter++;
			
			if (dayCounter % 7 == 0)
				System.out.printf("%-4d \n", i);
			else
				System.out.printf("%-4d", i);
		}
		
		System.out.printf("\n \n %13s %d \n", "February", year);
		System.out.println("---------------------------");
		System.out.printf("%s %s %s %s %s %s %s \n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		
		for(int i = 1; i <= dayCounter % 7; i++)
			System.out.printf("%-4s", "");
		
		if (year % 4 == 0)
		{
			if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0)
				day = 29;
			else
				day = 28;
		}
		else
			day = 28;
		
		for (int i = 1; i <= day; i++)
		{
			dayCounter++;
			
			if (dayCounter % 7 == 0)
				System.out.printf("%-4d \n", i);
			else
				System.out.printf("%-4d", i);
		}
		
		System.out.printf("\n \n %13s %d \n", "March", year);
		System.out.println("---------------------------");
		System.out.printf("%s %s %s %s %s %s %s \n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		
		for(int i = 1; i <= dayCounter % 7; i++)
			System.out.printf("%-4s", "");
		
		for (int i = 1; i <= 31; i++)
		{
			dayCounter++;
			
			if (dayCounter % 7 == 0)
				System.out.printf("%-4d \n", i);
			else
				System.out.printf("%-4d", i);
		}
		
		input.close();
	}
}

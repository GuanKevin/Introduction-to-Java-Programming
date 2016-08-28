package Chapter_05_Loops;

import java.util.Scanner;

/**
 * Display the first days of each month
 * Write a program that prompts the user to enter the year and first day of the year, 
 * and displays the first day of each month in the year. 
 * For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, 
 * your program should display the following output: 
 * January 1, 2013 is Tuesday 
 * ... 
 * December 1, 2013 is Sunday
 * 
 * 08/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_28 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year and day: ");
		int year = input.nextInt();
		int day = input.nextInt();
		int dayCounter = day;
		String dayOfWeek = "";
		
		if (day == 0)
			dayOfWeek = "Sunday";
		else if (day == 1)
			dayOfWeek = "Monday";
		else if (day == 2)
			dayOfWeek = "Tuesday";
		else if (day == 3)
			dayOfWeek = "Wednesday";
		else if (day == 4)
			dayOfWeek = "Thursday";
		else if (day == 5)
			dayOfWeek = "Friday";
		else
			dayOfWeek = "Saturday";
		
		System.out.println("January 1, " + year + " is " + dayOfWeek);
		
		dayCounter += 31;
		
		if (dayCounter % 7 == 0)
			dayOfWeek = "Sunday";
		else if (dayCounter % 7 == 1)
			dayOfWeek = "Monday";
		else if (dayCounter % 7 == 2)
			dayOfWeek = "Tuesday";
		else if (dayCounter % 7 == 3)
			dayOfWeek = "Wednesday";
		else if (dayCounter % 7 == 4)
			dayOfWeek = "Thursday";
		else if (dayCounter % 7 == 5)
			dayOfWeek = "Friday";
		else
			dayOfWeek = "Saturday";
		
		System.out.println("February 1, " + year + " is " + dayOfWeek);
		
		if (year % 4 == 0)
		{
			if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0)
				day = 29;
			else
				day = 28;
		}
		else
			day = 28;
		
		dayCounter += day;
		
		if (dayCounter % 7 == 0)
			dayOfWeek = "Sunday";
		else if (dayCounter % 7 == 1)
			dayOfWeek = "Monday";
		else if (dayCounter % 7 == 2)
			dayOfWeek = "Tuesday";
		else if (dayCounter % 7 == 3)
			dayOfWeek = "Wednesday";
		else if (dayCounter % 7 == 4)
			dayOfWeek = "Thursday";
		else if (dayCounter % 7 == 5)
			dayOfWeek = "Friday";
		else
			dayOfWeek = "Saturday";
		
		System.out.println("March 1, " + year + " is " + dayOfWeek);
		
		input.close();
	}
}

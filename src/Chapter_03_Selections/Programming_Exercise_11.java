package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Find the number of days in a month
 * Write a program that prompts the user to enter the month and year and displays the number of days in the month. 
 * For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days. 
 * If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
 * 
 * 02/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month, year, day;
		String themonth = null;
		System.out.print("Enter the month: ");
		month = input.nextInt();
		System.out.print("Enter the year: ");
		year = input.nextInt();
		
		//30 days -> April(4), June(6), September(9), November(11)
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			day = 30;
		}
		//February --> 28 or 29
		else if (month == 2)
		{
			if ((year % 4) == 0)
			{
				day = 29;
				themonth = "February";
			}
			else
			{
				day = 28;
				themonth = "February";
			}
		}
		else
		{
			day = 31;
		}
		
		if (month == 1)
			themonth = "January";
		if (month == 3)
			themonth = "March";
		if (month == 4)
			themonth = "April";
		if (month == 5)
			themonth = "May";
		if (month == 6)
			themonth = "June";
		if (month == 7)
			themonth = "July";
		if (month == 8)
			themonth = "August";
		if (month == 9)
			themonth = "September";
		if (month == 10)
			themonth = "October";
		if (month == 11)
			themonth = "November";
		if (month == 12)
			themonth = "December";
		
		System.out.print(themonth + " " + year + " has " + day + ".");
		
		input.close();
	}
}

package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Find the number of days in a month
 * Write a program that prompts the user to enter the month and year and displays the number of days in the month. 
 * For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days. 
 * If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month, year;
		System.out.print("Enter the month: ");
		month = input.nextInt();
		System.out.print("Enter the year: ");
		year = input.nextInt();
		
		/**
		 * If it is divisible by 4 --> leap year
		 * Unless it is divisible by 100 --> not leap year
		 * But if divisible by 100 an d divisible by 400 --> leap year
		 */
		
		if (month == 2)
		{
			if (year % 4 == 0)
			{
				if (year % 100 == 0 && year % 400 != 0)
				{
					System.out.print("February " + year + " had 28 days.");
				}
				else
					System.out.print("February " + year + " had 29 days.");
			}
			else
				System.out.print("February " + year + " had 28 days.");
		}
		else if (month == 4 && month == 6 && month == 9 && month == 11)
		{
			if (month == 4)
			{
				System.out.print("April " + year + " had 30 days.");
			}
			else if (month == 6)
			{
				System.out.print("June " + year + " had 30 days.");
			}
			else if (month == 9)
			{
				System.out.print("Septermber " + year + " had 30 days.");
			}
			else
				System.out.print("November " + year + " had 30 days.");
		}
		else
		{
			if (month == 1)
			{
				System.out.print("January " + year + " had 31 days.");
			}
			else if (month == 3)
			{
				System.out.print("March " + year + " had 31 days.");
			}
			else if (month == 5)
			{
				System.out.print("May " + year + " had 31 days.");
			}
			else if (month == 7)
			{
				System.out.print("July " + year + " had 31 days.");
			}
			else if (month == 8)
			{
				System.out.print("August " + year + " had 31 days.");
			}
			else if (month == 10)
			{
				System.out.print("October " + year + " had 31 days.");
			}
			else
				System.out.print("December " + year + " had 31 days.");
		}
		
		input.close();
	}
}

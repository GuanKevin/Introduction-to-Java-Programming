package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Display leap years
 * Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exactly one space. 
 * Also display the number of leap years in this period.
 * 
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		/*
		 * How do we check for leap years?
		 * 1. If the year is evenly divisible by 4, go to step 2. ...
		 * 2. If the year is evenly divisible by 100, go to step 3. ... 
		 * 3. If the year is evenly divisible by 400, go to step 4. ...
		 * 4. The year is a leap year (it has 366 days).
		 * 5. The year is not a leap year (it has 365 days).
		 */
		
		/*
		 * Wikipedia --> Leap Year
		 * if (year is not divisible by 4) then (it is a common year)
		 * else if (year is not divisible by 100) then (it is a leap year)
		 * else if (year is not divisible by 400) then (it is a common year)
		 * else (it is a leap year)
		 */
		
		int counter = 1;
		int leapYearCounter = 0;
		
		for (int i = 2000; i <= 2100; i++)
		{
			if ((i % 4) != 0)
			{
				continue;
			}
			else if ((i % 100) != 0)
			{
				if ((counter % 10) == 0)
				{
					System.out.println(i + " ");
				}
				else
				{
					System.out.print(i + " ");
				}
				
				counter++;
				leapYearCounter++;
				continue;
			}
			else if ((i % 400) != 0)
			{
				continue;
			}
			else
			{
				if ((counter % 10) == 0)
				{
					System.out.println(i + " ");
				}
				else
				{
					System.out.print(i + " ");
				}
				
				counter++;
				leapYearCounter++;
			}
		}
		
		System.out.println("\nLeap years in this period: " + leapYearCounter);
		
		input.close();
	}
}

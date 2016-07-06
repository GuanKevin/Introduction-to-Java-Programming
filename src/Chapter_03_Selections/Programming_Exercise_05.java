package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Find future dates
 * Write a program that prompts the user to enter an integer for today’s day of the week 
 * (Sunday is 0, Monday is 1, …, and Saturday is 6). 
 * Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 * 
 * 02/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int day, futureday, displayfuture;
		String today = null;
		String future = null;
		System.out.print("What is today's day? (Enter an integer): ");
		day = input.nextInt();
		System.out.print("Enter the number of days after today for a future day: ");
		futureday = input.nextInt();
		
		//Sunday --> Saturday, 0 --> 6
		displayfuture = (day + futureday) % 7;
		
		if (day == 0)
		{
			today = "Sunday";
		}
		else if (day == 1)
		{
			today = "Monday";
		}
		else if (day == 2)
		{
			today = "Tuesday";
		}
		else if (day == 3)
		{
			today = "Wednesday";
		}
		else if (day == 4)
		{
			today = "Thursday";
		}
		else if (day == 5)
		{
			today = "Friday";
		}
		else if (day == 6)
		{
			today = "Saturday";
		}
		
		//Find future day
		if (displayfuture == 0)
		{
			future = "Sunday";
		}
		else if (displayfuture == 1)
		{
			future = "Monday";
		}
		else if (displayfuture == 2)
		{
			future = "Tuesday";
		}
		else if (displayfuture == 3)
		{
			future = "Wednesday";
		}
		else if (displayfuture == 4)
		{
			future = "Thursday";
		}
		else if (displayfuture == 5)
		{
			future = "Friday";
		}
		else if (displayfuture == 6)
		{
			future = "Saturday";
		}
		
		System.out.print("Today is " + today + " and the future day is " + future);
		
		input.close();
	}

}

package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Find future dates
 * Write a program that prompts the user to enter an integer for today’s day of the week 
 * (Sunday is 0, Monday is 1, …, and Saturday is 6). 
 * Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 * 
 * 08/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the day of today and the future day: ");
		int today, future;
		today = input.nextInt();
		future = (today + input.nextInt()) % 7;
		
		if (today == 0)
		{
			System.out.print("Today is Sunday.");
		}
		else if (today == 1)
		{
			System.out.print("Today is Monday.");
		}
		else if (today == 2)
		{
			System.out.print("Today is Tuesday.");
		}
		else if (today == 3)
		{
			System.out.print("Today is Wednesday.");
		}
		else if (today == 4)
		{
			System.out.print("Today is Thursday.");
		}
		else if (today == 5)
		{
			System.out.print("Today is Friday.");
		}
		else
		{
			System.out.print("Today is Saturday.");
		}
		
		if (future == 0)
		{
			System.out.print("Future day is Sunday.");
		}
		else if (future == 1)
		{
			System.out.print("Future day is Monday.");
		}
		else if (future == 2)
		{
			System.out.print("Future day is Tuesday.");
		}
		else if (future == 3)
		{
			System.out.print("Future day is Wednesday.");
		}
		else if (future == 4) 
		{
			System.out.print("Future day is Thursday.");
		}
		else if (future == 5)
		{
			System.out.print("Future day is Friday.");
		}
		else
		{
			System.out.print("Future day is Saturday.");
		}
		
		input.close();
	}
}

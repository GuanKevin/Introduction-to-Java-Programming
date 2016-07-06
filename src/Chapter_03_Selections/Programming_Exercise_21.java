package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Science: day of the week
 * Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
 * Write a program that prompts the user to enter a year, month, and day of the month, 
 * and displays the name of the day of the week.
 * 
 * 02/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		System.out.println("Enter a month: ");
		System.out.println("Enter a day of the month: ");
		int year, month, day, zeller;
		year = input.nextInt();
		month = input.nextInt();
		day = input.nextInt();
		
		zeller = (day + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + (year / 100) + (5 * (year / 100))) % 7;
		
		if (zeller == 0)
		{
			System.out.println("The name of the day of the week is Sunday");
		}
		if (zeller == 1)
		{
			System.out.println("The name of the day of the week is Monday");
		}
		if (zeller == 2)
		{
			System.out.println("The name of the day of the week is Tuesday");
		}
		if (zeller == 3)
		{
			System.out.println("The name of the day of the week is Wednesday");
		}
		if (zeller == 4)
		{
			System.out.println("The name of the day of the week is Thursday");
		}
		if (zeller == 5)
		{
			System.out.println("The name of the day of the week is Friday");
		}
		if (zeller == 6)
		{
			System.out.println("The name of the day of the week is Saturday");
		}
		
		
		input.close();
	}

}

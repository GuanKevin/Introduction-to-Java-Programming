package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Science: day of the week
 * Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
 * Write a program that prompts the user to enter a year, month, and day of the month, 
 * and displays the name of the day of the week.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int year, month, day, century, yearOfCentury, dayOfWeek;
		System.out.print("Enter the year: ");
		year = input.nextInt();
		System.out.print("Enter the month: ");
		month = input.nextInt();
		System.out.print("Enter the day: ");
		day = input.nextInt();
		century = year / 100;
		yearOfCentury = year % 100;
		dayOfWeek = (day + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
		
		if (dayOfWeek == 0)
			System.out.print("The day of the week is Saturday");
		else if (dayOfWeek == 1)
			System.out.print("The day of the week is Sunday");
		else if (dayOfWeek == 2)
			System.out.print("The day of the week is Monday");
		else if (dayOfWeek == 3)
			System.out.print("The day of the week is Tuesday");
		else if (dayOfWeek == 4)
			System.out.print("The day of the week is Wednesday");
		else if (dayOfWeek == 5)
			System.out.print("The day of the week is Thursday");
		else
			System.out.print("The day of the week is Friday");
		
		input.close();
	}
}

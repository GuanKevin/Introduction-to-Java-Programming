package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Days of a month
 * Write a program that prompts the user to enter a year and the first three letters of a month name 
 * (with the first letter in uppercase) and displays the number of days in the month.
 * 
 * 08/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter first three letters of a month name: ");
		String month = input.next();
		
		if (month.equals("Feb"))
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0))
				System.out.print(month + " has 29 days");
			else
				System.out.print(month + " has 28 days");
		}
		else if  (month.equals("Apr") || month.equals("Jun"))
			System.out.print(month + " " + year + " has 30 days!");
		else
			System.out.print(month + " " + year + " has 31 days!");
		
		input.close();	
	}
}

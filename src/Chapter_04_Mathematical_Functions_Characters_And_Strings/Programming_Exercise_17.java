package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Days of a month
 * Write a program that prompts the user to enter a year and the first three letters of a month name 
 * (with the first letter in uppercase) and displays the number of days in the month.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter the first three letters of a month: ");
		String month = input.next();
		
		//28 days --> February
		//Leap years --> February --> 29
		//month == "Feb"
		if (month.equals("Feb"))
		{
			//Leap years are divided evenly by 4, 100, and 400
			if ((year%4 == 0) || (year%100 == 0) || (year%400 == 0))
			{
				System.out.print(month + " " + year + " has 29 days!");
			}
			else
				System.out.print(month + " " + year + " has 28 days!");
		}
		//months that has 30 days are April and June
		else if  (month.equals("Apr") || month.equals("Jun"))
		{
			System.out.print(month + " " + year + " has 30 days!");
		}
		else
		{
			System.out.print(month + " " + year + " has 31 days!");
		}
		
		input.close();
		
	}

}

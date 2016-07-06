package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Find the number of years 
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
 * For simplicity, assume a year has 365 days.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter minutes: ");
		int number = input.nextInt();
		//Finds minutes in a year = Minutes x Hours x Days 
		int years = number / (60 * 24 * 365);
		//Finds remaining days that doesn't make up a year = Year Mods (Minutes x Hours)
		int days = (number - (years * (60 * 24 * 365))) / (60 * 24);
		//Remaining minutes that doesn't make up a day
		int minutes = number % (60 * 24);
		
		System.out.println("Years Days Minutes");
		System.out.println(years + "  " + days + "  " + minutes);
		
		input.close();
		
	}

}

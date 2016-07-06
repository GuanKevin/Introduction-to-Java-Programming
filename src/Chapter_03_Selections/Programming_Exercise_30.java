package Chapter_03_Selections;

import java.util.Scanner;

/**
 * Current time
 * Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 * 
 * 02/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_30 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		// Compute the current hour
		long currentHour = ((totalHours + offset) % 24);
		
		System.out.print("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.");
		
		input.close();
	}
}

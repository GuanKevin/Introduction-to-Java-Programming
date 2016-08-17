package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Current time
 * Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 * 
 * 08/06/2016
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
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = ((totalHours + offset) % 24);
		System.out.print("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.");
		
		input.close();
	}
}

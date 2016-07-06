package Chapter_09_Objects_and_Classes;
import java.util.Date;

/**
 * Use the Date class
 * Write a program that creates a Date object, sets its elapsed time to 
 * 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000, 
 * and displays the date and time using the toString() method, respectively.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{		
		long time = 10000;
		Date date = new Date(time);
		
		for (int i = 0; i < 8; i++)
		{
			System.out.println(date.toString());
			time *= 10;
			date = new Date(time);
		}
	}
}

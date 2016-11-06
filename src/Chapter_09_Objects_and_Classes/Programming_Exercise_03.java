package Chapter_09_Objects_and_Classes;

import java.util.Date;

/**
 * Use the Date class
 * Write a program that creates a Date object, sets its elapsed time to 
 * 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000, 
 * and displays the date and time using the toString() method, respectively.
 * 
 * 10/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{		
		Date dateClass;
		long elapsedTime = 10000;
		
		for (int i = 0; i < 8; i++)
		{
			dateClass = new Date(elapsedTime);
			System.out.println(dateClass.toString());
			elapsedTime *= 10;
		}
	}
}
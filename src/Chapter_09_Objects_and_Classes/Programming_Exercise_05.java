package Chapter_09_Objects_and_Classes;
import java.util.GregorianCalendar;

/**
 * Use the GregorianCalendar class
 * Java API has the GregorianCalendar class in the java.util package, which you can use to obtain the year, month, and day of a date. 
 * The no-arg constructor constructs an instance for the current date, and the methods get(GregorianCalendar.YEAR), 
 * get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 * Write a program to perform two tasks:
 * Display the current year, month, and day.
 * The GregorianCalendar class has the setTimeInMillis(long), which can be used to set a specified elapsed time since January 1, 1970. 
 * Set the value to 1234567898765L and display the year, month, and day.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("Today is " + gc.get(GregorianCalendar.MONTH) + "\\" 
		+ gc.get(GregorianCalendar.DAY_OF_MONTH) + "\\"
		+ gc.get(GregorianCalendar.YEAR));
		
		gc.setTimeInMillis(1234567898765L);
		
		System.out.println("Today is " + gc.get(GregorianCalendar.MONTH) + "\\" 
				+ gc.get(GregorianCalendar.DAY_OF_MONTH) + "\\"
				+ gc.get(GregorianCalendar.YEAR));
	}

}

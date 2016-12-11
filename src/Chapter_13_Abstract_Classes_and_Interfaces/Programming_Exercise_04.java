package Chapter_13_Abstract_Classes_and_Interfaces;
import java.util.Calendar;

/**
 * Display calendars
 * Rewrite the PrintCalendar class in Listing 6.12 to display a calendar for a specified month using the Calendar and GregorianCalendar classes. 
 * Your program receives the month and year from the command line. For example:
 * java Exercise13_04 5 2016
 * You also can run the program without the year. 
 * In this case, the year is the current year. 
 * If you run the program without specifying a month and a year, the month is the current month.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04
{
	static Calendar calendar = Calendar.getInstance();
	
	public static void main(String[] args) 
	{
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		
		if (args.length == 2)
		{
			month = Integer.parseInt(args[0]);
			year = Integer.parseInt(args[1]);
		}	
		else if (args.length == 1)
			month = Integer.parseInt(args[0]);
		
		printMonth(month, year); 
	}
	
	public static void printMonth(int month, int year)
	{
		calendar.set(year, month, 1);
		int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		int numOfDaysInMonth = daysInMonth(month, year);
		
		printMonthTitle(year, month);
		printMonthBody(startDay, numOfDaysInMonth);	
	}
	
	public static void printMonthTitle(int year, int month) 
	{
		System.out.println("\t" + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}
	 
	public static void printMonthBody(int startDay, int numOfDaysInMonth) 
	{
		for (int i = 0; i < startDay; i++)
			 System.out.printf("%-4s", "");
		
		for (int i = 1; i <= numOfDaysInMonth; i++) 
		{
			System.out.printf("%-4d", i);
			
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

	    System.out.println("");
	}
	
	public static int daysInMonth(int month, int year) 
	{
	    switch (month) 
	    {
	      	case 0: case 2: case 4: case 6: case 7: case 9: case 11:
	      		return 31;
	      	case 1: if (isLeapYear(year)) return 29;
        			else return 28;
	      	case 3: case 5: case 8: case 10: return 30;
	      	default: return 0;
	    }
	}
	
	public static boolean isLeapYear(int year)
	{
		if (year % 4 != 0) 
		    return false;
		else if (year % 400 == 0)
		    return true;
		else if (year % 100 == 0)
			return false;
		else
		    return true;
	}
	
	public static String getMonthName(int month) 
	{
	    String monthName = null;

	    switch (month) 
	    {
	    	case 0: monthName = "January"; break;
	    	case 1: monthName = "Feburary";	break;
	    	case 2: monthName = "March"; break;
	    	case 3: monthName = "April"; break;
	    	case 4: monthName = "May"; break;
	    	case 5: monthName = "June"; break;
	    	case 6: monthName = "July"; break;
	    	case 7: monthName = "August"; break;
	    	case 8: monthName = "September"; break;
	    	case 9: monthName = "October"; break;
	    	case 10: monthName = "November"; break;
	    	case 11: monthName = "December"; break;
	    	default:
	    }
	    return monthName;
    }
}

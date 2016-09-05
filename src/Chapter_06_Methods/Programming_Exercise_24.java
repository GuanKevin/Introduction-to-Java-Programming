package Chapter_06_Methods;

/**
 * Display current date and time
 * Listing 2.7, ShowCurrentTime.java, displays the current time. 
 * Improve this example to display the current date and time. 
 * The calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on how to find the year, month, and day.
 *
 * 09/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		long timeInMilli = System.currentTimeMillis();
		System.out.println("Current date is " + currentDate(timeInMilli) 
						+ "\nCurrent time is " + currentTime(timeInMilli));
	}	
	
	/**
	 * returns the current time
	 * 
	 * @param time
	 * @return
	 */
	public static String currentTime(long time)
	{
		int timeInSeconds = (int) (time / 1000) % 60;
		int timeInMinutes = (int) ((time / 1000) / 60) % 60;
		int timeInHours = (int) (((time / 1000) / 60) / 60) % 24; 
		
		StringBuffer currenttime = new StringBuffer("");
		
		if (Integer.toString(timeInHours).length() < 2)
			currenttime.append("0" + timeInHours + ":");
		else
			currenttime.append(timeInHours + ":");
		if (Integer.toString(timeInMinutes).length() < 2)
			currenttime.append("0" + timeInMinutes + ":");
		else
			currenttime.append(timeInMinutes + ":");
		if (Integer.toString(timeInSeconds).length() < 2)
			currenttime.append("0" + timeInSeconds);
		else
			currenttime.append(timeInSeconds);
		if (timeInHours >= 12)
			currenttime.append(" PM");
		else
			currenttime.append(" AM");
		
		return currenttime.toString();
	}
	
	/**
	 * return the current date
	 * 
	 * @param time
	 * @return
	 */
	public static String currentDate(long time)
	{
		int year = (int) ((time / 1000) / 31536000) + 1970;
		int day = (int) ((time / 1000) % 31536000) / 86400;
		int month = (int) (((time / 1000) % 31536000) / 86400) / 28;
		
		String date = "" + month + "/" + (day % 28) + "/" + year;
		
		return date;
	}
}

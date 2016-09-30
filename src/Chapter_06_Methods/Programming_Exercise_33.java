package Chapter_06_Methods;

/**
 * Current date and time
 * Invoking System.currentTimeMillis() returns the elapsed time in milliseconds since midnight of January 1, 1970. 
 * Write a program that displays the date and time.
 *
 * 09/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_33 
{
	 public static void main(String[] args) 
	 {
	    displayDate(System.currentTimeMillis() / 1000);
	    displayTime(System.currentTimeMillis() / 1000);
	 }
	 
	 /**
	  * Display the current date.
	  * 
	  * @param seconds
	  */
	 public static void displayDate(long seconds)
	 {
		 System.out.print(getMonth(seconds) + " " + getDay(seconds) + " " + getYear(seconds));
	 }
	 
	 /**
	  * Display current time
	  * 
	  * @param seconds
	  */
	 public static void displayTime(long seconds)
	 {
		 if (getHour(seconds) > 12)
			 System.out.print(", " + (getHour(seconds) % 12) + ":" + getMinute(seconds) + ":" + getSeconds(seconds));
		 else
			 System.out.print(", " + getHour(seconds) + ":" + getMinute(seconds) + ":" + getSeconds(seconds));
	 }
	 
	 /**
	  * Return the current second
	  * 
	  * @param seconds
	  * @return
	  */
	 public static int getSeconds(long seconds)
	 {
		return (int) (((seconds % 31536000) % 86400) % 3600) % 60;
	 }
	 
	 /**
	  * Return the current minute
	  * 
	  * @param seconds
	  * @return
	  */
	 public static int getMinute(long seconds)
	 {
		 return (int) (((seconds % 31536000) % 86400) % 3600) / 60;
	 }
	 
	 /**
	  * Return the current hour
	  * 
	  * @param seconds
	  * @return
	  */
	 public static int getHour(long seconds)
	 {
		 return (int) (((seconds % 31536000) % 86400) / 3600) - 4;
	 }
	 
	 /**
	  * Return the current day
	  * 
	  * @param seconds
	  * @return
	  */
	 public static int getDay(long seconds)
	 {
		 String month = getMonth(seconds);
		 
		 if (month.equals("January"))
			 return (int) (seconds % 31536000) / 86400;
		 else if (month.equals("February"))
			 return (int) ((seconds % 31536000) / 86400) - 31;
		 else if (month.equals("March"))
			 return (int) ((seconds % 31536000) / 86400) - 60;
		 else if (month.equals("April"))
			 return (int) ((seconds % 31536000) / 86400) - 91;
		 else if (month.equals("May"))
			 return (int) ((seconds % 31536000) / 86400) - 121;
		 else if (month.equals("June"))
			 return (int) ((seconds % 31536000) / 86400) - 152;
		 else if (month.equals("July"))
			 return (int) ((seconds % 31536000) / 86400) - 182;
		 else if (month.equals("August"))
			 return (int) ((seconds % 31536000) / 86400) - 213;
		 else if (month.equals("September"))
			 return (int) ((seconds % 31536000) / 86400) - 244;
		 else if (month.equals("October"))
			 return (int) ((seconds % 31536000) / 86400) - 274;
		 else if (month.equals("November"))
			 return (int) ((seconds % 31536000) / 86400) - 305;
		 else 
			 return (int) ((seconds % 31536000) / 86400) - 335;
	 }
	 
	 /**
	  * Return the current month 
	  * 
	  * @param seconds
	  * @return
	  */
	 public static String getMonth(long seconds)
	 {
		 int days = (int) (seconds % 31536000) / 86400;
		 
		 if (days <= 31)
			 return "January";
		 else if (days <= 60)
			 return "Febuary";
		 else if (days <= 91)
			 return "March";
		 else if (days <= 121)
			 return "April";
		 else if (days <= 152)
			 return "May";
		 else if (days <= 182)
			 return "June";
		 else if (days <= 213)
			 return "July";
		 else if (days <= 244)
			 return "August";
		 else if (days <= 274)
			 return "September";
		 else if (days <= 305)
			 return "October";
		 else if (days <= 335)
			 return "November";
		 else
			 return "December";
	 }
	 
	 /**
	  * Return the current year
	  * 
	  * @param seconds
	  * @return
	  */
	 public static int getYear(long seconds)
	 {
		 return (int) (seconds / 31536000) + 1970;
	 }
}

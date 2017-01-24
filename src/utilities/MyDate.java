package utilities;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate 
{
	private int year, month, day;
	
	public MyDate()
	{
		GregorianCalendar date = new GregorianCalendar();
		
		year = date.get(Calendar.YEAR);
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(long elapsedTime)
	{
		GregorianCalendar date = new GregorianCalendar();
		
		date.setTimeInMillis(elapsedTime);
		year = date.get(Calendar.YEAR);
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day) 
	{
		this.year = year;
	    this.month = month;
	    this.day = day;
	}
	
	public void setDate(long elapsedTime)
	{
		GregorianCalendar date = new GregorianCalendar();
		
		date.setTimeInMillis(elapsedTime);
		year = date.get(Calendar.YEAR);
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH);
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public int getDay() 
	{
		return day;
	}

	public void setDay(int day) 
	{
		this.day = day;
	}
	
	public String toString()
	{
		return getMonth() + "/" + getDay() + "/" + getYear();
	}
}

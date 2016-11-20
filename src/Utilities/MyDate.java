package Utilities;
import java.util.Calendar;

public class MyDate 
{
	Calendar calendar;
	int year;
	int month;
	int day;
	
	public MyDate()
	{
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(long timeInMilliseconds)
	{
		long time = System.currentTimeMillis() + timeInMilliseconds;
		calendar = Calendar.getInstance();
		calendar.setTimeInMillis(time);
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	
	public MyDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDate(long elapsedTime)
	{
		//MyDate newDate = new MyDate(elapsedTime);
	}
}

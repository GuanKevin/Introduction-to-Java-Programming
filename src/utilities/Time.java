package utilities;

public class Time 
{
	long second, minute, hour;
	
	public Time()
	{
		this (((System.currentTimeMillis() / 1000) % 60), ((System.currentTimeMillis() / (1000 * 60)) % 60), ((System.currentTimeMillis() / (1000 * 60 * 60)) % 24));
	}
	
	public Time(long millisecond)
	{
		second = (millisecond / 1000) % 60;
		minute = (millisecond / (1000 * 60)) % 60;
		hour = (millisecond / (1000 * 60 * 60)) % 24;
	}
	
	public Time(long second, long minute, long hour)
	{
		this.second = second;
		this.minute = minute; 
		this.hour = hour;
	}
	
	public void setTime(long elapseTime)
	{
		second = (elapseTime / 1000) % 60;
		minute = (elapseTime / (1000 * 60)) % 60;
		hour = (elapseTime / (1000 * 60 * 60)) % 24;
	}
	
	public long getSecond()
	{
		return second;
	}
	
	public long getMinute()
	{
		return minute;
	}
	
	public long getHour()
	{
		return hour;
	}
}


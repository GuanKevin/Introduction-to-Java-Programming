package Chapter_10_Object_Oriented_Thinking;
import java.util.Calendar;

public class Time 
{
	int hour;
	int minute;
	int second;
	
	public Time()
	{
		Calendar calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
	}
	
	public Time(long time)
	{
		long timeInSec = time / 1000L;
		second = (int) (timeInSec % 60);
		timeInSec = timeInSec / 60L;
		minute = (int) (timeInSec % 60);
		timeInSec = timeInSec / 60L;
		hour = (int) (timeInSec % 24);
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}

	public int getSecond()
	{
		return second;
	}
	
	public void setTime(long elapseTime)
	{
		long timeInSec = elapseTime / 1000L;
		second = (int) (timeInSec % 60);
		timeInSec = timeInSec / 60L;
		minute = (int) (timeInSec % 60);
		timeInSec = timeInSec / 60L;
		hour = (int) (timeInSec % 24);
	}
	
	@Override
	public String toString()
	{
		return hour + ":" + minute + ":" + second;
	}
}
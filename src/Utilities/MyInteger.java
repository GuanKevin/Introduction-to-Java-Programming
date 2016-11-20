package Utilities;

public class MyInteger 
{
	int value;
	
	public MyInteger()
	{
		value = 0;
	}
	
	public MyInteger(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
	
	public boolean isEven()
	{
		return ((value % 2) == 0);
	}
	
	public boolean isOdd()
	{
		return ((value % 2) != 0);
	}
	
	public boolean isPrime()
	{
		if (value < 2)
		{
			return false;
		}
		for (int i = 2; i <= Math.pow(value, .5); i++)
		{
			if ((value % i) == 0)
			{
				return false;
			}
		}		
		return true;
	}
	
	public static boolean isEven(int value)
	{
		return ((value % 2) == 0);
	}
	
	public static boolean isOdd(int value)
	{
		return ((value % 2) != 0);
	}
	
	public static boolean isPrime(int value)
	{
		for (int i = 2; i <= Math.pow(value, .5); i++)
		{
			if ((value % i) == 0)
			{
				return false;
			}
		}		
		return true;
	}
	
	public static boolean isEven(MyInteger value)
	{
		return value.isEven();
	}
	
	public static boolean isOdd(MyInteger value)
	{
		return value.isOdd();
	}
	
	public static boolean isPrime(MyInteger value)
	{	
		return value.isPrime();
	}
	
	public boolean isEqual(int value)
	{
		return (this.value == value);
	}
	
	public boolean isEqual(MyInteger value)
	{
		return value.isEqual(this.value);
	}
	
	public static int parseInt(char[] mychararray)
	{
		return Integer.parseInt(new String(mychararray));
	}
	
	public static int parseInt(String mystring)
	{
		return Integer.parseInt(mystring);
	}
}

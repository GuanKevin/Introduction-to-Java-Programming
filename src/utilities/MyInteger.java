package utilities;

/**
 * The class contains:
 * An int data field named value that stores the int value represented by this object. 
 * A constructor that creates a MyInteger object for the specified int value. 
 * A getter method that returns the int value. 
 * The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively. 
 * The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively. 
 * The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 * The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value. 
 * A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 * A static method parseInt(String) that converts a string into an int value.
 * 
 * @author kevgu
 *
 */
public class MyInteger 
{
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public static int parseInt(char[] value) 
	{
		int power = value.length - 1;
		int parsedInteger = 0;
		
		for (int i = 0; i < value.length; i++)
			parsedInteger += (Math.pow(value[i], power--));
		
		return parsedInteger;
	}
	
	public static int parseInt(String value)
	{
		return (parseInt(value.toCharArray()));
	}
	
	public boolean equals(int value)
	{
		return (this.value == value);
	}
	
	public boolean equals(MyInteger obj)
	{
		return (this.value == obj.value);
	}
	
	public int getValue()
	{
		return value;
	}
	
	public boolean isEven()
	{
		return (0 == (value % 2));
	}
	
	public static boolean isEven(int value)
	{
		return (0 == (value % 2));
	}
	
	public static boolean isEven(MyInteger obj)
	{
		return (0 == (obj.value % 2));
	}
	
	public boolean isOdd()
	{
		return (1 == (value % 2));
	}
	
	public static boolean isOdd(int value)
	{
		return (1 == (value % 2));
	}
	
	public static boolean isOdd(MyInteger obj)
	{
		return (1 == (obj.value % 2));
	}
	
	public boolean isPrime()
	{
		if (isEven() && value != 2)
			return false;
		
		int tempValue = (int) Math.sqrt(value);
		
		for (int i = 3; i <= tempValue; i++)
			if (value % i == 0)
				return false;
		
		return true;
	}
	
	public static boolean isPrime(int value)
	{
		if (isEven(value) && value != 2)
			return false;
		
		int tempValue = (int) Math.sqrt(value);
		
		for (int i = 3; i <= tempValue; i++)
			if (value % i == 0)
				return false;
		
		return true;
	}
	
	public static boolean isPrime(MyInteger obj)
	{
		if (isEven(obj.value) && obj.value != 2)
			return false;
		
		int tempValue = (int) Math.sqrt(obj.value);
		
		for (int i = 3; i <= tempValue; i++)
			if (obj.value % i == 0)
				return false;
		
		return true;
	}
}

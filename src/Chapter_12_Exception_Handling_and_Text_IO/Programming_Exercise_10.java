package Chapter_12_Exception_Handling_and_Text_IO;

/**
 * OutOfMemoryError
 * Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error.
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{	
		try
		{
			int[] largeArray;
			largeArray = new int[(int) Math.pow(Integer.MAX_VALUE, 2)];
		}
		catch (OutOfMemoryError ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

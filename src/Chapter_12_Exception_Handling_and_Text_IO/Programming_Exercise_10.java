package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;

/**
 * OutOfMemoryError
 * Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error.
 * 
 * 03/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_10
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		int[] largeArray;
		
		try
		{
			largeArray = new int[(int) Math.pow(Integer.MAX_VALUE, 2)];
		}
		catch (OutOfMemoryError ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

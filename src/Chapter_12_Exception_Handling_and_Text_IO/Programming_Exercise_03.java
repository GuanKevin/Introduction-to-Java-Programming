package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Random;
import java.util.Scanner;

/**
 * ArrayIndexOutOfBoundsException
 * Write a program that meets the following requirements: 
 * Creates an array with 100 randomly chosen integers. 
 * Prompts the user to enter the index of the array, then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds.
 * 
 * 04/
 * @author kevgu
 *
 */

public class Programming_Exercise_03
{
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an index of the array: ");
		int[] myarray = new int[100];
		inputRandNum(myarray);
		int index = input.nextInt();
		
		try
		{
			System.out.println("The number in index " + index + " is " + myarray[index]);
		}
		catch (ArrayIndexOutOfBoundsException er)
		{
			System.out.println("Array index out of bound exception found! " + er.getMessage());
		}
		
	}

	public static void inputRandNum(int[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = rand.nextInt(1000);
		}
	}
}

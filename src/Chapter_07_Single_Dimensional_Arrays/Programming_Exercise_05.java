package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Print distinct numbers
 * Write a program that reads in ten numbers and displays the number of distinct numbers 
 * and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). 
 * (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int SIZE = 10;
		int[] myarray = new int[SIZE];
		
		myarray = storeTen(myarray);
		displayUnqiue(myarray);
		input.close();
	}
	
	public static int[] storeTen(int[] myarray)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int number = input.nextInt();
		
		myarray[0] = number;	
		for (int i = 1; i < myarray.length; i++)
		{
			number = input.nextInt();
			for (int j = 0; j < i; j++)
			{
				if (myarray[j] == number)
				{
					break;
				}
				else if ((j + 1) == i)
				{
					myarray[i] = number;
				}
			}
		}
		
		input.close();
		return myarray;
	}
	
	public static void displayUnqiue(int[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			if (myarray[i] == 0)
			{
				break;
			}
			else
				System.out.print(myarray[i] + " ");
		}
	}
	
}

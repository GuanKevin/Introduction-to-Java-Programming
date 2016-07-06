package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Reverse the numbers entered
 * Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int SIZE = 10;
		
		int[] myarray = new int[SIZE];
		myarray = storeIntegers(SIZE);
		
		int[] reversedarray = new int[SIZE];
		reversedarray = reverseArray(myarray);
		
		displayArray(myarray, reversedarray);
		
		input.close();
	}
	
	public static int[] storeIntegers(int SIZE)
	{
		Scanner input = new Scanner(System.in);
		
		int[] myarray = new int[SIZE];
		
		System.out.print("Enter " + SIZE + " integers: ");
		for (int i = 0; i < SIZE; i++)
		{
			myarray[i] = input.nextInt();
		}
		
		input.close();
		
		return myarray;
	}
	
	public static int[] reverseArray(int[] myarray)
	{
		int[] reversedarray = new int[myarray.length];
		
		for (int i = 0; i < myarray.length; i++)
		{
			reversedarray[i] = myarray[myarray.length - i - 1]; // 0 1 2 3 4 5 6 7 8
		}
		
		return reversedarray;
	}
	
	public static void displayArray(int[] myarray, int[] reversedarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			System.out.print(myarray[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < reversedarray.length; i++)
		{
			System.out.print(reversedarray[i] + " ");
		}
	}
}

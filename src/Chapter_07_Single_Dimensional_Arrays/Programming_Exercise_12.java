package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Reverse an array
 * The reverse method in Section 7.7 reverses an array by copying it to a new array. 
 * Rewrite the method that reverses the array passed in the argument and returns this array. 
 * Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, and displays the numbers.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int SIZE = 10;
		int[] myarray = new int[SIZE];
		insertNumbers(myarray);
		printNumbers(myarray);
		reverseArray(myarray);
		printNumbers(myarray);
		
		input.close();
	}
	
	public static void insertNumbers(int[] myarray)
	{
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = input.nextInt();
		}
		input.close();
	}
	
	public static void printNumbers(int[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			System.out.print(myarray[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverseArray(int[] myarray)
	{
		int temp;
		
		// 0  1  2  3  4  5  6  7  8  9 <-- Array Index
		// 12 2  5  43 21 7  8  98 34 23
		
		for (int i = 0; i < (myarray.length/2); i++)
		{
			temp = myarray[i];
			myarray[i] = myarray[myarray.length - i - 1];
			myarray[myarray.length - i - 1] = temp;
		}
	}
}

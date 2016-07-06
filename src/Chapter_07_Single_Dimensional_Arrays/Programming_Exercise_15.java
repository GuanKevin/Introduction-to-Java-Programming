package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Eliminate duplicates
 * Write a method that returns a new array by eliminating the duplicate values in the array using the following method header: 
 * public static int[] eliminateDuplicates(int[] list) 
 * Write a test program that reads in ten integers, invokes the method, and displays the result.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		final int size = 10;
		int[] myarray = new int[size];
		insertNumber(myarray);
		System.out.print("My array before the duplicate check: ");
		printArray(myarray);
		System.out.println();
		myarray = eliminateDuplicates(myarray);
		System.out.print("My array after the duplicate check: ");
		printArray(myarray);
	}
	
	/**
	 * Removes duplicate integer from the array
	 * @param list
	 * @return
	 */
	 public static int[] eliminateDuplicates(int[] list)
	 {
		 for (int i = 0; i < (list.length - 1); i++)
		 {
			 for (int j = i + 1; j < list.length; j++)
			 {
				 if (list[i] == list[j])
				 {
					list[j] = 0;
				 }
			 }
		 }
		 return list;
	 }
	 
	 /**
	  * It insert integers into the array
	  * @param myarray
	  */
	 public static void insertNumber(int[] myarray)
	 {
		 System.out.print("Enter " + myarray.length + " numbers: ");
		 
		 for (int i = 0; i < myarray.length; i++)
		 {
			 myarray[i] = input.nextInt();
		 }
	 }
	 
	 /**
	  * Print out the integers in the array
	  */
	 public static void printArray(int[] myarray)
	 {
		 for (int i = 0; i < myarray.length; i++)
		 {
			 if (myarray[i] != 0)
			 {
				 System.out.print(myarray[i] + " ");
			 }
		 }
	 }
}

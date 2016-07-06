package Chapter_07_Single_Dimensional_Arrays;
import java.util.Arrays;
import java.util.Random;

/**
 * Execution time
 * Write a program that randomly generates an array of 100,000 integers and a key. 
 * Estimate the execution time of invoking the linearSearch method in Listing 7.6. 
 * Sort the array and estimate the execution time of invoking the binarySearch method in Listing 7.7. 
 * You can use the following code template to obtain the execution time: 
 * long startTime = System.currentTimeMillis(); 
 * perform the task; 
 * long endTime = System.currentTimeMillis(); 
 * long executionTime = endTime - startTime;
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16 
{
	final static int SIZE = 100000;
	static Random rand = new Random();
	
	public static void main(String[] args) 
	{
		int[] myarray = new int[SIZE];
		insertRandomNumbers(myarray);
		int key = rand.nextInt(100001);
		long startTime = System.currentTimeMillis(); 
		int linearsearchresult = linearSearch(myarray, key);
		long endTime = System.currentTimeMillis(); 
		long executionTime = (endTime - startTime);
		System.out.println("The key is " + key);
		System.out.println("The result for linear search is " + linearsearchresult + " and it took " + executionTime + " milleseconds.");
		Arrays.sort(myarray);
		startTime = System.currentTimeMillis(); 
		int binarysearchresult = binarySearch(myarray, key);
		endTime = System.currentTimeMillis(); 
		executionTime = (endTime - startTime);
		System.out.println("The result for binary search is " + binarysearchresult + " and it took " + executionTime + " milleseconds.");
		displayArray(myarray);
	}
	
	/**
	 * The method for finding a key in the list 
	 * @param list
	 * @param key
	 * @return
	 */
	public static int linearSearch(int[] list, int key) 
	{
		for (int i = 0; i < list.length; i++) 
		{
			if (key == list[i])
			{
				return i;
			}
		}		
		return -1;
	}
	
	/**
	 * Use binary search to find the key in the list
	 * O(logn) Run time
	 * @param list
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] list, int key) 
	{
		int low = 0;
		int high = list.length - 1;

		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (key < list[mid])
			{
				high = mid - 1;
			}
			else if (key == list[mid])
			{
				return mid;
			}
			else
			low = mid + 1;
		}
		
		 return -low - 1; // Now high < low, key not found
	 }

	/**
	 * Insert random numbers between 0 to 100000 into the array
	 * O(n) runtime
	 * @param myarray
	 */
	public static void insertRandomNumbers(int[] myarray)
	{
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = rand.nextInt(100001);
		}
	}
	
	public static void displayArray(int[] myarray)
	{
		for (int i = 0; i < 100; i++)
		{
			if ((i % 10) == 0)
			{
				System.out.println(myarray[i] + " ");
			}	
			System.out.print(myarray[i] + " ");
		}
	}
}

package Chapter_09_Objects_and_Classes;
import java.util.Scanner;
import java.util.Random;

/**
 * Stopwatch
 * Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with getter methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start() that resets the startTime to the current time.
 * A method named stop() that sets the endTime to the current time.
 * A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 * 
 * 03/01/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] myarray = new int[100000];
		insertValues(myarray);
		Stopwatch stopwatch = new Stopwatch();
		selectionSort(myarray);
		stopwatch.stop();
		System.out.print("It took " + stopwatch.getElapsedTime() + " milleseconds.");
	}
	
	public static void selectionSort(int[] myarray)
	{
		int min;
		int temp;
		for (int i = 0; i < myarray.length; i++)
		{
			min = i;
			for (int j = i + 1; j < myarray.length; j++)
			{
				if (myarray[j] < myarray[min])
				{
					min = j;
				}
			}
			
			if (min != i)
			{
				temp = myarray[i];
				myarray[i] = myarray[min];
				myarray[min] = temp;
			}
		}
	}
	
	public static void insertValues(int[] myarray)
	{
		Random rand = new Random();
		
		for (int i = 0; i < myarray.length; i++)
		{
			myarray[i] = rand.nextInt(999999);
		}
	}
}

class Stopwatch
{
	long starttime;
	long endtime;
	
	Stopwatch()
	{
		starttime = System.currentTimeMillis();
	}
	
	public void start()
	{
		starttime = System.currentTimeMillis();
	}
	
	public void stop()
	{
		endtime = System.currentTimeMillis();
	}
	
	public long getElapsedTime()
	{
		return (endtime - starttime);
	}
	
	public long getStartTime()
	{
		return starttime;
	}
	
	public long getEndTime()
	{
		return endtime;
	}
}
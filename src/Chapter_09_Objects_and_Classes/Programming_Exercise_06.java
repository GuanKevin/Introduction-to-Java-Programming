package Chapter_09_Objects_and_Classes;

import java.util.Random;

/**
 * Stopwatch
 * Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with getter methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start() that resets the startTime to the current time.
 * A method named stop() that sets the endTime to the current time.
 * A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 * 
 * 11/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		int[] dataSet = generateArray(100000);
		StopWatch executionTime = new StopWatch();
		selectionSort(dataSet, executionTime);
		displayArray(dataSet);
		System.out.println("\nSelection sort execution time: " + executionTime.elapsedTime() + " milliseconds.");
	}
	
	public static void displayArray(int[] dataSet)
	{
		for (int i = 0; i < dataSet.length; i++)
			if (((i + 1) % 35) == 0)
				System.out.printf("%4d\n", dataSet[i]);
			else
				System.out.printf("%4d", dataSet[i]);
	}
	
	public static void selectionSort(int[] dataSet, StopWatch executionTime)
	{
		executionTime.start();
		
		for (int i = 0; i < dataSet.length - 1; i++)
		{
			int minimumIndex = i;
			
			for (int j = i + 1; j < dataSet.length; j++)
				if (dataSet[minimumIndex] > dataSet[j])
					minimumIndex = j;
			
			if (minimumIndex != i)
			{
				int tempElement = dataSet[minimumIndex];
				dataSet[minimumIndex] = dataSet[i];
				dataSet[i] = tempElement;
			}
		}
		
		executionTime.stop();
	}
	
	public static int[] generateArray(int size)
	{
		int[] dataSet = new int[size];
		Random randomNumber = new Random();
		
		for (int i = 0; i < size; i++)
			dataSet[i] = randomNumber.nextInt(1000);
		
		return dataSet;
	}
}

class StopWatch
{
	private long startTime;
	private long endTime;
	
	public StopWatch()
	{
		startTime = System.currentTimeMillis();
	}
	
	public void start()
	{
		startTime = System.currentTimeMillis();
	}
	
	public void stop()
	{
		endTime = System.currentTimeMillis();
	}
	
	public long elapsedTime()
	{
		return (endTime - startTime);
	}
	
	public long getStartTime() 
	{
		return startTime;
	}
	
	public void setStartTime(long startTime) 
	{
		this.startTime = startTime;
	}
	
	public long getEndTime() 
	{
		return endTime;
	}
	
	public void setEndTime(long endTime) 
	{
		this.endTime = endTime;
	}
}
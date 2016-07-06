package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;

/**
 * Analyze scores
 * Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average 
 * and how many scores are below the average. Enter a negative number to signify the end of the input. 
 * Assume that the maximum number of scores is 100.
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int SIZE = 100;
		int[] myarray = new int[SIZE];
		
		myarray = readScores(myarray);
		int average = findAverage(myarray);
		int belowcounter = belowCounter(myarray, average);
		int equalcounter = equalCounter(myarray, average);
		int abovecounter = aboveCounter(myarray, average);
		
		System.out.println("Average: " + average +
				"\nNumbers below average: " + belowcounter +
				"\nNumbers equal average: " + equalcounter +
				"\nNumbers above average: " + abovecounter);
		
		input.close();
	}
	
	public static int[] readScores(int[] myarray)
	{
		System.out.println("Enter a negative number to terminate, else enter students score: ");
		Scanner input = new Scanner(System.in);
		int scores = input.nextInt();
		int index = 0;
		
		while(scores >= 0)
		{
			myarray[index] = scores;
			scores = input.nextInt();
			index++;
		}
		
		myarray[index] = scores;
		
		input.close();
		return myarray;
	}
	
	public static int findAverage(int[] myarray)
	{
		int index = 0;
		int average = 0;
		
		while (myarray[index] >= 0)
		{
			average += myarray[index];
			index++;
		}
		
		return (average / (index));
	}
	
	public static int belowCounter(int [] myarray, int average)
	{
		int counter = 0;
		int index = 0;
		
		while (myarray[index] >= 0)
		{
			if (myarray[index] < average)
			{
				counter++;
			}
			index++;
		}
		
		return counter;
	}
	
	public static int equalCounter(int [] myarray, int average)
	{
		int counter = 0;
		int index = 0;
		
		while (myarray[index] >= 0)
		{
			if (myarray[index] == average)
			{
				counter++;
			}
			index++;
		}
		
		return counter;
	}
	
	public static int aboveCounter(int [] myarray, int average)
	{
		int counter = 0;
		int index = 0;
		
		while (myarray[index] >= 0)
		{
			if (myarray[index] > average)
			{
				counter++;
			}
			index++;
		}
		
		return counter;
	}
}

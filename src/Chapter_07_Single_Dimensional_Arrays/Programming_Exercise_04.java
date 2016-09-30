package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;

/**
 * Analyze scores
 * Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average 
 * and how many scores are below the average. Enter a negative number to signify the end of the input. 
 * Assume that the maximum number of scores is 100.
 * 
 * 09/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04 
{		
	static final int MAXIMUM_NUMBER_OF_SCORES = 100;
	
	public static void main(String[] args) 
	{
		int[] analyzeScoresArray = new int[MAXIMUM_NUMBER_OF_SCORES];
		
		inputScore(analyzeScoresArray);
		int average = findAverage(analyzeScoresArray);
		System.out.println("Average: " + average
				+ "\nBelow average: " + belowAverage(analyzeScoresArray, average)
				+ "\nEqual to or above average: " + aboveAverage(analyzeScoresArray, average) + "\n");
		displayScore(analyzeScoresArray);
	}
	
	/**
	 * Return the amount of numbers that are equal to or above the average
	 * 
	 * @return
	 */
	public static int aboveAverage(int[] analyzeScoresArray, int average)
	{
		int aboveCounter = 0;
		
		for (int i = 0; i < analyzeScoresArray.length; i++)
		{
			if (analyzeScoresArray[i] < 0)
				break;
			if (analyzeScoresArray[i] >= average)
				aboveCounter++;
		}
		
		return aboveCounter;
	}
	
	/**
	 * Return the amount of numbers that are below the average
	 * 
	 * @return
	 */
	public static int belowAverage(int[] analyzeScoresArray, int average)
	{
		int belowCounter = 0;
		
		for (int i = 0; i < analyzeScoresArray.length; i++)
		{
			if (analyzeScoresArray[i] < 0)
				break;
			if (analyzeScoresArray[i] < average)
				belowCounter++;
		}
		
		return belowCounter;
	}
	
	/**
	 * Returns the average of the sum of all integers up to -1 in the index of the array
	 * 
	 * @param analyzeScoresArray
	 * @return
	 */
	public static int findAverage(int[] analyzeScoresArray)
	{
		int average = 0;
		
		int i;
		
		for (i = 0; i < analyzeScoresArray.length; i++)
		{
			if (analyzeScoresArray[i] < 0)
				break;
			average += analyzeScoresArray[i];
		}
		
		return average / i;
	}
	
	/**
	 * Display all the score
	 * 
	 * @param analyzeScoreArray
	 */
	public static void displayScore(int[] analyzeScoreArray)
	{
		for (int i = 0; i < analyzeScoreArray.length; i++)
		{
			if (analyzeScoreArray[i] < 0)
				break;
			System.out.println(i + " " + analyzeScoreArray[i]);
		}
	}
	
	/**
	 * Store scores between 0 to 100 into the array
	 */
	public static void inputScore(int[] analyzeScoresArray)
	{
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(MAXIMUM_NUMBER_OF_SCORES + 2) - 1;
		int numberCounter = 0;
		
		while (numberCounter != 99 || number < 0)
		{
			analyzeScoresArray[numberCounter] = number;
			numberCounter++;
			number = randomNumber.nextInt(MAXIMUM_NUMBER_OF_SCORES + 2) - 1;
		}
		
		if (numberCounter != 99)
			analyzeScoresArray[numberCounter] = -1;
	}
}

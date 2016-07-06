package Chapter_07_Single_Dimensional_Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Count single digits
 * Write a program that generates 100 random integers between 0 and 9 and displays the count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 * 02/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		final int SIZE = 10;
		int[] myarray = new int[SIZE];
		
		randomNumber(myarray);
		displayCounts(myarray);
		
		input.close();
	}
	
	public static void randomNumber(int[] myarray)
	{
		Random rand = new Random();
		int number = rand.nextInt(10);
		
		for (int i = 0; i < 100; i++)
		{
			myarray[number]++;
			number = rand.nextInt(10);
		}
	}
	
	public static void displayCounts(int[] myarray)
	{
		for (int i = 0; i <= 9; i++)
		{
			System.out.println(i + " appeared " + myarray[i] + " times.");
		}
	}
}

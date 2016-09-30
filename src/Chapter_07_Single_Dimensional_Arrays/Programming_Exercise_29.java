package Chapter_07_Single_Dimensional_Arrays;

import java.util.Random;

/**
 * Game: pick four cards
 * Write a program that picks four cards from a deck of 52 cards and computes their sum. 
 * An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively. 
 * Your program should display the number of picks that yields the sum of 24.
 * 
 * 09/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_29 
{
	public static void main(String[] args) 
	{
		int[] fourCardsArray = new int[4];
		int sum = pickFour(fourCardsArray);
		
		if (sum == 24)
			displayCards(fourCardsArray);
		else
			System.out.print("You got a sum of " + sum);
	}
	
	/**
	 * Display cards that add up to 24
	 * 
	 * @param fourCardsArray
	 */
	public static void displayCards(int[] fourCardsArray)
	{
		System.out.println("You got a sum of 24");
		
		for (int i = 0; i < fourCardsArray.length; i++)
			if (fourCardsArray[i] == 1)
				System.out.print("Ace ");
			else if (fourCardsArray[i] == 11)
				System.out.print("Jack ");
			else if (fourCardsArray[i] == 12)
				System.out.print("Queen ");
			else if (fourCardsArray[i] == 13)
				System.out.print("King ");
			else
				System.out.print(fourCardsArray[i] +  " ");
	}
	
	/**
	 * Pick four cards from a deck of 52 cards
	 * 
	 * @param fourCardsArray
	 * @return
	 */
	public static int pickFour(int[] fourCardsArray)
	{
		Random randomPick = new Random();
		int sum = 0;
		
		for (int i = 0; i < fourCardsArray.length; i++)
		{
			fourCardsArray[i] = randomPick.nextInt(13) + 1;
			sum += fourCardsArray[i];
		}
		
		return sum;
	}
}

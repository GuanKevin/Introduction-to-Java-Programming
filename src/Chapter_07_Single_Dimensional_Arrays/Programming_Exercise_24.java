package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Simulation: coupon collector’s problem
 * Coupon collector is a classic statistics problem with many practical applications. 
 * The problem is to pick objects from a set of objects repeatedly 
 * and find out how many picks are needed for all the objects to be picked at least once. 
 * A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly 
 * and find out how many picks are needed before you see one of each suit. 
 * Assume a picked card is placed back in the deck before picking another. 
 * Write a program to simulate the number of picks needed to get four cards from each suit and display the four cards picked 
 * (it is possible a card may be picked twice).
 * 
 * 09/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{	
	static final int NUMBER_SUITS = 4; 								//Diamond, Clover, Hearts, Spade
	static final int NUMBER_CARDS = 13;								//A, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
	public static void main(String[] args) 
	{
		int[] suitArray = new int[NUMBER_SUITS];
		int[] cardArray = new int[NUMBER_CARDS];
		
		ccSimulation(suitArray, cardArray);
	}
	
	/**
	 * Displays the four cards picked and the number of times needed to pick out the cards
	 * 
	 * @param suitArray
	 * @param cardArray
	 */
	public static void ccSimulation(int[] suitArray, int[] cardArray)
	{
		String[] cardsPickedArray = new String[NUMBER_SUITS];
		int picksCounter = 0;
		
		while (isFilled(cardsPickedArray))
		{
			Random randomPick = new Random();
			int pickSuit = randomPick.nextInt(NUMBER_SUITS);
			int pickCard = randomPick.nextInt(NUMBER_CARDS);
			
			if (cardsPickedArray[pickSuit] == null)
				storeCard(pickSuit, pickCard, cardsPickedArray);
			picksCounter++;
		}
		
		System.out.print(Arrays.toString(cardsPickedArray) + "\nNumber of cards picked: " + picksCounter);
	}
	
	/**
	 * Stores the card picked into the array
	 * 0 - Diamond
	 * 1 - Clover
	 * 2 - Hearts
	 * 3 - Spades
	 * 0 - Ace
	 * 10 - Jack
	 * 11 - Queen
	 * 12 - King
	 * 
	 * @param pickSuit
	 * @param pickCard
	 */
	public static void storeCard(int pickSuit, int pickCard, String[] cardsPickedArray)
	{
		String cardName = "";
		
		if (pickCard > 0 && pickCard < 10)
			cardName += ("" + pickCard + " of ");
		else if (pickCard == 0)
			cardName += ("Ace of ");
		else if (pickCard == 10)
			cardName += ("Jack of ");
		else if (pickCard == 0)
			cardName += ("Queen of ");
		else
			cardName += ("King of ");
		
		if (pickSuit == 0)
			cardName += "Diamond";
		else if (pickSuit == 1)
			cardName += "Clover";
		else if (pickSuit == 2)
			cardName += "Hearts";
		else
			cardName += "King";
		
		cardsPickedArray[pickSuit] = cardName;
	}
	
	/**
	 * Return true as long as array is not filled
	 * 
	 * @param cardsPickedArray
	 * @return
	 */
	public static boolean isFilled(String[] cardsPickedArray)
	{
		for (int i = 0; i < NUMBER_SUITS; i++)
			if (cardsPickedArray[i] == null)
				return true;
		return false;
	}
}
package Chapter_03_Selections;

/**
 * Game: pick a card
 * Write a program that simulates picking a card from a deck of 52 cards. 
 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) 
 * and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

/**
 * 1 Clubs
 * 2 Diamonds
 * 3 Hearts
 * 4 Sapdes
 * 1 Ace
 * 11 Jack
 * 12 Queen
 * 13 King
 */
public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		int rank = (int) (Math.random() * 13 + 1);
		int suit = (int) (Math.random() * 4 + 1);
		String myCard = null;
		
		if (suit == 1)
			myCard = "Clubs of ";
		else if (suit == 2)
			myCard = "Diamonds of ";
		else if (suit == 3)
			myCard = "Hearts of ";
		else
			myCard = "Spades of ";
		if (rank == 1)
			System.out.print("The card you picked is " + myCard + "Ace");
		else if (rank == 11)
			System.out.print("The card you picked is " + myCard + "Jack");
		else if (rank == 12)
			System.out.print("The card you picked is " + myCard + "Queen");
		else if (rank == 13)
			System.out.print("The card you picked is " + myCard + "King");
		else
			System.out.print("The card you picked is " + myCard + rank);
		
		
		
	}
}

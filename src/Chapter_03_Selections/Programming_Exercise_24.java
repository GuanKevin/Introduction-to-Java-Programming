package Chapter_03_Selections;
import java.util.Scanner;
import java.util.Random;

/**
 * Game: pick a card
 * Write a program that simulates picking a card from a deck of 52 cards. 
 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) 
 * and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * 
 * 02/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24 
{
	public static void main(String[] args) 
	{
		System.out.print("Pick a number between 1 - 52: ");
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int number = input.nextInt() + rand.nextInt(100);
		int rank = number % 13 + 1;
		int suit = number % 4 + 1;
		
		if (rank == 1)
		{
			System.out.print("You got an Ace of ");
		}
		if (rank == 2)
		{
			System.out.print("You got a 2 of ");
		}
		if (rank == 3)
		{
			System.out.print("You got a 3 of ");
		}
		if (rank == 4)
		{
			System.out.print("You got a 4 of ");
		}
		if (rank == 5)
		{
			System.out.print("You got a 5 of ");
		}
		if (rank == 6)
		{
			System.out.print("You got a 6 of ");
		}
		if (rank == 7)
		{
			System.out.print("You got a 7 of ");
		}
		if (rank == 8)
		{
			System.out.print("You got a 8 of ");
		}
		if (rank == 9)
		{
			System.out.print("You got a 9 of ");
		}
		if (rank == 10)
		{
			System.out.print("You got a 10 of ");
		}
		if (rank == 11)
		{
			System.out.print("You got a Jack of ");
		}
		if (rank == 12)
		{
			System.out.print("You got a Queen of ");
		}
		if (rank == 13)
		{
			System.out.print("You got a king of ");
		}
		
		if (suit == 1)
		{
			System.out.print("Clubs");
		}
		if (suit == 2)
		{
			System.out.print("Diamond");
		}
		if (suit == 3)
		{
			System.out.print("Heart");
		}
		if (suit == 4)
		{
			System.out.print("Spaces");
		}
		
		
		
		input.close();
	}
}

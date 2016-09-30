package Chapter_06_Methods;

import java.util.Random;

/**
 * Game: craps
 * Craps is a popular dice game played in casinos. 
 * Write a program to play a variation of the game, as follows: 
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. 
 * If the sum is 2, 3, or 12 (called craps), you lose; 
 * if the sum is 7 or 11 (called natural), you win; 
 * if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. 
 * Continue to roll the dice until either a 7 or the same point value is rolled. 
 * If 7 is rolled, you lose. Otherwise, you win.
 *
 * 09/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_30 
{
	public static void main(String[] args) 
	{
		playCraps();
	}
	
	/**
	 * Single player craps
	 */
	public static void playCraps()
	{
		Random diceRoll = new Random();
		int dice1, dice2;
		int pointsCounter = 0;
		boolean endGame = true;
		
		while (endGame)
		{
			dice1 = diceRoll.nextInt(6) + 1;
			dice2 = diceRoll.nextInt(6) + 1;
			
			if ((dice1 + dice2) == 2 || (dice1 + dice2) == 3 || (dice1 + dice2) == 12)
			{
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
						+ "\nYou lose");
				endGame = false;
			}
			else if ((dice1 + dice2) == 7 || (dice1 + dice2) == 11)
			{
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
						+ "\nYou win");
				endGame = false;
			}
			else
			{
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
						+ "\nPoints is " + (pointsCounter + 1));
				pointsCounter++;
				
				while (endGame)
				{
					dice1 = diceRoll.nextInt(6) + 1;
					dice2 = diceRoll.nextInt(6) + 1;
					
					if ((dice1 + dice2) == 7)
					{
						System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nYou lose");
						endGame = false;
					}
					else if ((dice1 + dice2) == pointsCounter)
					{
						System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nYou win");
						endGame = false;
					}
					else if (pointsCounter > 12)
						endGame = false;
					else 
					{
						System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nPoints is " + (pointsCounter + 1));
						pointsCounter++;
					}
				}
			}
		}
	}
}

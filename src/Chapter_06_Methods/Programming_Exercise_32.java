package Chapter_06_Methods;

import java.util.Random;

/**
 * Game: chance of winning at craps
 * Revise Exercise 6.30 to run it 10,000 times and display the number of winning games.
 * 
 * 09/13/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_32 
{
	public static void main(String[] args) 
	{
		int winCounter = 0;
		
		for (int i = 1; i <= 10000; i++)
			winCounter += (playCraps() ? 1 : 0);
		
		System.out.print("You won " + winCounter + " times.");
	}
	
	/**
	 * Single player craps
	 * @return 
	 */
	public static boolean playCraps()
	{
		Random diceRoll = new Random();
		int dice1, dice2;
		int pointsCounter = 0;
		boolean endGame = true;
		boolean gameStatus = false;
		
		while (endGame)
		{
			dice1 = diceRoll.nextInt(6) + 1;
			dice2 = diceRoll.nextInt(6) + 1;
			
			if ((dice1 + dice2) == 2 || (dice1 + dice2) == 3 || (dice1 + dice2) == 12)
			{
				/*System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
						+ "\nYou lose");*/
				endGame = false;
			}
			else if ((dice1 + dice2) == 7 || (dice1 + dice2) == 11)
			{
				/*System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
						+ "\nYou win");*/
				endGame = false;
				gameStatus = true;
			}
			else
			{
				/*System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
						+ "\nPoints is " + (pointsCounter + 1));*/
				pointsCounter++;
				
				while (endGame)
				{
					dice1 = diceRoll.nextInt(6) + 1;
					dice2 = diceRoll.nextInt(6) + 1;
					
					if ((dice1 + dice2) == 7)
					{
						/*System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nYou lose");*/
						endGame = false;
					}
					else if ((dice1 + dice2) == pointsCounter)
					{
						/*System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nYou win");*/
						endGame = false;
						gameStatus = true;
					}
					else if (pointsCounter > 12)
					{
						endGame = false;
						gameStatus = true;
					}
					else 
					{
						/*System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2)
								+ "\nPoints is " + (pointsCounter + 1));*/
						pointsCounter++;
					}
				}
			}
		}
		
		return gameStatus;
	}
}

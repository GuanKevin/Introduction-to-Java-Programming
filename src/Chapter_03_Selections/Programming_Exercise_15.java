package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Game: lottery
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit number. 
 * The program prompts the user to enter a three-digit number and determines whether the user wins according to the following rules:
 * 		1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 		2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 		3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int lotteryNumber = (int) (Math.random() * 1000);
		System.out.print("Guess a three digit number: ");
		int lotteryGuess = input.nextInt();
		int ln1, ln2, ln3, gn1, gn2, gn3;
		ln1 = lotteryNumber / 100;
		ln2 = (lotteryNumber / 10) - (ln1 * 10);
		ln3 = lotteryNumber % 10;
		gn1 = lotteryGuess / 100;
		gn2 = (lotteryGuess / 10) - (ln1 * 10);
		gn3 = lotteryGuess % 10;
		
		if (lotteryNumber == lotteryGuess)
		{
			System.out.print("You've won $10,000!");
		}
		else if (ln1 == gn1 || ln1 == gn2 || ln1 == gn3)
		{
			if (ln1 == gn1)
			{
				if (ln2 == gn2)
				{
					if (ln3 == gn3)
					{
						System.out.print("You've won $3,000!");
					}
				}
			}
		}
		else if (ln1 == gn1 || ln1 == gn2 || ln1 == gn3
				|| ln2 == gn1 || ln2 == gn2 || ln2 == gn3
				|| ln3 == gn1 || ln3 == gn2 || ln3 == gn3)
		{
			System.out.print("You've won $1,000!");
		}
			
		
		input.close();
	}
}

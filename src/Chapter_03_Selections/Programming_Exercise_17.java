package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Game: scissor, rock, paper
 * Write a program that plays the popular scissor-rock-paper game. 
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 * The program prompts the user to enter a number 0, 1, or 2 
 * and displays a message indicating whether the user or the computer wins, loses, or draws.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

/*
 * 0 - Paper
 * 1 - Rock
 * 2 - Scissor
 */
public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 (Paper), 1 (Rock), 2 (Scissor): ");
		int userChoice = input.nextInt();
		int compChoice = (int) (Math.random() * 3);
		System.out.println("The computer chooses " + compChoice);
		
		if (userChoice == 0)
		{
			if (compChoice == 0)
				System.out.print("It's a draw!");
			else if (compChoice == 1)
				System.out.print("You win!");
			else
				System.out.print("You lose!");
		}
		else if (userChoice == 1)
		{
			if (compChoice == 0)
				System.out.print("You lose!");
			else if (compChoice == 1)
				System.out.print("It's a draw!");
			else
				System.out.print("You win!");
		}
		else
		{
			if (compChoice == 0)
				System.out.print("You win!");
			else if (compChoice == 1)
				System.out.print("You lose!");
			else
				System.out.print("It's a draw!");
		}

		input.close();
	}
}

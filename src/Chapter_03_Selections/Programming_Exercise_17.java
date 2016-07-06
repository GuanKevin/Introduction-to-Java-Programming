package Chapter_03_Selections;
import java.util.Scanner;
import java.util.Random;

/**
 * Game: scissor, rock, paper
 * Write a program that plays the popular scissor-rock-paper game. 
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 * The program prompts the user to enter a number 0, 1, or 2 
 * and displays a message indicating whether the user or the computer wins, loses, or draws.
 * 
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int randomnumber = rand.nextInt(3);
		System.out.print("Enter a number 0(Scissor) 1(Rock) 2(Paper)");
		int guess = input.nextInt();
		
		//0 - Scissor
		//1 - Rock
		//2 - Paper
		//0 -> 2 (0 + 2 == 2)
		//1 -> 0 (1 == (0 + 1))
		//2 -> 1 (2 == (1 + 1))
		//Computer wins
		if ((randomnumber + 2) == guess || (randomnumber == (guess + 1)))
		{
			System.out.print(randomnumber + " beats " + guess + "\nYou Lose!");
		}
		//0 <- 1 (0 + 1 == 1)
		//1 <- 2 (1 + 1 == 2)
		//2 <- 0 (2 == 0 + 2)
		//You Win
		else if(((randomnumber + 1) == guess) || (randomnumber == (guess + 2)))
		{
			System.out.print(randomnumber + " loses to " + guess + "\nYou Win!");
		}
		else
		{
			System.out.print(randomnumber + " ties with " + guess + "\nIt's a draw!");
		}
		
		input.close();
	}

}

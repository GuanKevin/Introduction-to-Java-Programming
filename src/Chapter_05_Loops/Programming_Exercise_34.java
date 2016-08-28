package Chapter_05_Loops;
import java.util.Scanner;
import java.util.Random;

/**
 * Game: scissor, rock, paper
 * Let the user continuously play until either the user or the computer wins more than two times than its opponent.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_34 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int userScore = 0;
		int compScore = 0;
		String userInput = "";
		Random randNumber = new Random();
		int randomPlay;
		
		System.out.println("Enter scissor, rock or paper!");
		
		while ((userScore - compScore) != 2 && (compScore - userScore) != 2)
		{
			System.out.print("You play: ");
			userInput = input.next();
			
			randomPlay = randNumber.nextInt(3);
			
			if (randomPlay == 0)
			{
				System.out.println("Comp plays: scissors" );
				
				if (userInput.equals("scissors"))			
					System.out.println("It's a draw! \n");				
				else if (userInput.equals("rock"))
				{
					System.out.println("You win! \n");
					++userScore;
				}
				else
				{
					System.out.println("You lose! \n");
					++compScore;
				}
			}
			else if (randomPlay == 1)
			{
				System.out.println("Comp plays: rock" );
				
				if (userInput.equals("scissors"))
				{
					System.out.println("You lose! \n");
					++compScore;
				}			
				else if (userInput.equals("rock"))
					System.out.println("It's a draw! \n");
				else
				{
					System.out.println("You win! \n");
					++userScore;
				}	
			}
			else
			{
				System.out.print("Comp plays: paper \n" );
				
				if (userInput.equals("scissors"))
				{
					System.out.println("You win! \n");
					++userScore;
				}						
				else if (userInput.equals("rock"))
				{
					System.out.println("You lose! \n");
					++compScore;
				}
				else
					System.out.println("It's a draw! \n");	
			}	
		}
		
		if ((userScore - compScore) == 2)
			System.out.print("Congratulations! You've beat the computer!");
		else
			System.out.print("You've lost the game!");
		
		input.close();
	}
}

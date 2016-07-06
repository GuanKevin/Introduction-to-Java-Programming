package Chapter_05_Loops;
import java.util.Scanner;
import java.util.Random;

/**
 * Game: scissor, rock, paper
 * Let the user continuously play until either the user or the computer wins more than two times than its opponent.
 * 
 * 02/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_34 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int userwins = 0;
		int compwins = 0;
		Random rand = new Random();
		int compchoose = rand.nextInt(3);
		String userchoice = null;
		boolean win = true;
		
		//scissors = 0
		//rock = 1
		//paper = 2
		
		while(win)
		{
			System.out.print("Enter rock scissor or paper: ");
			userchoice = new String(input.nextLine());
			
			if (userchoice.equals("scissor"))
			{
				if (compchoose == 2)
				{
					System.out.println(("You win! Scissors beat Paper!"));
					userwins++;
				}
				else if (compchoose == 1)
				{
					System.out.println(("You lose! Scissors beat Paper!"));
					compwins++;
				}
				else
				{
					System.out.println(("It's a tie!"));
				}
			}
			else if (userchoice.equals("rock"))
			{
				if (compchoose == 0)
				{
					System.out.println(("You win! Rock beat Scissors!"));
					userwins++;
				}
				else if (compchoose == 2)
				{
					System.out.println(("You lose! Paper beat Rock!"));
					compwins++;
				}
				else
				{
					System.out.println(("It's a tie!"));
				}
			}
			else if (userchoice.equals("paper"))
			{
				if (compchoose == 1)
				{
					System.out.println(("You win! Paper beat Rock!"));
					userwins++;
				}
				else if (compchoose == 0)
				{
					System.out.println(("You lose! Scissor beat Paper!"));
					compwins++;
				}
				else
				{
					System.out.println(("It's a tie!"));
				}
			}
			else
			{
				System.out.println("YOU DID NOT ENTER CORRECTLY!");
			}
			
			if ((userwins == 2) || (compwins == 2))
			{
				win = false;
			}
			
			compchoose = rand.nextInt(3);
		}
		
		System.out.println("Game over!");
		input.close();
	}
}

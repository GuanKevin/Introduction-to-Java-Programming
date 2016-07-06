package Chapter_03_Selections;
import java.util.Scanner;
import java.util.Random;

/**
 * Game: heads or tails
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails. 
 * The program randomly generates an integer 0 or 1, which represents head or tail. 
 * The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 * 
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Guess head(0) or tails(1): ");
		int guess = input.nextInt();
		
		// 0 or 1
		int coin;
		Random flip = new Random();
		coin = flip.nextInt(2);
		
		System.out.println("This is the random coin flip result: " + coin);
		
		if (coin == guess)
		{
			System.out.println("You chose: " + guess + " and you got it right!!");
		}
		else
		{
			System.out.println("You chose: " + guess + " and you got it wrong!!");
		}
		
		
		input.close();
	}
	

}

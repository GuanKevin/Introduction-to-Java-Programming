package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Game: heads or tails
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails. 
 * The program randomly generates an integer 0 or 1, which represents head or tail. 
 * The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int coin = (int) (Math.random() * 10) % 2;
		System.out.print("Enter 0 or 1: ");
		int guess = input.nextInt();
		
		if (coin == guess)
		{
			System.out.println("Correct! Result: " + coin);
		}
		else
		{
			System.out.println("Incorrect! Result: " + coin);
		}
		
		input.close();
	}
}

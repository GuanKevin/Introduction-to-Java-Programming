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
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		// Generate a lottery number
		int lottery = 123; //(int)(Math.random() * 1000);
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		//123 % 10 = 3;
		int lotteryDigit1 = lottery % 10;
		//123 / 10 = 12 % 10;
		int lotteryDigit2 = (lottery / 10) % 10;
		//123 / 100 = 1
		int lotteryDigit3 = lottery / 100;
		
		// Get digits from guess
		//123 --> guess 3
		int guessDigit1 = guess % 10;
		int guessDigit2 = (guess / 10) % 10;
		int guessDigit3 = guess / 100;
		
		System.out.println(guessDigit1 + " " + guessDigit2 + " " + guessDigit3);
		System.out.println(lotteryDigit1 + " " + lotteryDigit2 + " " + lotteryDigit3);
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		//Permutation of 123 --> ???
		else if ((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) 
				&& (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) 
				&& (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
		input.close();
	}
}

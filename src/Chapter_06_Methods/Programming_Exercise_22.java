package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Math: approximate the square root
 * There are several techniques for implementing the sqrt method in the Math class. 
 * One such technique is known as the Babylonian method. 
 * It approximates the square root of a number, n, by repeatedly performing a calculation using the following formula: 
 * nextGuess = (lastGuess + n / lastGuess) / 2 
 * When nextGuess and lastGuess are almost identical, nextGuess is the approximated square root. 
 * The initial guess can be any positive value (e.g., 1). 
 * This value will be the starting value for lastGuess. 
 * If the difference between nextGuess and lastGuess is less than a very small number, such as 0.0001, 
 * you can claim that nextGuess is the approximated square root of n. 
 * If not, nextGuess becomes lastGuess and the approximation process continues. 
 * Implement the following method that returns the square root of n. 
 * public static double sqrt(long n)
 *
 * 09/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		System.out.printf("The square root is %.0f", sqrt(input.nextLong()));
		input.close();		
	}
	
	/**
	 * returns the square root of n
	 * 
	 * @param n
	 * @return
	 */
	public static double sqrt(long n)
	{
		double nextGuess = 1;
		double lastGuess = 0;
		
		while ((nextGuess - lastGuess) > .0001 || (lastGuess - nextGuess) > .0001)
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		return nextGuess;
	}
}

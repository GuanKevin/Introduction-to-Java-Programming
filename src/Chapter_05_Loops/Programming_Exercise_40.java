package Chapter_05_Loops;
import java.util.Random;

/**
 * Simulation: heads or tails
 * Write a program that simulates flipping a coin one 
 * million times and displays the number of heads and tails.
 * 
 * 08/27/2016
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_40 
{
	public static void main(String[] args) 
	{
		Random randBool = new Random();
		int headCounter = 0;
		int tailCounter = 0;
		
		for (int i = 0; i < 1000000; i++)
		{
			if (randBool.nextBoolean() == true)
				headCounter++;
			else
				tailCounter++;
		}
		
		System.out.print("Head flipped: " + headCounter 
				+ "\nTail flipped: " + tailCounter);
	}
}

package Chapter_05_Loops;
import java.util.Random;

/**
 * Simulation: heads or tails
 * Write a program that simulates flipping a coin one 
 * million times and displays the number of heads and tails.
 * 
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_40 
{
	static final int million = 1000000;
	static Random rand = new Random();
	public static void main(String[] args) 
	{
		int headCounter = 0;
		int tailCounter = 0;
		
		for (int i = 0; i < million; i++)
		{
			if (rand.nextBoolean() == true)
			{
				headCounter++;
			}
			else
			{
				tailCounter++;
			}
		}
		
		System.out.print("Head flipped: " + headCounter 
				+"\nTail flipped: " + tailCounter);
	}
}

package Chapter_18_Recursion;

import java.util.Random;
import java.util.Scanner;

public class AdditionProblems 
{
	public static void main(String[] args)
	{
		long timeNow = System.currentTimeMillis();
		Random rand = new Random();
		int w, x, y, z;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++)
		{
			w = rand.nextInt(11);
			x = rand.nextInt(11);
			y = rand.nextInt(11);
			
			System.out.print(w + " + " + x + " + " + y + " = ");
			z = input.nextInt();
			if (z != (w + x + y))
			{
				System.out.println("Incorrect!");
				System.out.println(w + " + " + x + " + " + y + " = " + (w + x + y));
			}
			else
			{
				counter++;
			}
		}
		
		System.out.println("Score: " + (counter * 10) + "/100");
		System.out.println("It took you " + ((System.currentTimeMillis() - timeNow) / 1000) + " seconds!");
		input.close();
	}
}

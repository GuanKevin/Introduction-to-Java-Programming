package Chapter_05_Loops;
import java.util.Scanner;
import java.util.Random;

/**
 * Repeat additions
 * Listing 5.4, SubtractionQuizLoop.java, generates five random subtraction questions. 
 * Revise the program to generate ten random addition questions for two integers between 1 and 15. 
 * Display the correct count and test time.
 * 
 * 03/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long starttime = System.currentTimeMillis();
		Random rand = new Random();
		int number1 = rand.nextInt(15) + 1; //integers between 1 and 15.
		int number2 = rand.nextInt(15) + 1; // (0 - 14) + 1 
		int sum = 0;
		int correctcounter = 0;
		
		//0 - 9
		for (int i = 0; i < 10; i++)
		{
			System.out.print(number1 + " + " + number2 + " = ");
			sum = input.nextInt();
			if (sum == (number1 + number2))
			{
				correctcounter++;
			}
			number1 = rand.nextInt(15) + 1;
			number2 = rand.nextInt(15) + 1;
		}
		
		long endtime = System.currentTimeMillis();
		long time = (endtime - starttime) / 1000;
		
		System.out.print("You got " + correctcounter + "/10"
				+ "\nIt took you " + time + " seconds to complete");
		
		input.close();
	}
}

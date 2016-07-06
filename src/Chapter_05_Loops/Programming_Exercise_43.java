package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Math: combinations
 * Write a program that displays all possible combinations for picking two numbers from integers 1 to 7. 
 * Also display the total number of all combinations.
 * 
 * 03/24/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_43 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number!");
		int numberOne = input.nextInt();
		System.out.println("enter the next number!");
		int numberTwo = input.nextInt();
		
		if (numberOne > numberTwo)
		{
			int temp = numberTwo;
			numberTwo = numberOne;
			numberOne = temp;
			
			int comboCounter = 0;
			for (int i = numberOne; i < numberTwo; i++)
			{
				for (int j = i; j < numberTwo; j++)
				{
					System.out.println(j + " " + numberTwo);
					comboCounter++;
				}
			}
			System.out.println("Amount of possible combinations: " + comboCounter);
		}
		else if (numberOne == numberTwo)
		{
			System.out.println(numberOne + " " + numberTwo + 
					"\nThere is only one combination!");
		}
		else
		{
			int comboCounter = 0;
			for (int i = numberOne; i < numberTwo; i++)
			{
				for (int j = i; j < numberTwo; j++)
				{
					System.out.println(j + " " + numberTwo);
					comboCounter++;
				}
			}
			System.out.println("Amount of possible combinations: " + comboCounter);
		}

		
		input.close();
	}
}

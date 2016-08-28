package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Math: combinations
 * Write a program that displays all possible combinations for picking two numbers from integers 1 to 7. 
 * Also display the total number of all combinations.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */


public class Programming_Exercise_43 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the next number: ");
		int num2 = input.nextInt();	
		int counter = 0;
		
		if (num1 > num2)
		{
			int tempNum = num1;
			num1 = num2;
			num2 = tempNum;
		}
		
		for (int i = num2; i > 0; i--)
			for (int j = num1; j < i; j++)
			{
				System.out.println(j + " " + i);
				counter++;
			}
		
		System.out.print("Combinations: " + counter);
	
		input.close();
	}
}

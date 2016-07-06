package Chapter_05_Loops;
import java.util.Scanner;

/**
 * Compute the greatest common divisor
 * Another solution for Listing 5.9 to find the greatest common divisor of two integers n1 and n2 is as follows: 
 * First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, 
 * or 1 is a divisor for both n1 and n2 in this order. 
 * The first such common divisor is the greatest common divisor for n1 and n2. 
 * Write a program that prompts the user to enter two positive integers and displays the gcd.
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first positive integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second positive integer: ");
		int number2 = input.nextInt();
		boolean unknown = true;
		int divisor;
		
		if (number1 < number2)
		{
			divisor = number1;
		}
		else
		{
			divisor = number2;
		}
		
		
		//100, 75 --> 25
		while (unknown)
		{
			if (((number1 % divisor) == 0) && ((number2 % divisor) == 0))
			{
				unknown = false;
			}
			else
			{
				divisor--;
			}
		}
		
		System.out.print("The greatest common divisor of " + number1 + " and " + number2 + " is " + divisor);
		
		input.close();
	}
}

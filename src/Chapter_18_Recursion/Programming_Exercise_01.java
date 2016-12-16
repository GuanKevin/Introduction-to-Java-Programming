package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Factorial
 * Implement the factorial method using recursion. 
 * Write a program that prompts the user to enter an integer and displays its factorial.
 * http://www.programmerinterview.com/index.php/recursion/explanation-of-recursion/
 * https://www.mathsisfun.com/numbers/factorial.html
 * 
 * 12/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("The factorial of " + number + "! is " + factorial(number));
		
		input.close();
	}
	
	public static int factorial(int number)
	{
		if (number <= 1)
			return 1;
		
		return (number * factorial(number - 1));
	} 
}

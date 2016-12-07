package Chapter_12_Exception_Handling_and_Text_IO;

import java.util.Scanner;

/**
 * InputMismatchException
 * Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect.
 * 
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		boolean correctInput = false;
		System.out.print("Enter two numbers: ");
		
		while (!correctInput)
		{
			try
			{
				num1 = input.nextInt();
				num2 = input.nextInt();
				correctInput = true;
			}
			catch (Exception e)
			{
				//e.printStackTrace();
				System.out.print("Incorrect input and re-enter two integers: ");
				input.nextLine();
			}
		}
		
		System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
		
		input.close();
	}
}

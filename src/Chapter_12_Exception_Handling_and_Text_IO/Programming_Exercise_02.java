package Chapter_12_Exception_Handling_and_Text_IO;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * InputMismatchException
 * Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect.
 * 
 * 03/16/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter two integers: ");
		int number1 = 0;
		int number2 = 0;
		boolean correctInput = false;
		
		while (!correctInput)
		{
			try
			{
				number1 = input.nextInt();
				number2 = input.nextInt();
				correctInput = true;
			}
			catch (InputMismatchException er)
			{
				input.nextLine();
				System.out.println("Input Mismatch Exception! " + er.getMessage());
				System.out.println("Try again! Enter two integers: ");
			}
		}
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}

}

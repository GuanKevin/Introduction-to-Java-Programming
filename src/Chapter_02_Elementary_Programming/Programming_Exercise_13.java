package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Financial application: compound value
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		int savings = input.nextInt();
		double interestrate = (0.5/12);
		double accountvalue = 0;

		//First month
		accountvalue = savings + (savings * interestrate);
		//Second month
		accountvalue += (savings + (accountvalue * interestrate));
		//Third month
		accountvalue += (savings + (accountvalue * interestrate));
		//Forth month
		accountvalue += (savings + (accountvalue * interestrate));
		//Fifth month
		accountvalue += (savings + (accountvalue * interestrate));
		//Six month
		accountvalue += (savings + (accountvalue * interestrate));
		
		System.out.print("After the sixth month, the account value is $" + accountvalue);
		
		input.close();
	}

}

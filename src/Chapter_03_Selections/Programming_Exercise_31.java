package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Financials: currency exchange
 * Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. 
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. 
 * Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 * 
 * 02/
 * @author kevgu
 *
 */

public class Programming_Exercise_31 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 to convert from USD to RMB \nEnter 1 to convert from RMB to USD: ");
		int convert = input.nextInt();
		
		if (convert == 0)
		{
			//USD to RMB --> 1 USD to 6.57 RMB
			System.out.print("Enter USD: ");
			double currency = input.nextDouble();
			double exchange = currency * 6.57;
			
			System.out.printf("The exchange is $%.02f", exchange);
		}
		else if (convert == 1)
		{
			//RMB to USD --> 1 RMB to 0.15 USD
			System.out.print("Enter RMB: ");
			double currency = input.nextDouble();
			double exchange = currency * 0.15;
			
			System.out.printf("The exchange is $%.02f", exchange);
		}
		
		
		input.close();
	}

}

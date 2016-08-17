package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Financials: currency exchange
 * Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. 
 * Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. 
 * Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_31 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double currency;
		int exchange;
		
		System.out.print("Enter the currency amount: ");
		currency = input.nextDouble();
		System.out.print("Enter the type of exchange 0 || 1");
		exchange = input.nextInt();
		
		if (exchange == 0)
			System.out.print(currency * 8);
		else
			System.out.print(currency / 8);
		
		input.close();
	}
}

package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Financial application: monetary units
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a float value to an int value. 
 * Read the input as a string such as "11.56". 
 * Your program should extract the dollar amount before the decimal point 
 * and the cents after the decimal amount using the indexOf and substring methods.
 * 
 * 02/14/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your money: ");
		String money = input.next();
		//indexOf --> . --> 1000.50 --> 1.50
		int index = money.indexOf('.');
		String submoney = money.substring(0, index);
		int mymoney = Integer.parseInt(submoney);
		//How many $100 Dollars
		//How many $50 Dollars
		//$20, $10, $5, $1
		int hundredbills = mymoney/100;
		mymoney = mymoney % 100;
		int fiftybills = mymoney/50;
		mymoney = mymoney % 50;
		int twentybills = mymoney/20;
		mymoney = mymoney % 20;
		int tenbills = mymoney/10;
		mymoney = mymoney % 10;
		int fivebills = mymoney/5;
		mymoney = mymoney % 5;
		int dollarbills = mymoney/1;
		
		String subcents = money.substring(index + 1, money.length());
		//quarters(25), dimes(10), nickels(5), pennies(1)
		mymoney = Integer.parseInt(subcents);
		int quarters = mymoney / 25;
		mymoney = mymoney % 25;
		int dimes = mymoney / 10;
		mymoney = mymoney % 10;
		int nickels = mymoney / 5;
		mymoney = mymoney % 5;
		int pennies = mymoney / 1;
		
		System.out.print("$100: " + hundredbills +
				"\n$50: " + fiftybills +
				"\n$20: " + twentybills +
				"\n$10: " + tenbills +
				"\n$5: " + fivebills +
				"\n$1: " + dollarbills +
				"\n25 cents: " + quarters +
				"\n10 cents: " + dimes +
				"\n5 cents: " + nickels +
				"\n1 cents: " + pennies);
		
		input.close();
	}

}
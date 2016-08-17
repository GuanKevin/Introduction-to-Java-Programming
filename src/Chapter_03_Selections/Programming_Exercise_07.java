package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Financial application: monetary units
 * Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, 
 * using singular words for single units such as 1 dollar and 1 penny, 
 * and plural words for more than one unit such as 2 dollars and 3 pennies.
 * 
 * 08/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for example 1156: "); 
		int amount = input.nextInt();
		
		int numberOfOneDollars = amount / 100;
		amount = amount % 100;
		int numberOfQuarters = amount / 25;
		amount = amount % 25;
		int numberOfDimes = amount / 10;
		amount = amount % 10;
		int numberOfNickels = amount / 5;
		amount = amount % 5;
		int numberOfPennies = amount;
		
		System.out.println("Your amount " + amount + " consists of");
		if (numberOfOneDollars <= 1)
			System.out.println(" " + numberOfOneDollars + " dollar");
		else
			System.out.println(" " + numberOfOneDollars + " dollars");
		
		if (numberOfQuarters <= 1)
			System.out.println(" " + numberOfQuarters + " quarter ");
		else
			System.out.println(" " + numberOfQuarters + " quarters ");
		
		if (numberOfDimes <= 1)
			System.out.println(" " + numberOfDimes + " dime");
		else
			System.out.println(" " + numberOfDimes + " dimes");
		
		if (numberOfNickels <= 1)
			System.out.println(" " + numberOfNickels + " nickel");
		else
			System.out.println(" " + numberOfNickels + " nickel");
		
		if (numberOfPennies <= 1)
			System.out.println(" " + numberOfPennies + " penny");
		else
			System.out.println(" " + numberOfPennies + " pennies");
		
		input.close();
	}
}

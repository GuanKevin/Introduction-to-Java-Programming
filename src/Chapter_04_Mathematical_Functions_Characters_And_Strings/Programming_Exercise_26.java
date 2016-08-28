package Chapter_04_Mathematical_Functions_Characters_And_Strings;
import java.util.Scanner;

/**
 * Financial application: monetary units
 * Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a float value to an int value. 
 * Read the input as a string such as "11.56". 
 * Your program should extract the dollar amount before the decimal point 
 * and the cents after the decimal amount using the indexOf and substring methods.
 * 
 * 08/18/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your change: ");
		String change = input.next();
		int dollars = Integer.parseInt(change.substring(0, change.indexOf('.')));
		int remainingChange = Integer.parseInt(change.substring(change.indexOf('.') + 1, change.length()));
		
		System.out.print("Dollar amount: " + dollars 
				+ "\nChange amount: " + remainingChange);
		
		input.close();
	}
}
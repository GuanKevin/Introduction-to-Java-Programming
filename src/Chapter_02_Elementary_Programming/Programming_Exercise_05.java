package Chapter_02_Elementary_Programming;
import java.util.Scanner;

/**
 * Financial application: calculate tips 
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
 * 
 * 02/03/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args)
	{
		System.out.print("Enter bill: ");
		Scanner input = new Scanner(System.in);
		double bill = input.nextDouble();
		double gratuity = 0.15;
		
		System.out.print("The gratuity cost is $" + (bill * gratuity) + " and the total cost is $" + (bill + (bill * gratuity)));
		input.close();
	}

}

package Chapter_06_Methods;
import java.util.Scanner;

/**
 * Financial application: print a tax table
 * Listing 3.5 gives a program to compute tax. 
 * Write a method for computing tax using the following header: 
 * public static double computeTax(int status, double taxableIncome)
 * Use this method to write a program that prints a tax table for taxable income from 
 * $50,000 to $60,000 with intervals of $50 for all the following statuses:
 * 
 * 08/30/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1 - Single"
				+ "\n2 - Married Joint or Qualifying Widower"
				+ "\n3 - Married Separate"
				+ "\n4 - Head of a house");
		System.out.print("Enter status and taxable income: ");
		System.out.print("Your tax is " + computeTax(input.nextInt(), input.nextDouble()));
		
		input.close();		
	}
	
	/**
	 * computing tax
	 * prints a tax table for taxable income
	 * 
	 * @param status
	 * @param taxableIncome
	 * @return
	 */
	public static double computeTax(int status, double taxableIncome)
	{
		System.out.printf("\n%-10s %-10s %-16s %-12s %-10s \n", "Taxable", "Single", "Married Joint", "Married", "Head of");
		System.out.printf("%-10s %-10s %-16s %-12s %-10s \n", "Income", " ", "or Qualifying", "Separate", "a House");
		System.out.printf("%-10s %-10s %-16s %-12s %-10s \n", "", "", "Wider(er)", "", "");
		System.out.print("-----------------------------------------------------------\n");
		
		for (int i = 50000; i <= 52500; i += 100)
			System.out.printf("%-10d %-10.2f %-16.2f %-12.2f %-10.2f\n", i, (i * .17376), (i * .1333), (i * .17376), (i * .14706));
		
		if (status == 1)
			return (taxableIncome * .17376);
		else if (status == 2)
			return (taxableIncome * .1333);
		else if (status == 3)
			return (taxableIncome * .17376);
		else
			return (taxableIncome * .14706);
	}
}

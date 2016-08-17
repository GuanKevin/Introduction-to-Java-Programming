package Chapter_03_Selections;
import java.util.Scanner;

/**
 * Financial application: compute taxes
 * Listing 3.5, ComputeTax.java, gives the source code to compute taxes for single filers. 
 * Complete Listing 3.5 to compute the taxes for all filing statuses.
 * 
 * 08/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	
		System.out.print("(0-single filer, 1-married jointly or " + 
				"qualifying widow(er), 2-married separately, 3-head of " +
				"household) Enter the filing status: ");
		
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		
		if (status == 0) 
		{ 
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 1)
		{
			if (income <= 18550)
				tax = income * 0.10;
			else if (income <= 75300)
				tax = 18550 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 18550 * 0.10 + (75300 - 8350) * 0.15 + (income - 75300) * 0.25;
			else if (income <= 171550)
				tax = 18550 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 18550 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else
				tax = 18550 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else 
		{
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		
		input.close();
	}
}

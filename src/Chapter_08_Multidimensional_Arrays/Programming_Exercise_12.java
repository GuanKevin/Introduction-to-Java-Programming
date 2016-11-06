package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Financial application: compute tax
 * Rewrite Listing 3.5, ComputeTax.java, using arrays. For each filing status, there are six tax rates. 
 * Each rate is applied to a certain amount of taxable income. 
 * For example, from the taxable income of $400,000 for a single filer, 
 * $8,350 is taxed at 10%, (33,950 - 8,350) at 15%, (82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at 33%, 
 * and (400,000 - 372,950) at 36%. The six rates are the same for all filing statuses, 
 * which can be represented in the following array: 
 * double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 * 
 * 10/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("0-single filer"
				+ "\n1-married jointly" 
				+ "\n2-married separately"
				+ "\n3-head of household" 
				+ "\nEnter the filing status: ");
		
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		if (status >= 0 && status <= 3)
			System.out.println("Tax is " + (int)(computeTax(status, income) * 100) / 100);
		else
			System.out.println("Error: invalid input");
		
		input.close();
	}
	
	/**
	 * Return the amount of tax taken
	 * 
	 * @param status
	 * @param income
	 * @return
	 */
	public static double computeTax(int status, double income) 
	{
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		int[][] brackets = {
				  {8350, 33950, 82250, 171550, 372950},  
				  {16700, 67900, 137050, 20885, 372950},
				  {8350, 33950, 68525, 104425, 186475}, 
				  {11950, 45500, 117450, 190200, 372950} 
				};

		double tax = 0;

		if (income <= brackets[status][0])
			return tax = income * rates[0];
		else
			tax = brackets[status][0] * rates[0];

		for (int i = 1; i < brackets[0].length; i++) 
		{
			if (income > brackets[status][i])
				tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
			else 
			{
				tax += (income - brackets[status][i - 1]) * rates[i];
				return tax; 
			}
		}

		return  tax += (income - brackets[status][4]) * rates[5];
	}
}

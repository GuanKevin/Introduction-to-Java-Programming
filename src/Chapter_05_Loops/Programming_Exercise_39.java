package Chapter_05_Loops;

/**
 * Financial application: find the sales amount
 * You have just started a sales job in a department store. 
 * Your pay consists of a base salary and a commission. 
 * The base salary is $5,000. The scheme shown below is used to determine the commission rate.
 * Sales Amount				Commission Rate
 * $0.01 - $5,000.00		.08%
 * $5,000.01 - $10,000.00	.10%
 * $10,000.01 - and above	.12%
 * Note that this is a graduated rate. 
 * The rate for the first $5,000 is at 8%, the next $5000 is at 10%, and the rest is at 12%. 
 * If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * Your goal is to earn $30,000 a year. 
 * Write a program that finds the minimum sales you have to generate in order to make $30,000.
 * 
 * 08/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_39 
{
	public static void main(String[] args) 
	{
		double commission = 0;
		double sales = 25000;
		double minimumSales;
		
		while (commission <= 25000)
		{
			sales++;
			minimumSales = sales;
			commission = 0;
			
			if (minimumSales >= 10000)
			{
				commission += 5000 * .08;
				minimumSales -= 5000;
				
				commission += 5000 * .10;
				minimumSales -= 5000;
			}

			commission += minimumSales * .12;
		}
		
		System.out.print("The minimum sales required is $" + sales
				+ "\n$5,000 * .08% = " + (5000 * .08)
				+ "\n$5,000 * .10% = " + (5000 * .1)
				+ "\n$" + (sales  - 10000) + " * .12% = " + ((sales - 10000) * .12));
	}
}

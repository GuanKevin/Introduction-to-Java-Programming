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
 * 03/24/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_39 
{
	public static void main(String[] args) 
	{
		double commissionEarned = 0.0;
		double salesAmount = 25000;
		double salesNessecary = salesAmount;
		
		while (commissionEarned < 25000)
		{
			commissionEarned = 0.0;
			
			commissionEarned += 5000 * .08;
			commissionEarned += 5000 * .10;
			salesNessecary -= 10000;
			commissionEarned += (salesAmount * .12);
			salesAmount += .01;
			salesNessecary = salesAmount;
		}
		
		System.out.printf("%s%.2f","The minimim to earn $30,000 per year is: ", salesNessecary);
	}
}

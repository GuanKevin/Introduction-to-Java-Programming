package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Financial tsunami
 * Banks lend money to each other. In tough economic times, if a bank goes bankrupt, it may not be able to pay back the loan. 
 * A bank’s total assets are its current balance plus its loans to other banks. 
 * The diagram in Figure 8.8 shows five banks. 
 * The banks’ current balances are 25, 125, 175, 75, and 181 million dollars, respectively. 
 * The directed edge from node 1 to node 2 indicates that bank 1 lends 40 million dollars to bank 2.
 * If a bank’s total assets are under a certain limit, the bank is unsafe. 
 * The money it borrowed cannot be returned to the lender, and the lender cannot count the loan in its total assets. 
 * Consequently, the lender may also be unsafe, if its total assets are under the limit. 
 * Write a program to find all the unsafe banks. Your program reads the input as follows. 
 * It first reads two integers n and limit, where n indicates the number of banks and limit is the minimum total assets for keeping a bank safe. 
 * It then reads n lines that describe the information for n banks with IDs from 0 to n-1. 
 * The first number in the line is the bank’s balance, the second number indicates the number of banks that borrowed money from the bank, 
 * and the rest are pairs of two numbers. Each pair describes a borrower. 
 * The first number in the pair is the borrower’s ID and the second is the amount borrowed.
 * Hint: Use a two-dimensional array borrowers to represent loans. borrowers[i][j] indicates the loan that bank i loans to bank j. 
 * Once bank j becomes unsafe, borrowers[i][j] should be set to 0.
 * 
 * 02/25/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
	}
}

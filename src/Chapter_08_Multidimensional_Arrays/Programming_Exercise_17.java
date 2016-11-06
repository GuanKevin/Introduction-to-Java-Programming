package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Financial tsunami
 * Write a program to find all the unsafe banks. Your program reads the input as follows. 
 * It first reads two integers n and limit, where n indicates the number of banks and limit is the minimum total assets for keeping a bank safe. 
 * It then reads n lines that describe the information for n banks with IDs from 0 to n-1. 
 * The first number in the line is the bank’s balance, the second number indicates the number of banks that borrowed money from the bank, 
 * and the rest are pairs of two numbers. Each pair describes a borrower. 
 * The first number in the pair is the borrower’s ID and the second is the amount borrowed.
 * Hint: Use a two-dimensional array borrowers to represent loans. borrowers[i][j] indicates the loan that bank i loans to bank j. 
 * Once bank j becomes unsafe, borrowers[i][j] should be set to 0.
 * 
 * 10/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17 
{
	static Scanner input = new Scanner(System.in);	    
	public static void main (String[] args)
	{
	    System.out.print("Enter number of banks: ");
	    int numberBanks = input.nextInt();
	    
	    System.out.print("Enter bank limit: ");
	    int bankLimit = input.nextInt();
	    
	    int[] banks = new int[numberBanks];
	    double[][] borrowers = new double[numberBanks][numberBanks];
	    
	    storeLoanData(banks, borrowers);	    
	    calculateLoans(banks, borrowers, bankLimit);
	    checkBanks(banks, borrowers, bankLimit);
	    
	  	input.close();
  	}
	
	/**
	 * Store the amount of money borrowed by which bank and the amount borrowed
	 * 
	 * @param banks
	 * @param borrowers
	 */
	public static void storeLoanData(int[] banks, double[][] borrowers)
	{
	    for (int i = 0; i < banks.length; i++)
	    {
	    	System.out.print("Bank " + (i + 1) + "'s asset: ");
	    	banks[i] = input.nextInt();
	    	
	    	System.out.print("Lend to how many banks: ");
	    	int lendNumBanks = input.nextInt();
	    	
	    	for (int j = 0; j < lendNumBanks; j++)
	    	{
	    		System.out.print("Enter bank number and amount to lend: ");
	    		borrowers[i][input.nextInt()] = input.nextDouble();
	    	}
	    }    
	    System.out.println();
	}
	
	public static void calculateLoans(int[] banks, double[][] borrowers, int bankLimit)
	{
		for (int i = 0; i < banks.length; i++)
			for (int j = 0; j < banks.length; j++)
			{
				int total = 0;
		      
				for (int k = 0; k < banks.length; k++)
					total += borrowers[j][k];
		     
				if (total + banks[j] < bankLimit)
					for (int m = 0; m < banks.length; m++)
						borrowers[m][j] = 0;
			  }
	}
	
	public static void checkBanks(int[] banks, double[][] borrowers, int bankLimit)
	{
		System.out.print("Unsafe banks are ");
		  
		for (int i = 0; i < banks.length; i++)
		{
			int total = 0;
		    for (int j = 0; j < banks.length; j++)
		      total += borrowers[i][j];
		    
		    if (total + banks[i] < bankLimit)
		    	System.out.print(i + " ");
		}
	}
}

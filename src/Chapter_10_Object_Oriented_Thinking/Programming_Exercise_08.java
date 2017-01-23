package Chapter_10_Object_Oriented_Thinking;
import utilities.Tax;

/**
 * Financial: the Tax class
 * Programming Exercise 8.12 writes a program for computing taxes using arrays. 
 * Design a class named Tax to contain the following instance data fields: 
 * int filingStatus: One of the four tax-filing statuses: 0—single filer, 1— married filing jointly or 
 * qualifying widow(er), 2—married filing separately, and 3—head of household. 
 * Use the public static constants SINGLE_FILER (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), 
 * MARRIED_SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses. 
 * int[][] brackets: Stores the tax brackets for each filing status.
 * double[] rates: Stores the tax rates for each bracket.
 * double taxableIncome: Stores the taxable income.
 * Provide the getter and setter methods for each data field and the getTax() method that returns the tax. 
 * Also provide a no-arg constructor and the constructor Tax(filingStatus, brackets, rates, taxableIncome). 
 * Write a test program that uses the Tax class to print the 2001 and 2009 tax tables for taxable income from 
 * $50,000 to $60,000 with intervals of $1,000 for all four statuses. 
 * The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001 are shown in Table 10.1.
 * 
 * 11/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		int[][] bracketsFor2001 = 
			{
					{27050, 65550, 136750, 297350}, // Single filer
					{45200, 109250, 166500, 297350}, // married filing jointly
					{22600, 54625, 83250, 148675}, // married filing separately
					{36250, 93650, 151650, 297350} // head of household
			};

	    double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

	    int[][] bracketsFor2002 = 
	    	{
	    			{6000, 27950, 67700, 141250, 307050}, // Single filer
	    			{12000 , 46700, 112850, 171950, 307050}, // married filing jointly
	    			{6000, 23350, 56425, 85975, 153525}, // married filing separately
	    			{10000, 37450, 96700, 156600, 307050} // head of household
	    	};

	    double[] ratesFor2002 = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};

	    Tax taxFor2001 = new Tax(0, bracketsFor2001, ratesFor2001, 50000);
	    System.out.println("2001 Tax Table");
	    System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
	    System.out.println("Income\tSingle\tJoint\tSeparate\ta House");
	    
	    for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) 
	    {
	    	taxFor2001.setTaxableIncome(taxableIncome);
	    	taxFor2001.setFilingStatus(0);
	    	int taxForStatus0 = (int)taxFor2001.findTax();
	    	taxFor2001.setFilingStatus(1);
	    	int taxForStatus1 = (int)taxFor2001.findTax();
	    	taxFor2001.setFilingStatus(2);
	    	int taxForStatus2 = (int)taxFor2001.findTax();
	    	taxFor2001.setFilingStatus(3);
	    	int taxForStatus3 = (int)taxFor2001.findTax();
	    	System.out.println(taxableIncome + "\t" + taxForStatus0 + "\t" + taxForStatus1 + "\t" + taxForStatus2 + "\t" + taxForStatus3);
	    }

	    Tax taxFor2002 = new Tax(0, bracketsFor2002, ratesFor2002, 50000);
	    System.out.println("2002 Tax Table");
	    System.out.println("taxable\tSingle\tMarried\tMarried\tHead of a House");
	    System.out.println("Income\tSingle\tJoint\tSeparate\t");
	    for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) 
	    {
	    	taxFor2002.setTaxableIncome(taxableIncome);
	    	taxFor2002.setFilingStatus(0);
	    	int taxForStatus0 = (int)taxFor2002.findTax();
	    	taxFor2002.setFilingStatus(1);
	    	int taxForStatus1 = (int)taxFor2002.findTax();
	    	taxFor2002.setFilingStatus(2);
	    	int taxForStatus2 = (int)taxFor2002.findTax();
	    	taxFor2002.setFilingStatus(3);
	    	int taxForStatus3 = (int)taxFor2002.findTax();
	    	System.out.println(taxableIncome + "\t" + taxForStatus0 + "\t" + taxForStatus1 + "\t" + taxForStatus2 + "\t" + taxForStatus3);
	    }
    }
}


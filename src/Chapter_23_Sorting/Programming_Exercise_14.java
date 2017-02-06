package Chapter_23_Sorting;

import java.io.IOException;

import utilities.CreateLargeFile;
import utilities.ExternalSort;

/**
 * Execution time for external sorting
 * Write a program that obtains the execution time of external sorts for integers of size 
 * 5,000,000, 10,000,000, 15,000,000, 20,000,000, 25,000,000, and 30,000,000.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_14 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.print("Dat file not found, ending program.");
			System.exit(0);
		}
		
		long startTime = System.currentTimeMillis();
		
		new CreateLargeFile().generateFile();
		
		try 
		{
			new ExternalSort(args[0]).sort();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		};
		
		System.out.println("External sort took " + (System.currentTimeMillis() - startTime) + " milliseconds.");
	}
}

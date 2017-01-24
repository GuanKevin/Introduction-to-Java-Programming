package Chapter_17_Binary_IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import utilities.Loan;

/**
 * Restore objects from a file
 * Suppose a file named Exercise17_07.dat has been created using the ObjectOutputStream. 
 * The file contains Loan objects. 
 * The Loan class in Listing 10.2 does not implement Serializable. 
 * Rewrite the Loan class to implement Serializable. 
 * Write a program that reads the Loan objects from the file and displays the total loan amount. 
 * Suppose you don’t know how many Loan objects are there in the file, use EOFException to end the loop.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/Text_Files/Chapter_17/CHP17_PE07.dat"));)
		{
			double totalLoan = 0;
			boolean eof = true;
			
			try 
			{
				Loan loan;
				while (eof)
				{
					loan = (Loan) input.readObject();
					totalLoan += loan.getLoanAmount();
				}
			}
			catch (EOFException ex)
			{
				eof = false;
			}
			
			System.out.print("The total loan is " + totalLoan);
		}
	}
}

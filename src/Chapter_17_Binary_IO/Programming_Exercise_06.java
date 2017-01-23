package Chapter_17_Binary_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import utilities.Loan;

/**
 * Store Loan objects
 * The Loan class in Listing 10.2 does not implement Serializable. 
 * Rewrite the Loan class to implement Serializable. 
 * Write a program that creates five Loan objects and stores them in a file named Exercise17_06.dat.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/Text_Files/Chapter_17/CHP17_PE06.dat"));)
		{
			output.writeObject(new Loan());
			output.writeObject(new Loan(4.5, 3, 2000));
			output.writeObject(new Loan(5.5, 4, 1000));
			output.writeObject(new Loan(.5, 1, 10000));
			output.writeObject(new Loan(.1, 10, 990000));
		}
	}
}

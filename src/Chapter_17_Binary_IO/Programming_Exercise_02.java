package Chapter_17_Binary_IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Create a binary data file
 * Write a program to create a file named Exercise17_02.dat if it does not exist. 
 * Append new data to it if it already exists. 
 * Write 100 integers created randomly into the file using binary I/O.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	public static void main(String[] args) throws IOException  
	{
		File binDataFile = new File("src/Text_Files/Chapter_17/CHP17_PE02.dat");
		if (!binDataFile.exists())
		{
			System.out.println("File doesn't exist, generating binary data file...");
			binDataFile.createNewFile();
		}
		
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream(binDataFile, true));) 
		{
			Random rand = new Random();
			System.out.println("Generating numbers to file...");
			for (int i = 1; i <= 100; i++)
			{
				if (i % 10 == 0)
					output.write((String.valueOf(rand.nextInt(100)) + " ").getBytes());
				else
					output.write((String.valueOf(rand.nextInt(100)) + "\n").getBytes());
			}
		}
		System.out.println("Done");
	}
}

package Chapter_17_Binary_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Create a text file
 * Write a program to create a file named Exercise17_01.txt if it does not exist. 
 * Append new data to it if it already exists. Write 100 integers created randomly into the file using text I/O. 
 * Integers are separated by a space.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_01
{
	public static void main(String[] args) throws IOException
	{
		File textFile = new File("src/Text_Files/Chapter_17/CHP17_PE01.txt");
		if (!textFile.exists())
		{
			System.out.println("File does not exist, generating file...");
			textFile.createNewFile();
		}
		
		try (FileOutputStream output = new FileOutputStream(textFile, true))
		{
			Random rand = new Random();
			System.out.print("Generating numbers...");
			
			for (int i = 1; i <= 100; i++)
			{
				if (i % 10 == 0)
					output.write((String.valueOf(rand.nextInt(100)) + "\n").getBytes());
				else
					output.write((String.valueOf(rand.nextInt(100)) + " ").getBytes());
			}
		}
	}
}

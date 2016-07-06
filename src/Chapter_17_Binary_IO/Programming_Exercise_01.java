package Chapter_17_Binary_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Create a text file
 * Write a program to create a file named Exercise17_01.txt if it does not exist. 
 * Append new data to it if it already exists. Write 100 integers created randomly into the file using text I/O. 
 * Integers are separated by a space.
 * 
 * @author kevgu
 * 06/23/2016
 *
 */

public class Programming_Exercise_01
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		try (FileOutputStream output = new FileOutputStream("Exercise17_01.txt", true);)
		{
			Random rand = new Random();
			for (int i = 0; i < 10; i++)
			{
				output.write(rand.nextInt(10));
			}
		}
		
		try (FileInputStream input = new FileInputStream("Exercise17_01.txt");)
		{
			int value = 0;
			
			while ((value = input.read()) != -1)
			{
				System.out.print(value + " ");
			}
		}
	}
}

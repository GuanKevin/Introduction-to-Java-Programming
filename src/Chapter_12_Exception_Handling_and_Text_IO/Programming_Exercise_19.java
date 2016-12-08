package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Count words
 * Write a program that counts the number of words in President Abraham Lincoln’s Gettysburg address from 
 * http://cs.armstrong.edu/liang/data/Lincoln.txt.
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_19
{
	public static void main(String[] args) throws FileNotFoundException  
	{
		if (args.length != 1)
		{
			System.out.print("Missing arguments.");
			System.exit(0);
		}
		
		File fileName = new File(args[0]);
		if (!fileName.exists())
		{
			System.out.print("File does not exist.");
			System.exit(1);
		}
		
		try (Scanner reader = new Scanner(fileName))
		{
			int wordCounter = 0;
			
			while (reader.hasNext())
			{
				String word = reader.next();
				if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' 
						|| word.charAt(0) >= 'a' && word.charAt(0) <= 'z')
					wordCounter++;
			}
			
			System.out.print("There are " + wordCounter + " words.");
		}
	}
}

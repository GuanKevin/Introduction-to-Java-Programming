package Chapter_18_Recursion;

import java.io.File;
import java.util.Scanner;

/**
 * Replace words
 * Write a program that replaces all occurrences of a word with a new word in all the files under a directory, recursively. 
 * Pass the parameters from the command line as follows: 
 * java Exercise18_31 dirName oldWord newWord
 * 
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_31
{
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.print("directoryName, oldString, newString");
			System.exit(0);
		}
		
		File textFile = new File(args[0]);
		if (!textFile.exists())
		{
			System.out.print("File does not exist!");
			System.exit(1);
		}
		
		try (Scanner reader = new Scanner(textFile))
		{
			while (reader.hasNext())
				System.out.print(reader.next() + " ");
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
		
		replaceWords();
	}
	
	public static void replaceWords()
	{
		
	}
}

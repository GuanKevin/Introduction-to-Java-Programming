package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Data sorted?
 * Write a program that reads the strings from file SortedStrings.txt and reports whether the strings in the files are stored in increasing order.
 * If the strings are not sorted in the file, displays the first two strings that are out of the order.
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21
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
			System.out.println("Missing file.");
			System.exit(1);
		}
		
		if (isSorted(fileName))
			System.out.print("File is sorted.");
	}

	private static boolean isSorted(File fileName) throws FileNotFoundException 
	{
		try (Scanner reader = new Scanner(fileName))
		{
			String string1, string2 = null;
			
			while (reader.hasNext())
			{
				if (string2 != null)
				{
					string1 = string2;
					string2 = reader.next();
				}
				else
				{
					string1 = reader.next();
					string2 = reader.next();
				}
				
				System.out.println("S1: " + string1 + " S2: " + string2);
				
				int minSize = Math.min(string1.length(), string2.length());
				
				if (string1.charAt(0) < string2.charAt(0))
					continue;
				else if (string1.charAt(0) > string2.charAt(0))
				{
					System.out.print(string1 + " " + string2);
					return false;
				}
				else
					for (int i = 1; i < minSize; i++)
						if (string1.charAt(i) > string2.charAt(i))
						{
							System.out.print(string1 + " " + string2);
							return false;
						}
				if (string1.length() > string2.length())
				{
					System.out.print(string1 + " " + string2);
					return false;
				}
			}
		}
		
		return true;
	}
} 
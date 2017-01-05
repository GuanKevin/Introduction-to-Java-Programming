package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Count the keywords in Java source code
 * Revise the program in Listing 21.7. 
 * If a keyword is in a comment or in a string, don’t count it. 
 * Pass the Java file name from the command line. 
 * Assume that the Java source code is correct and line comments and paragraph comments do not overlap.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 2)
		{
			System.out.print("Arguments invalid.. ending program..");
			System.exit(0);
		}
		
		File textFile = new File(args[0]);
		File javaFile = new File(args[1]);
		if (!textFile.exists() || !javaFile.exists())
		{
			System.out.print("File not found.. ending program..");
			System.exit(1);
		}
		
		SortedSet<String> set = new TreeSet<>();
		int wordCount = 0;
		try (Scanner input = new Scanner(textFile))
		{
			while (input.hasNext())
				set.add(input.next().toLowerCase());
		}
		try (Scanner input = new Scanner(javaFile))
		{
			while (input.hasNext())
			{
				String[] words = input.nextLine().split(" ");
				
				for (int i = 0; i < words.length; i++)
				{
					if (words[i].contains("//"))
						break;
					if (set.contains(words[i].trim().toLowerCase()))
					{
						System.out.println("Keyword: " + words[i].trim()); 
						wordCount++;
					}
				}
			}
		}
		
		System.out.print("Numbers of keywords: " + wordCount);
	}
}

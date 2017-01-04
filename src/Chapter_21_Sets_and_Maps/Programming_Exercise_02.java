package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Display nonduplicate words in ascending order
 * Write a program that reads words from a text file and displays all the nonduplicate words in ascending order. 
 * The text file is passed as a command-line argument.
 * 
 * 01/04/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_02 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 1)
		{
			System.out.print("Missing arguments.. terminating program..");
			System.exit(0);
		}
		
		File textFile = new File(args[0]);
		if (!textFile.exists())
		{
			System.out.print("File not found.. terminating program..");
			System.exit(1);
		}
		
		Set<String> set = new HashSet<>();
		try (Scanner input = new Scanner(textFile))
		{
			while (input.hasNext())
				set.add(input.next());
		}
		
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println(treeSet);
	}
}

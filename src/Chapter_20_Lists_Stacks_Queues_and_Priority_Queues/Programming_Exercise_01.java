package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Display words in ascending alphabetical order
 * Write a program that reads words from a text file and displays all the words (duplicates allowed) in ascending alphabetical order. 
 * The words must start with a letter. The text file is passed as a command-line argument.
 * 
 * 01/02/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.print("Missing path directory.. termininating program..");
			System.exit(0);
		}
		
		File textFile = new File(args[0]);
		if (!textFile.exists())
		{
			System.out.print("File does not exist.. terminating program..");
			System.exit(1);
		}
		
		List<String> list = new ArrayList<>();
		try (Scanner input = new Scanner(textFile))
		{
			while (input.hasNext())
				list.add(input.next());
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
		
		Collections.sort(list);
		System.out.print(list);
	}
}

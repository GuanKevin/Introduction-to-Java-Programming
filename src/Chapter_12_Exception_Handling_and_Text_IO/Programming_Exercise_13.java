package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Count characters, words, and lines in a file
 * Write a program that will count the number of characters, words, and lines in a file. 
 * Words are separated by whitespace characters. 
 * The file name should be passed as a command-line argument, as shown in Figure 12.13.
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13
{
	public static void main(String[] args) throws FileNotFoundException   
	{
		if (args.length != 1)
		{
			System.out.print("Missing arguments.");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.println("Source file does not exist.");
			System.exit(1);
		}
		
		Scanner input = new Scanner(sourceFile);
		int characters = 0, words = 0, lines = 0;
		
		while (input.hasNext())
		{
			String s = input.nextLine();
			lines++;
			
			String[] split = s.split(" ");
			
			for (int i = 0; i < split.length; i++)
				if (split[i].length() == 1)
					characters++;
				else
					words++;
		}
		
		System.out.print("Lines: " + lines +
				"\nWords: " + words +
				"\nCharacters: " + characters);
		
		input.close();
	}
}

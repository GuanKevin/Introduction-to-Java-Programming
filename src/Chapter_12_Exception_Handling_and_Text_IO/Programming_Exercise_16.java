package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Replace text
 * Listing 12.16, ReplaceText.java, gives a program that replaces text in a source file and saves the change into a new file. 
 * Revise the program to save the change into the original file. 
 * For example, invoking java Exercise12_16 file oldString newString replaces oldString in the source file with newString.
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_16
{
	public static void main(String[] args) throws FileNotFoundException   
	{
		if (args.length != 3)
		{
			System.out.println("Missing arguements: file oldString newString");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.print("File not found!");
			System.exit(1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		try (Scanner input = new Scanner(sourceFile))
		{
			while (input.hasNext())
			{
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[1], args[2]);
				sb.append(s2);
			}
		}
		
		try (PrintWriter writer = new PrintWriter(sourceFile))
		{
			writer.printf("%s", sb.toString());
		}
    }
}

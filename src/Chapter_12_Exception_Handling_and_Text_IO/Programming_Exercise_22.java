package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Replace text
 * Revise Programming Exercise 12.16 to replace a string in a file with a new string for all files in the specified directory using the command: 
 * java Exercise12_22 dir oldString newString
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22
{
	public static void main(String[] args) throws Exception 
	{
		if (args.length != 3) 
		{
			System.out.println("Usage: java Exercise12_22 dir oldStr newStr");
			System.exit(1);
	    }

	    File currentDir = new File(args[0]);
	    System.out.println("Directory name: " + currentDir.getName());

	    if (!currentDir.exists()) 
	    {
	    	System.out.println("Current directory " + args[0] + " does not exist");
	    	System.exit(2);
	    }

	    if (currentDir.isFile()) 
	    	replaceInAFile(currentDir, args[1], args[2]);
	    else 
	    {
	    	File[] files = currentDir.listFiles();
	    	
	    	for (int i = 0; i < files.length; i++)
	    		if (files[i].isFile())
	    			replaceInAFile(files[i], args[1], args[2]);
	    }
    }

	private static void replaceInAFile(File sourceFile, String oldStr, String newStr) 
	{
		StringBuilder sb = new StringBuilder();
		
		try 
		{
			try (Scanner input = new Scanner(sourceFile);) 
			{
				while (input.hasNext()) 
				{ 
					String s1 = input.nextLine();
					String s2 = s1.replaceAll(oldStr, newStr);
					sb.append(s2 + "\n");
				}
			}
			
			try (PrintWriter output = new PrintWriter(sourceFile);) 
			{
				output.printf("%s\n", sb.toString());
			} 
		}
	    catch (Exception ex) 
		{
	    	ex.printStackTrace();
	    }
	}
}
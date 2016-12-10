package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;

/**
 * Rename files
 * Suppose you have a lot of files in a directory named Exercisei_j, where i and j are digits. 
 * Write a program that pads a 0 before j if j is a single digit. 
 * For example, a file named Exercise2_1 in a directory will be renamed to Exercise2_01. 
 * In Java, when you pass the symbol * from the command line, it refers to all files in the directory (see Supplement III.V). 
 * Use the following command to run your program. java Exercise12_29 *
 * 
 * 12/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_29
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.print("Missing files. Terminating program.");
			System.exit(0);
		}
		
		for (int i = 0; i < args.length; i++)
		{
			if (args[i].matches("Exercise[\\d]_[\\d].txt"))
			{
				String s = args[i];
				String newName = s.substring(0, s.indexOf('_') + 1) + "0" + s.substring(s.indexOf('_') + 1) ;
				
				File file = new File(args[i]);
				file.renameTo(new File(newName));
			}
		}
	}
}

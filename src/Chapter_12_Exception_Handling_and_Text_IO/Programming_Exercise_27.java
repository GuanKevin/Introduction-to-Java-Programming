package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;

/**
 * Replace words
 * Suppose you have a lot of files in a directory that contain words Exercisei_j, where i and j are digits. 
 * Write a program that pads a 0 before i if i is a single digit and 0 before j if j is a single digit. 
 * For example, the word Exercise2_1 in a file will be replaced by Exercise02_01. 
 * In Java, when you pass the symbol * from the command line, it refers to all files in the directory (see Supplement III.V). 
 * Use the following command to run your program. 
 * java Exercise12_27 *
 * 
 * 12/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27
{
	public static void main(String[] args) 
	{		
		if (args.length == 0)
		{
			System.out.print("Missing files.");
			System.exit(0);
		}
		
		for (String str : args)
			if (str.matches("Exercise[\\d]_[\\d].txt"))
			{
				StringBuilder strBld = new StringBuilder(str);
				strBld.insert(str.indexOf('_') - 1, '0');
				strBld.insert(11, '0');
				
				new File(str).renameTo(new File(strBld.toString()));
				System.out.println(str + " renamed to " + strBld.toString());
			}
	}
}
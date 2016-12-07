package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Remove text
 * Write a program that removes all the occurrences of a specified string from a text file. 
 * For example, invoking java Exercise 12_11 John filename removes the string John from the specified file. 
 * Your program should get the arguments from the command line.
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.print("Argument not found.");
			return;
		}
		
		File myTextFile = new File(args[0]);
		if (myTextFile.exists())
			System.out.print("Text file exist!");
		else
			System.out.println("Text file does not exist!");
		
		String editString = "";
		try
		{
			Scanner textReader = new Scanner(myTextFile);
			
			while(textReader.hasNext())
				editString += textReader.nextLine();
			
			textReader.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		editString = editString.replaceAll("Hello", "");
		
		try
		{
			PrintWriter editor = new PrintWriter(myTextFile);
			editor.write(editString);
			System.out.println("Editor finish editing.");
			
			editor.close();
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
}

package Chapter_12_Exception_Handling_and_Text_IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Remove text
 * Write a program that removes all the occurrences of a specified string from a text file. 
 * For example, invoking java Exercise 12_11 John filename removes the string John from the specified file. 
 * Your program should get the arguments from the command line.
 * 
 * 03/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_11
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("Argument does not exist!");
			System.exit(0);
		}
		
		File myFile = new File(args[0]);
		if (myFile.exists())
		{
			System.out.println("File exists!");
		}
		else
		{
			System.out.println("File does not exists!");
		}
		
		String emptyStr = "";
		
		try 
		{
			Scanner fileReader = new Scanner(myFile);
			
			while (fileReader.hasNext())
			{
				emptyStr += fileReader.nextLine();
			}
			
			fileReader.close();
		} 
		catch (FileNotFoundException ex) 
		{
			ex.printStackTrace();
		}
		emptyStr = emptyStr.replaceAll("John", "Batman");
		
		try 
		{
			PrintWriter editor = new PrintWriter(myFile);
			editor.write(emptyStr);
			editor.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}

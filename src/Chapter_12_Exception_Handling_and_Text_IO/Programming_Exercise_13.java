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
 * 03/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13
{
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("Not correct amount of arguments!" );
			System.exit(0);
		}
		
		File testFile = new File(args[0]);
		int charCounter = 0;
		int wordCounter = 0;
		int lineCounter = 0;
		
		try
		{
			Scanner readFile = new Scanner(testFile);
			
			while (readFile.hasNext())
			{
				String holdFileLines = readFile.nextLine();
				lineCounter++;
				
				charCounter += holdFileLines.length();
				
				String[] wordCheck = holdFileLines.split(" ");
				wordCounter += wordCheck.length;
			}
			
			readFile.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getStackTrace());
		}
		
		System.out.print("Characters: " + charCounter + 
				"\nWords: " + wordCounter +
				"\nLines: " + lineCounter);
	}
}

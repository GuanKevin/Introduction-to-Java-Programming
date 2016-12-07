package Chapter_12_Exception_Handling_and_Text_IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reformat Java source code
 * Write a program that converts the Java source code from the next-line brace style to the end-of-line brace style. 
 * For example, the following Java source in (a) uses the next-line brace style.
 * Your program converts it to the end-of-line brace style in (b).
 * It converts the Java source code to a new format. 
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_12
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		if (args.length != 1)
		{
			System.out.println("Incorrect amount of arguements!");
			System.exit(0);
		}
		
		File testFile = new File(args[0]);
		String bracketStr = "";
		
		try
		{
			Scanner fileReader = new Scanner(testFile);
			
			while (fileReader.hasNext())
			{
				bracketStr += fileReader.next();
			}
			
			fileReader.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getStackTrace());
		}
		
		try
		{
			PrintWriter fileWriter = new PrintWriter(testFile);
			
			for (int i = 0; i < bracketStr.length(); i++)
			{
				if (bracketStr.charAt(i) == '{')
				{
					fileWriter.write(bracketStr.charAt(i) + "\n");
				}
				else
				{
					fileWriter.write(bracketStr.charAt(i));
				}
			}
			
			fileWriter.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(ex.getStackTrace());
		}
	}
}

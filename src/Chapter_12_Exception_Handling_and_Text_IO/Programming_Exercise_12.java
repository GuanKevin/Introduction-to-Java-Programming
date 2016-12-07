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
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 1)
		{
			System.out.print("Arguments not found.");
			System.exit(1);;
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.print("Text file not found!");
			System.exit(2);;
		}
		
		StringBuilder buffer = new StringBuilder();
		Scanner input = new Scanner(sourceFile);
		
		while (input.hasNext())
		{
			String s = input.nextLine();
			String s1 = s.trim();
			
			if (s1.charAt(0) == '{')
			{
				buffer.append(" {");
				if (s1.length() > 1) 
					buffer.append("\n" + s.replace('{', ' '));
			}
			else
				buffer.append("\n" + s);
		}
		
		input.close();
		
		PrintWriter output = new PrintWriter(sourceFile);
		output.print(buffer.toString());
		output.close();
    }
}
package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Add package statement
 * Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. 
 * Write a program to insert the statement package chapteri; as the first line for each Java source file under the directory chapteri. 
 * Suppose chapter1, chapter2, . . . , chapter34 are under the root directory srcRootDirectory. 
 * The root directory and chapteri directory may contain other folders and files. Use the following command to run the program: 
 * java Exercise12_18 srcRootDirectory
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18
{
	public static void main(String[] args) throws Exception 
	{
		if (args.length != 1)
		{
			System.out.print("Enter source root directory.");
			System.exit(0);
		}
		
		File currentDir = new File(args[0]);
		
		if (!currentDir.exists())
		{
			System.out.println("Current directory " + args[0] + " does not exist.");
			System.exit(1);
		}
		
		if (!currentDir.isDirectory())
		{
			System.out.print(args[0] + " is not a directory.");
			System.exit(2);
		}
		else 
		{
			File[] files = currentDir.listFiles();
			
			for (int i = 0; i < files.length; i++)
				if (files[i].isDirectory() && files[i].getName().startsWith("chapter")) 
				{
					String packageStatment = "package " + files[i].getName() + ";\n";
					insertIntoFilesInDirectory(files[i], packageStatment);
		        }
	    }
	}
	
	private static void insertIntoFilesInDirectory(File directory, String line) throws Exception 
	{
		File[] files = directory.listFiles();

		for (int i = 0; i < files.length; i++)
			if (files[i].isFile() && files[i].getName().endsWith(".java")) 
			{
				insertPackageStatment(files[i], line);
			}
	}
	
	private static void insertPackageStatment(File file, String line) throws Exception 
	{
		StringBuilder sb = new StringBuilder(line);

		try (Scanner input = new Scanner(file);) 
		{
			while (input.hasNext())  
				sb.append("\n" + input.nextLine());
	    }
		try (PrintWriter output = new PrintWriter(file);) 
		{
			output.printf("%s\n", sb.toString());
		}
	}
}

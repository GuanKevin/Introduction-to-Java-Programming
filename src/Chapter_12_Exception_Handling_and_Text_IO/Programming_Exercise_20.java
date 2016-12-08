package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Remove package statement
 * Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. 
 * Write a program to remove the statement package chapteri; in the first line for each Java source file under the directory chapteri. 
 * Suppose chapter1, chapter2,. . . , chapter34 are under the root directory srcRootDirectory. 
 * The root directory and chapteri directory may contain other folders and files. 
 * Use the following command to run the program:
 * java Exercise12_20 srcRootDirectory
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_20
{
	 public static void main(String[] args) throws Exception 
	 {
		 if (args.length != 1) 
		 {
			 System.out.println("Usage: srcRootDirectory");
			 System.exit(1);
	    }

		 File currentDir = new File(args[0]);

		 if (!currentDir.exists()) 
		 {
			 System.out.println("Current directory " + args[0] + " does not exist");
			 System.exit(2);
		 }

	    if (!currentDir.isDirectory()) 
	    {
	    	System.out.println(args[0] + " is not a directory");
	    	System.exit(3);
	    } 
	    else 
	    {
	    	File[] files = currentDir.listFiles();
	    	for (int i = 0; i < files.length; i++)
	    		if (files[i].isDirectory() && files[i].getName().startsWith("chapter")) 
	    			removePackageStatementFromFilesInDirectory(files[i]);
		        
	    }
    }

	 private static void removePackageStatementFromFilesInDirectory(File directory) throws Exception 
	 {
		 File[] files = directory.listFiles();

		 for (int i = 0; i < files.length; i++)
			 if (files[i].isFile() && files[i].getName().endsWith(".java"))
				 removePackageStatment(files[i]);
	 }

	 private static void removePackageStatment(File file) throws Exception 
	 {
		 StringBuilder sb = new StringBuilder();

		 try (Scanner input = new Scanner(file)) 
		 {
			 String firstLine = input.nextLine();
			 
			 if (!firstLine.toString().startsWith("package"))
				 sb.append(firstLine + "\n");
		      
			 while (input.hasNext())
				 sb.append(input.nextLine() + "\n");
		 }
		   
		 try (PrintWriter output = new PrintWriter(file);) 
		 {
			 output.printf("%s", sb.toString());
		 }
	 }
}

package Chapter_18_Recursion;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Number of files in a directory
 * Write a program that prompts the user to enter a directory and displays the number of the files in the directory.
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_29
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a directory: ");
		String path = input.next();
		System.out.print("Folders in directory " + (new File(path).getAbsolutePath()) + " is " + getNumFiles(new File(path)));
		input.close();
	}
	
	public static long getNumFiles(File file) throws FileNotFoundException
	{
		if (!file.exists()) 
		     throw new java.io.FileNotFoundException(file + " not found");
	    if (file.isFile()) 
	    	return file.length();
	    else 
	    {
	    	File[] files = file.listFiles();
	    	long size = 0;
		      
	    	for (int i = 0; i < files.length; i++) 
	    	{
		        size++;
		        getNumFiles(files[i]);
	    	}
	    	return size;
	    }
	}
}

package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.util.Scanner;

/**
 * Create a directory
 * Write a program that prompts the user to enter a directory name and creates a directory using the File’s mkdirs method. 
 * The program displays the message “Directory created successfully” if a directory is created or “Directory already exists” if the directory already exists.
 * 
 * 12/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_26
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of directory: ");
		String dirName = input.nextLine();
		
		if (new File(dirName).mkdir())
			System.out.print("Directory " + dirName + " created.");
		else
			System.out.print("Directory " + dirName + " already exist.");
		
		
		input.close();
	}
}

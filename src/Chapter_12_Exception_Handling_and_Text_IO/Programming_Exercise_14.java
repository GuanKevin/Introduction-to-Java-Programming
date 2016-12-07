package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Process scores in a text file
 * Suppose that a text file contains an unspecified number of scores separated by blanks. 
 * Write a program that prompts the user to enter the file, reads the scores from the file, and displays their total and average.
 * 
 * 12/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_14
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String fileName;
		boolean correctName = false;
		
		while (!correctName)
		{
			fileName = input.nextLine();
			
			try (Scanner textReader = new Scanner(new File(fileName));)
			{
				double total = 0;
				int scoreCounter = 0;
				
				while (textReader.hasNext())
				{
					String line = textReader.nextLine();
					line = line.replaceAll("[^-0-9]", " ");
					String[] scoreList = line.trim().split(" ");
					
					for (int i = 0; i < scoreList.length; i++)
					{
						total += Integer.parseInt(scoreList[i]);
						scoreCounter++;
					}
				}
				
				System.out.println("Total is " + total
			    		  + "\nAverage is " + (total / scoreCounter));
				correctName = true;
				input.close();
			}
			catch (Exception ex)
			{
				System.out.print(ex.getMessage() + 
						"\nEnter path and name again: ");
			}
		}
		
		
	}
}
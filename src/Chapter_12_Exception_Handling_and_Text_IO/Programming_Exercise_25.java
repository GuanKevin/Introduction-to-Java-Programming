package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Process large dataset
 * A university posts its employees’ salaries at http://cs.armstrong.edu/liang/data/Salary.txt. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary (see Programming Exercise 12.24). 
 * Write a program to display the total salary for assistant professors, associate professors, full professors, and all faculty, respectively, 
 * and display the average salary for assistant professors, associate professors, full professors, and all faculty, respectively.
 * 
 * 12/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_25
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File dataFile = new File("src/Text_Files/CHP12_PE25.txt");
		if (!dataFile.exists())
		{
			System.out.print("File not found, terminating program.");
			System.exit(0);
		}
		
		parseData(dataFile);
	}
	
	public static void parseData(File dataFile) throws FileNotFoundException
	{
		try (Scanner reader = new Scanner(dataFile);)
		{
			double associateSal = 0, assistantSal = 0, fullSal = 0;
			int associateCount = 0, assistantCount = 0, fullCount = 0;
			
			while (reader.hasNext())
			{
				String[] parseInfo = reader.nextLine().split(" ");
				
				if (parseInfo[2].equals("assistant"))
				{
					assistantSal += Double.parseDouble(parseInfo[3]);
					assistantCount++;
				}
				else if (parseInfo[2].equals("associate"))
				{
					associateSal += Double.parseDouble(parseInfo[3]);
					associateCount++;
				}
				else
				{
					fullSal += Double.parseDouble(parseInfo[3]);
					fullCount++;
				}
			}
			
			System.out.printf("%s%28s%18s\n", "Title", "Total Salary", "Average Salary");
			System.out.printf("Assistant Professor %12.2f %12.2f\n", assistantSal, (assistantSal / assistantCount));
			System.out.printf("Associate Professor %12.2f %12.2f\n", associateSal, (associateSal / associateCount));
			System.out.printf("Full Professor %17.2f %13.2f", fullSal, (fullSal / fullCount));
		}
	}
}

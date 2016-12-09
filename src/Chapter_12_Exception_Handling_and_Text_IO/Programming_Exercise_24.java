package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Create large dataset
 * Create a data file with 1,000 lines. Each line in the file consists of a faculty member’s first name, last name, rank, and salary. 
 * The faculty member’s first name and last name for the ith line are FirstNamei and LastNamei. 
 * The rank is randomly generated as assistant, associate, and full. 
 * The salary is randomly generated as a number with two digits after the decimal point. 
 * The salary for an assistant professor should be in the range from 50,000 to 80,000, for associate professor from 60,000 to 110,000,
 * and for full professor from 75,000 to 130,000. Save the file in Salary.txt. 
 * Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 * 
 * 12/09/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_24
{
	public static void main(String[] args) throws IOException  
	{
		File dataFile = new File("src/Text_Files/CHP12_PE24.txt");
		if (!dataFile.exists())
		{
			System.out.println("File does not exist, generating file...");
			dataFile.createNewFile();
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter dataset size: ");
		generateDataSet(dataFile, input.nextInt());		
		
		input.close();
	}
	
	public static void generateDataSet(File dataFile, int size) throws FileNotFoundException
	{
		try (PrintWriter writer = new PrintWriter(dataFile))
		{
			for (int i = 1; i <= size; i++)
				writer.print("FirstName" + i + " LastName" + i + " " + getRankSalary() + "\n");
		}
	}
	
	public static String getRankSalary()
	{
		Random randNum = new Random();
		int position = randNum.nextInt(3);
		
		if (position == 0)
			return ("Assistant " + String.format("%10.2f", (50000 + Math.random() * 30000)));
		else if (position == 1)
			return ("Associate " + String.format("%10.2f", (60000 + Math.random() * 45000)));
		else
			return ("Full " + String.format("%10.2f", (70000 + Math.random() * 60000)));
	}
}

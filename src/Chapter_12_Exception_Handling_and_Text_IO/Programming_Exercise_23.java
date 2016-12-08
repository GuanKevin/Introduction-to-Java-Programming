package Chapter_12_Exception_Handling_and_Text_IO;

import java.net.URL;
import java.util.Scanner;

/**
 * Process scores in a text file on the Web
 * Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number of scores. 
 * Write a program that reads the scores from the file and displays their total and average. 
 * Scores are separated by blanks.
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23
{
	public static void main(String[] args) 
	{
		try 
		{
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner readUrl = new Scanner(url.openStream());
			
			int total = 0, numCount = 0;
			
			while (readUrl.hasNext())
			{
				total += readUrl.nextInt();
				numCount++;
			}
			
			readUrl.close();
			System.out.print("Total: " + total 
					+ "\nAverage: " + (total / numCount));
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}

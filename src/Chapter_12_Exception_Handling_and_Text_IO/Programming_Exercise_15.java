package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Write/read data
 * Write a program to create a file named Exercise12_15.txt if it does not exist. 
 * Write 100 integers created randomly into the file using text I/O. 
 * Integers are separated by spaces in the file. Read the data back from the file and display the data in increasing order.
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_15
{
	public static void main(String[] args) throws IOException  
	{
		File fileName = new File("src/Text_Files/CHP12_PE15.txt");
		if (!fileName.exists())
		{
			System.out.print("File does not exist, creating file...");
			fileName.createNewFile();
		}
		
		try
		{
			Random randNumbers = new Random();
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the size of the list: ");
			int size = input.nextInt();
			
			PrintWriter writer = new PrintWriter(fileName); 
			
			for (int i = 1; i <= size; i++)
				if (i % 10 == 0)
					writer.println(randNumbers.nextInt(size));
				else 
					writer.print(randNumbers.nextInt(size) + " ");
			
			writer.close();
			input.close();
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
		
		try (Scanner textReader = new Scanner(fileName);)
		{
			ArrayList<Integer> list = new ArrayList<>();
			
			while (textReader.hasNext())
				list.add(textReader.nextInt());
			
			sort(list);
			
			for (int i = 0; i < list.size(); i++)
				if ((i + 1) % 10 == 0)
					System.out.println(list.get(i) + " ");
				else 
					System.out.print(list.get(i) + " ");
		}
		catch (Exception ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	
	public static void sort(ArrayList<Integer> list)
	{
		for (int i = 0; i < list.size() - 1; i++)
		{
			int min = i;
			
			for (int j = i + 1; j < list.size(); j++)
				if (list.get(min) > list.get(j))
					min = j;
			
			if (min != i)
				swap(list, i, min);
		}
	}
	
	public static void swap(ArrayList<Integer> list, int curIndex, int minIndex)
	{
		int tempNum = list.get(curIndex);
		list.set(curIndex, list.get(minIndex));
		list.set(minIndex, tempNum);
	}
}

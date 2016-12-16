package Chapter_17_Binary_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Store objects and arrays in a file
 * Write a program that stores an array of the five int values 1, 2, 3, 4, and 5, a Date object for the current time, 
 * and the double value 5.5 into the file named Exercise17_05.dat.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) throws FileNotFoundException, IOException   
	{
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/Text_Files/Chapter_17/CHP17_PE05.dat"));)
		{
			int[] list = new int[]{1, 2, 3, 4, 5};
			output.writeObject(list);
			output.writeObject(new Date());
			output.writeObject(5.5d);
		}
	}
}

package Chapter_17_Binary_IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Update count
 * Suppose you wish to track how many times a program has been executed. 
 * You can store an int to count the file. 
 * Increase the count by 1 each time this program is executed. 
 * Let the program be Exercise17_08 and store the count in Exercise17_08.dat.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_08
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		try (RandomAccessFile raf = new RandomAccessFile("src/Text_Files/Chapter_17/CHP17_PE08.dat", "rw");)
		{
			int count = 0;
			
			if (raf.length() > 0)
				count = raf.readInt();
			
			raf.seek(0);
			raf.writeInt(++count);
			System.out.println("Current file execution count is " + count);
		}
	}
}

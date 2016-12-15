package Chapter_17_Binary_IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Sum all the integers in a binary data file
 * Suppose a binary data file named Exercise17_03.dat has been created and its data are created using writeInt(int) in DataOutputStream. 
 * The file contains an unspecified number of integers. 
 * Write a program to find the sum of the integers.
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03
{
	public static void main(String[] args) 
	{
		File binDataFile = new File("src/Text_Files/Chapter_17/CHP17_PE03.dat");
		if (!binDataFile.exists())
		{
			System.out.println("File doesn't exist, generating binary data file...");
			try 
			{
				binDataFile.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream(binDataFile, true));) 
		{
			Random rand = new Random();
			System.out.println("Generating numbers to file...");
			for (int i = 1; i <= 10; i++)
			{
				output.writeInt(rand.nextInt(10) + 48);
			}
	    } 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(binDataFile)))) 
		{

            int sum = 0;
            int count = input.available() / 4;
            while (count > 0) 
            {
            	int value = input.readInt();
            	System.out.println((char) value);
                sum += Integer.parseInt(Character.valueOf((char) value) + "");
                count--;
            }
            System.out.println("The sum is " + sum);
        }
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}

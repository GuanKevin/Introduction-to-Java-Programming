package Chapter_17_Binary_IO;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Convert a text file into UTF
 * Write a program that reads lines of characters from a text file and writes each line as a UTF-8 string into a binary file. 
 * Display the sizes of the text file and the binary file. 
 * Use the following command to run the program:
 * java Exercise17_04 Welcome.java Welcome.utf
 * 
 * 12/15/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_04
{
	public static void main(String[] args) throws FileNotFoundException, IOException  
	{
		try (BufferedReader input = new BufferedReader(new FileReader(args[0])); DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1]));)
		{
			String line;
			
			while ((line = input.readLine()) != null)
			{
				output.writeUTF(line);
			}
		}
		
		try (InputStream input = new FileInputStream(args[0]);)
		{
			System.out.println(args[0] + "'s size is " + input.available() + " bytes");
			
			try (InputStream input2 = new FileInputStream(args[1]);)
			{
				System.out.println(args[1] + "'s size is " + input2.available() + " bytes");
			}
		}
	}
}

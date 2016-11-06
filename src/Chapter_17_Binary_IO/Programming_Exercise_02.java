package Chapter_17_Binary_IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Create a binary data file
 * Write a program to create a file named Exercise17_02.dat if it does not exist. 
 * Append new data to it if it already exists. 
 * Write 100 integers created randomly into the file using binary I/O.
 * 
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		File file = new File("Excercise17_02.dat");
		try{
			PrintWriter input = new PrintWriter(file);
			Random rand = new Random();
			for(int i = 0; i < 100; i++){
				input.print(rand.nextInt(2));
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

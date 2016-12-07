package Chapter_12_Exception_Handling_and_Text_IO;

import java.util.Random;
import java.util.Scanner;

/**
 * ArrayIndexOutOfBoundsException
 * Write a program that meets the following requirements: 
 * Creates an array with 100 randomly chosen integers. 
 * Prompts the user to enter the index of the array, then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds.
 * 
 * 12/06/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_03
{
	public static void main(String[] args) 
	{
		int[] list = generateList(100);
		
		System.out.print("Enter an index: ");
		
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.print("The number is: " + list[input.nextInt()]);
			
			input.close();
		}
		catch (Exception e)
		{
			//e.printStackTrace();
			System.out.print("Out of Bounds.");
		}
	}
	
	public static int[] generateList(int size)
	{
		Random randomNumber = new Random();
		int[] tempList = new int[size];
		
		for (int i = 0; i < size; i++)
			tempList[i] = randomNumber.nextInt(1000);
		
		return tempList;
	}
}

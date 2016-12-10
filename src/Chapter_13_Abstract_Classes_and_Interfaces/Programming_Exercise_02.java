package Chapter_13_Abstract_Classes_and_Interfaces;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Shuffle ArrayList
 * Write the following method that shuffles an ArrayList of numbers: 
 * public static void shuffle(ArrayList<Number> list)
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_02
{
	public static void main(String[] args) 
	{
		ArrayList<Number> list = new ArrayList<>();
		
		System.out.print("Enter size of list: ");
		Scanner input = new Scanner(System.in);
		list = generateNumbers(input.nextInt());
		
		System.out.println(list.toString());
		shuffle(list);
		System.out.println(list.toString());
		
		input.close();
	}
	
	public static ArrayList<Number> generateNumbers(int size)
	{
		ArrayList<Number> tempList = new ArrayList<>();
		
		for (int i = 0; i < size; i++)
			tempList.add(i);
		
		return tempList;
	}
	
	public static void shuffle(ArrayList<Number> list)
	{
		Random randNum = new Random();
		
		for (int i = 0; i < list.size(); i++)
			swap(list, i, randNum.nextInt(list.size()));
	}
	
	public static void swap(ArrayList<Number> list, int curPos, int swapPos)
	{
		Number tempNum = list.get(curPos);
		list.set(curPos, list.get(swapPos));
		list.set(swapPos, tempNum);
	}
}

package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Shuffle ArrayList
 * Write the following method that shuffles the elements in an ArrayList of integers. 
 * public static void shuffle(ArrayList<Integer> list)
 *
 * 12/05/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of list: ");
		ArrayList<Integer> list = generateList(input.nextInt());
		shuffle(list);
		System.out.println("Numbers after shuffle: " + list.toString());
		
		input.close();
	}
	
	public static void shuffle(ArrayList<Integer> list)
	{
		if (list.isEmpty())
		{
			System.out.println("List is empty!");
			return;
		}
		
		Random randNum = new Random();
		
		for (int i = 0; i < list.size(); i++)
			swap(list, i, (i + randNum.nextInt(list.size())) % list.size());
	}
	
	public static void swap(ArrayList<Integer> list, int elePosA, int elePosB)
	{
		int tempEle = list.get(elePosA);
		list.set(elePosA, list.get(elePosB));
		list.set(elePosB, tempEle);
	}
	
	public static ArrayList<Integer> generateList(int size)
	{
		Random randNum = new Random();
		ArrayList<Integer> tempList = new ArrayList<>();
		
		System.out.print("Numbers generated: ");
		for (int i = 0; i < size; i++)
		{
			int numbers = randNum.nextInt(100);
			System.out.print(numbers + " ");
			tempList.add(numbers);
		}
		System.out.println();
		
		return tempList;
	}
}

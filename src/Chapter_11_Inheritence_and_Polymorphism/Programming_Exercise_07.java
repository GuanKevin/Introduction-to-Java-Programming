package Chapter_11_Inheritence_and_Polymorphism;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Shuffle ArrayList
 * Write the following method that shuffles the elements in an ArrayList of integers. 
 * public static void shuffle(ArrayList<Integer> list)
 * Collection class --> Collection.shuffle(nameofarraylist);
 *
 * 03/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static int size;
	public static void main(String[] args) 
	{
		ArrayList<Integer> shuffleList = new ArrayList<Integer>();
		System.out.print("Enter size of the list: ");
		size = input.nextInt();
		insertRandNum(shuffleList);
		printNumbers(shuffleList);
		shuffle(shuffleList);
	}
	
	public static void printNumbers(ArrayList<Integer> shuffleList)
	{
		int counter = 0;
		
		for (int i = 0; i < size; i++)
		{
			++counter;
			if (counter % 10 == 0)
			{
				System.out.println(shuffleList.get(i) + " ");
				counter = 0;
			}
			else
			{
				System.out.print(shuffleList.get(i) + " ");
			}
		}
		System.out.println();
	}
	
	public static void insertRandNum(ArrayList<Integer> shuffleList)
	{
		for (int i = 0; i < size; i++)
		{
			shuffleList.add(i, rand.nextInt(10));
		}
	}
	
	// 3 1 5 2 4
	// arraylist.remove(4)
	public static void shuffle(ArrayList<Integer> list)
	{
		int indexA = rand.nextInt(size);
		int indexB = rand.nextInt(size);
		int temp;
		
		while (indexA == indexB)
		{
			indexB = rand.nextInt(size);
		}
				
		System.out.print("How many times do you want to shuffle the deck: ");
		int times = input.nextInt();
		
		for (int i = 0; i < times; i++)
		{
			temp = list.get(indexA);
			list.set(indexA, list.get(indexB));
			list.set(indexB, temp);
			
			indexA = rand.nextInt(size );
			indexB = rand.nextInt(size);
			
			while (indexA == indexB)
			{
				indexB = rand.nextInt(size);
			}
		}
		
		printNumbers(list);
	}
}

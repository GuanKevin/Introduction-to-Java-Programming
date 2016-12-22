package Chapter_19_Generics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Distinct elements in ArrayList
 * Write the following method that returns a new ArrayList. 
 * The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter values: ");
		Scanner input = new Scanner(System.in);
		ArrayList<String>  myList = new ArrayList<>();
		String s = input.next();
		
		while (!s.equals("X"))
		{
			myList.add(s);
			s = input.next();
		}
		
		myList = ArrayListDistinctElements.removeDuplicates(myList);
		
		for (String s2 : myList)
		{
			System.out.print(s2);
		}
		
		input.close();
	}
}

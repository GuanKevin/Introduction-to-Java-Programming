package Chapter_21_Sets_and_Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Count the occurrences of numbers entered
 * Write a program that reads an unspecified number of integers and finds the one that has the most occurrences. 
 * The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 
 * 3 3 2 0, the number 3 occurred most often. If not one but several numbers have the most occurrences, 
 * all of them should be reported. For example, since 9 and 3 appear 
 * twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
 * 
 * 01/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		
		int key = input.nextInt();
		Map<Integer, Integer> map = new HashMap<>();		//Map<key, value> 
		while (key != 0)
		{
			if (!map.containsKey(key))
				map.put(key, 1);
			else
			{
				int value = map.get(key);
				map.put(key, ++value);
			}
			key = input.nextInt();
		}
		
		int max = Collections.max(map.values());
		Set<Integer> keys = map.keySet();
		Iterator<Integer> iterator = keys.iterator();
		
		while (iterator.hasNext())
		{
			int k = iterator.next();
			int v = map.get(k);
			
			if (v == max)
				System.out.println("Number " + k + " occurred most.");
		}
		
		input.close();
	}
}
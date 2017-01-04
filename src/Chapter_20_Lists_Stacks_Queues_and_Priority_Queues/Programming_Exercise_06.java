package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;
	
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Use iterators on linked lists
 * Write a test program that stores 5 million integers in a linked list 
 * and test the time to traverse the list using an iterator vs. using the get(index) method.
 * 
 * 01/03/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> linkedList = new LinkedList<>();
		final int size = 50000;
		
		for (int i = 0; i < size; i++)
			linkedList.add(i);
		Iterator<Integer> iterator = linkedList.iterator();
		
		Long timer = System.currentTimeMillis();
		while (iterator.hasNext())
			iterator.next();
		System.out.println("Iterator took " + (System.currentTimeMillis() - timer) + " milliseconds.");
		
		timer = System.currentTimeMillis();
		for (int i = 0; i < linkedList.size(); i++)
			linkedList.get(i);
		System.out.println("Get method took " + (System.currentTimeMillis() - timer) + " milliseconds.");
	}
}

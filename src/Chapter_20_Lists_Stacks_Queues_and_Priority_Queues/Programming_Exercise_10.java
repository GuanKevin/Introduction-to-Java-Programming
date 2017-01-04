package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Perform set operations on priority queues
 * Create two priority queues, 
 * {"George", "Jim", "John", "Blake", "Kevin", "Michael"} 
 * and 
 * {"George", "Katie", "Kevin", "Michelle", "Ryan"}, 
 * and find their union, difference, and intersection.
 * 
 * 01/04/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));
		
		queue1.addAll(queue2);
		System.out.println("The union of queue1 and queue2 is: " + queue1.toString());
		
		queue1 = new PriorityQueue<>(Arrays.asList(new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));	
		queue1.removeAll(queue2);
		System.out.println("The difference of queue1 and queue2 is: " + queue1.toString());
		
		queue1 = new PriorityQueue<>(Arrays.asList(new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		queue1.retainAll(queue2);
		System.out.println("The intersection of queue1 and queue2 is: " + queue1.toString());
	}
}

package Chapter_24_Implementing_Lists_Stacks_Queues_and_Priority_Queues;

import utilities.MyArrayList;

/**
 * Add set operations in MyList
 * Define the following methods in MyList and implement them in MyAbstractList:
 * public boolean addAll(MyList<E> otherList);
 * public boolean removeAll(MyList<E> otherList);
 * public boolean retainAll(MyList<E> otherList);
 * Write a test program that creates two MyArrayLists, list1 and list2, with the initial values 
 * {"Tom", "George", "Peter", "Jean", "Jane"} and {"Tom", "George", "Michael", "Michelle", "Daniel"}, 
 * then perform the following operations:
 * Invokes list1.addAll(list2), and displays list1 and list2. 
 * Recreates list1 and list2 with the same initial values, invokes list1.removeAll(list2), and displays list1 and list2. 
 * Recreates list1 and list2 with the same initial values, invokes list1.retainAll(list2), and displays list1 and list2.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		String[] strArr1 = {"Tom", "George", "Peter", "Jean", "Jane"};
		String[] strArr2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};
		MyArrayList<String> list1 = new MyArrayList<>(strArr1);
		MyArrayList<String> list2 = new MyArrayList<>(strArr2);
		
		list1.addAll(list2);
		System.out.println(list1.toString());
		System.out.println(list2.toString());
	}
}

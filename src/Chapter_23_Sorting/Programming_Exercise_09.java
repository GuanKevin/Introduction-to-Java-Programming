package Chapter_23_Sorting;

import java.util.Comparator;

import utilities.Circle;
import utilities.GeometricObjectComparator;
import utilities.HeapComparator;

/**
 * Generic Heap using Comparator
 * Revise Heap in Listing 23.9, using a generic parameter and a Comparator for comparing objects. 
 * Define a new constructor with a Comparator as its argument as follows: 
 * Heap(Comparator<? super E> comparator)
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	@SuppressWarnings("unchecked")
	public static <E extends Comparable<E>> void main(String[] args) 
	{
		Circle[] circle = {new Circle(), new Circle(5), new Circle(3.5), new Circle(5)};
		HeapComparator<E> hc = new HeapComparator<E>((Comparator<? super E>) new GeometricObjectComparator(), (E[]) circle);
		System.out.println(hc.toString());
	}
}

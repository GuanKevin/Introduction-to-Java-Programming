package Chapter_21_Sets_and_Maps;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Perform Set Operations on Hash Sets
 * Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} 
 * and {"George", "Katie", "Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection. 
 * (You can clone the sets to preserve the original sets from being changed by these set methods.)
 * 
 * 01/06/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_01 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> set1 = new LinkedHashSet<String>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		LinkedHashSet<String> set2 = new LinkedHashSet<String>(Arrays.asList(new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));
		
		set1.addAll(set2);
		System.out.println("The union of set1 and set2 is: " + set1);
		
		set1 = new LinkedHashSet<String>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		set1.removeAll(set2);
		System.out.println("The difference of set1 and set2 is: " + set1);
		
		set1 = new LinkedHashSet<String>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		set1.retainAll(set2);
		System.out.println("The intersection of set1 and set2 is: " + set1);
	}
}

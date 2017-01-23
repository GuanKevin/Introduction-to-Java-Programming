package Chapter_21_Sets_and_Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import utilities.WordOccurrence;

/**
 * Revise Listing 21.9, CountOccurrenceOfWords.java
 * Rewrite Listing 21.9 to display the words in ascending order of occurrence counts.
 * (Hint: Create a class named WordOccurrence that implements the Comparable 
 * interface. The class contains two fields, word and count. The compareTo 
 * method compares the counts. For each pair in the hash set in Listing 21.9, create 
 * an instance of WordOccurrence and store it in an array list. Sort the array list 
 * using the Collections.sort method.)
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_07 
{
	public static void main(String[] args) 
	{
		String text = "Rewrite Listing 21.9 to display the words in ascending order of occurrence counts."
				+ "(Hint: Create a class named WordOccurrence that implements the Comparable interface. "
				+ "The class contains two fields, word and count. The compareTo  method compares the counts. "
				+ "For each pair in the hash set in Listing 21.9, create an instance of WordOccurrence and "
				+ "store it in an array list. Sort the array list using the Collections.sort method.)";
		Map<String, Integer> map = new HashMap<>();
		String[] words = text.split("[ \n\t\r.,;:!?()]");
		
		for (String word: words)
		{
			String key = word.toLowerCase();
			if (key.length() > 0)
			{
				if (!map.containsKey(key))
					map.put(key, 1);
				else
				{
					int value = map.get(key);
					map.put(key, ++value);
				}
			}
		}
		ArrayList<WordOccurrence> list = new ArrayList<>();
		
		for (Map.Entry<String, Integer> entry: map.entrySet())
			list.add(new WordOccurrence(entry.getKey(), entry.getValue()));
		
		Collections.sort(list);
		
		for (WordOccurrence wordList: list)
			System.out.println(wordList.toString());

	}
}

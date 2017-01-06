package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Count the occurrences of each keyword
 * Rewrite Listing 21.7 CountKeywords.java to read in a Java source code 
 * file and count the occurrence of each keyword 
 * in the file, but don’t count the keyword if it is in a comment or in a string literal.
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_10 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 2)
		{
			System.out.println("Missing CountKeyword text file and test file.. terminating program..");
			System.exit(0);
		}
		
		Set<String> set = new HashSet<>();
		TreeMap<String, Integer> map = new TreeMap<>();
		
		try (Scanner input = new Scanner(new File(args[0]));)
		{
			while (input.hasNext())
				set.add(input.next());
		}
		try (Scanner input = new Scanner(new File(args[1]));)
		{
			while (input.hasNext())
			{
				String[] tokens = input.nextLine().split("[ \\[,()\\]]");
				
				for (String token: tokens)
				{
					if (set.contains(token))
						if (map.get(token) == null)
							map.put(token, 1);
						else
						{
							int value = map.get(token);
							map.put(token, ++value);
						}
				}
			}
		}
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Map.Entry<String, Integer> entry: entrySet)
			System.out.println(entry.getValue() + "\t" + entry.getKey());
	}
}

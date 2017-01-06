package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Count the occurrences of words in a text file
 * Rewrite Listing 21.9 to read the text from a text file. The text file is passed as a command-line argument. 
 * Words are delimited by whitespace characters, punctuation marks (,;.:?), quotation 
 * marks ('"), and parentheses. Count words in case-insensitive fashion (e.g., consider 
 * Good and good to be the same word). The words must start with a letter. 
 * Display the output in alphabetical order of words, with each word preceded by 
 * its occurrence count.
 * 
 * 01/07/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 1) 
		{
			System.out.println("Missing text file arguments.. ending program..");
			System.exit(1);
	    }
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		try (Scanner input = new Scanner(new File(args[0]));)
		{
			while (input.hasNext())
			{
				String line = input.nextLine(); 
				String[] words = line.split("[ @!~{}\\[\\]$#^&*\n\t\r.,;?'\")(]");
			
				for (int i = 0; i < words.length; i++)
				{
					if (words[i].trim().length() > 0 && words[i].trim().matches("[A-Z|a-z]+"))
					{
						String key = words[i].toLowerCase(); 
						
						if (treeMap.get(key) != null)
						{
							int value = treeMap.get(key);
							treeMap.put(key, ++value);
						}
						else
							treeMap.put(key, 1);
					}
				}
			}
		}
		
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		
	    for (Map.Entry<String, Integer> entry: entrySet)
	    	System.out.println(entry.getKey() + " " + entry.getValue());
	}
}

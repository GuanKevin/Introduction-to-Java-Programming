package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Guess the capitals using maps
 * Rewrite Programming Exercise 8.37 to store 
 * pairs of each state and its capital in a map. Your program should prompt the user 
 * to enter a state and should display the capital for the state.
 * 
 * 01/07/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) throws FileNotFoundException   
	{
		if (args.length != 1)
		{
			System.out.print("Missing file path.. terminating program..");
			System.exit(0);
		}
		
		Map<String, String> map = new HashMap<>();
		try (Scanner input = new Scanner(new File(args[0]));)
		{
			while (input.hasNext())
			{
				String line = input.nextLine().toLowerCase();
				map.put(line.substring(0, line.indexOf(',')), line.substring(line.indexOf(',') + 1, line.length()).trim());	
			}
		}
		
		System.out.print(map.get("washington"));
	}
}

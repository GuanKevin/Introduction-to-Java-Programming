package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Guessing the capitals
 * Rewrite Programming Exercise 8.37 to store the pairs of states and capitals so that the questions are displayed randomly.
 * 
 * 01/03/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_03 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 1)
		{
			System.out.print("Args not found.. ending program..");
			System.exit(0);
		}
		
		File textFile = new File(args[0]);
		if (!textFile.exists())
		{
			System.out.print("Text file does not exist.. ending program..");
			System.exit(1);
		}
		
		List<String> stateList = new ArrayList<>();
		List<String> capitalList = new ArrayList<>();
		try (Scanner input = new Scanner(textFile))
		{
			while (input.hasNext())
			{
				String line = input.nextLine();
				stateList.add(line.substring(0, line.indexOf(',')));
				capitalList.add(line.substring(line.indexOf(',') + 1, line.length()).trim());
			}
		}
		
		System.out.println("List of capitals:");
		for (int i = 0; i < capitalList.size(); i++)
			if ((i + 1) % 10 == 0)
				System.out.printf("%-18s\n", capitalList.get(i));
			else
				System.out.printf("%-18s ", capitalList.get(i));
		guessCapital(stateList, capitalList);
	}
	
	public static void guessCapital(List<String> stateList, List<String> capitalList)
	{
		Random randPick = new Random();
		Scanner input = new Scanner(System.in);
		int missCounter = 0, guessCounter = 0;
		
		while (missCounter != 3)
		{
			int pick = randPick.nextInt(stateList.size());
			System.out.print("What is the capital of " + stateList.get(pick) + ": ");
			String guess = input.next().toLowerCase();
			
			if (guess.equals(capitalList.get(pick).toLowerCase()))
			{
				stateList.remove(pick);
				capitalList.remove(pick);
			}
			else
			{
				System.out.println("The capital of " + stateList.get(pick) + " is " + capitalList.get(pick) + ".");
				missCounter++;
			}
			guessCounter++;
		}
		System.out.print("You got " + (guessCounter - missCounter) + "/" + guessCounter + " correct.");
		
		input.close();
	}
}

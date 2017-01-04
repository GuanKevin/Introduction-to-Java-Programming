package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * Match grouping symbols
 * A Java program contains various pairs of grouping symbols, such as:
 * Parentheses: ( and ) 
 * Braces: { and }
 * Brackets: [ and ]
 * Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal.
 * Write a program to check whether a Java source-code file has correct pairs of grouping symbols. 
 * Pass the source-code file name as a command-line argument.
 * 
 * 01/04/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_11 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		if (args.length != 1)
		{
			System.out.print("Invalid amount of arguments.. terminating program..");
			System.exit(0);
		}
		
		File javaFile = new File(args[0]);
		if (!javaFile.exists())
		{
			System.out.print("File not found.. terminating program..");
			System.exit(1);
		}
		
		checkFile(javaFile);
	}
	
	public static void checkFile(File javaFile) throws FileNotFoundException
	{
		ArrayList<Character> symbolsOpen = new ArrayList<>();
		symbolsOpen.add('(');
		symbolsOpen.add('{');
		symbolsOpen.add('[');
		
		ArrayList<Character> symbolsClose = new ArrayList<>();
		symbolsClose.add(')');
		symbolsClose.add('}');
		symbolsClose.add(']');
		
		Deque<Character> stackOpen = new ArrayDeque<>();
		
		try (Scanner input = new Scanner(javaFile))
		{
			while (input.hasNext())
			{
				String line = input.nextLine();
				
				for (int i = 0; i < line.length(); i++)
				{
					if (symbolsOpen.contains(line.charAt(i)))
					{
						System.out.println("Push: " + line.charAt(i));
						stackOpen.push(line.charAt(i));
					}
					else if (symbolsClose.contains(line.charAt(i)))
					{
						if (line.charAt(i) == ')' && stackOpen.peek() == '(')
							System.out.println("Pop: " + stackOpen.pop());
						else if (line.charAt(i) == '}' && stackOpen.peek() == '{')
							System.out.println("Pop: " + stackOpen.pop());
						else
							System.out.println("Pop: " + stackOpen.pop());
					}
				}
			}
			if (stackOpen.isEmpty())
				System.out.print("Stack is empty: " + stackOpen.toString());
		}
	}
}

package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.io.File;
import java.util.LinkedList;

/**
 * Directory size
 * Listing 20.7, DirectorySize.java, gives a recursive method for finding a directory size. 
 * Rewrite this method without using recursion. 
 * Your program should use a queue to store the subdirectories under a directory. 
 * The algorithm can be described as follows
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_18 
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.print("Invalid arguments.. terminating program..");
			System.exit(0);
		}
		
		String dir = args[0];
		System.out.print("The size of " + dir + " is " + getSize(new File(dir)) + " bytes.");
	}
	
	public static long getSize(File file)
	{
		long size = 0;
		
		LinkedList<File> queue = new LinkedList<>();
		queue.offer(file);
		
		while (queue.size() > 0)
		{
			File t = queue.remove();
			if (t.isDirectory())
			{
				File[] files = t.listFiles();
				for (File f: files)
					queue.offer(f);
			}
			else
				size += t.length();
		}
		
		return size;
	}
}

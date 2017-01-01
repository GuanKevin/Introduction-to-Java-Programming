package Chapter_18_Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Nonrecursive directory size
 * Rewrite Listing 18.7, DirectorySize.java, without using recursion.
 * 
 * 
 * @author kevgu
 *
 */

public class Programming_Exercise_28
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a directory: ");
		String path = input.next();
		
		try 
		{
			System.out.println("The size of \"" + path + "\" is " + getDirectorySize(new File(path), 30));
		}
		catch (Exception ex)
		{
			System.out.print(ex);
		}
		
		input.close();
	}
	
	public static long getDirectorySize(File file, int depth) throws FileNotFoundException
	{
		if (!file.exists())
			throw new FileNotFoundException(file + " not found");
		long totalSize = 0;
		 
		if (file.isFile())
			return file.length();
		else
		{
			int i = 0;
			int index = 0;
			int[] indices = new int[depth];
			boolean switcher = false;
			File[] files = file.listFiles();
			
			while (!switcher) 
			{
				for (i = indices[index]; i < files.length; i++) 
				{
					if (files[i].isFile()) 
					{
						totalSize += files[i].length();
						indices[index]++;
					}
					else 
					{
						File[] filesAux = files[i].listFiles();
						if (filesAux.length != 0) 
						{
							indices[index]++;
							index++;
							files = filesAux;
							indices[index] = 0;
							i = -1;
						}
						else 
							indices[index]++;
					}
		        }
		        if (index == 0) 
		        	switcher = true;
		        else 
		        {
        			index--;
        			files = new File(new File(files[i - 1].getParent()).getParent()).listFiles();
		        }
			}
		}
		
		return totalSize;
	}
}

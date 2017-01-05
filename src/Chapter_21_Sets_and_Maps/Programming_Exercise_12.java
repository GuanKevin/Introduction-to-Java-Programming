package Chapter_21_Sets_and_Maps;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Name for both genders
 * Write a program that prompts the user to enter one of 
 * the filenames described in Programming Exercise 12.31 and displays the names 
 * that are used for both genders in the file. Use sets to store names and find common 
 * names in two sets.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_12 
{
	 public static void main(String[] args) throws IOException 
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a file name for baby name ranking: ");
		    
		 File file = new File(input.nextLine());
		 if (!file.exists()) 
		 {
			 System.out.println("File " + file + " does not exist");
			 System.exit(1);
		 }
		 input.close();   
		 input = new Scanner(file);
		    
		 Set<String> boyNames = new HashSet<String>();
		 Set<String> girlNames = new HashSet<String>();
		    
		 while (input.hasNext()) 
		 {
			 input.nextInt(); 
			 boyNames.add(input.next());
			 input.nextInt(); 
			 girlNames.add(input.next());
			 input.nextInt(); 
		 }
		 
		 boyNames.retainAll(girlNames);
		 System.out.println(boyNames.size() + " names are used for both boys and girls ");
		 System.out.println("They are ");
		    
		 for (String name: boyNames) 
			 System.out.print(name + " ");
		 input.close();
 	}
}

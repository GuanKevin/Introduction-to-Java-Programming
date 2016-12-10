package Chapter_12_Exception_Handling_and_Text_IO;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Search Web
 * Modify Listing 12.18 WebCrawler.java to search for the word Computer Programming starting from the URL http://cs.armstrong.edu/liang.
 * Your program terminates once the word is found. Display the URL for the page that contains the word.
 * 
 * 12/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_33
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url); // Traverse the Web from the a starting url
		
		input.close();
	}
		
	 public static void crawler(String startingURL) 
	 {
		 ArrayList<String> listOfPendingURLs = new ArrayList<>();
		 ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		 listOfPendingURLs.add(startingURL);
		 while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) 
		 {
			 String urlString = listOfPendingURLs.remove(0);
			 if (!listOfTraversedURLs.contains(urlString)) 
			 {
				 listOfTraversedURLs.add(urlString);
				 System.out.println("Craw " + urlString);
		
				 for (String s: getSubURLs(urlString)) 
					 if (!listOfTraversedURLs.contains(s))
						 listOfPendingURLs.add(s);
			 }
		 }
	 }
	 
	 public static ArrayList<String> getSubURLs(String urlString) 
	 {
		 ArrayList<String> list = new ArrayList<>();
		
		 try 
		 {
			 URL url = new URL(urlString);
			 Scanner input = new Scanner(url.openStream());
			 int current = 0;
			 while (input.hasNext()) 
			 {
				 String line = input.nextLine();
				 String[] splitLine = line.split(" ");
				 
				 for (int i = 0; i < splitLine.length; i++)
					 if (splitLine[i].equalsIgnoreCase("Computer Science"))
					 {
						System.out.print("Found computer at: " + url.toString() + " " + Arrays.toString(splitLine));
						System.exit(0);
					 }
				 
				 current = line.indexOf("http:", current);
			 
				 while (current > 0) 
				 {			 
					 int endIndex = line.indexOf("\"", current);
			 
					 if (endIndex > 0) 
					 { 		
						 list.add(line.substring(current, endIndex));
						 current = line.indexOf("http:", endIndex);
					 }
					 else current = -1;
				 }
			 }
			 input.close();
		 }
		 catch (Exception ex) 
		 {
			 System.out.println("Error: " + ex.getMessage());
		 }
		 
		 return list;
	 }
}

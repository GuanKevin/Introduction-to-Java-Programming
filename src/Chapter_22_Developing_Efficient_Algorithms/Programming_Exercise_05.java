package Chapter_22_Developing_Efficient_Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Same-number subsequence
 * Write an O(n) program that prompts the user to enter a 
 * sequence of integers ending with 0 and finds the longest subsequence 
 * with the same number.
 * 
 * 01/
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		List<Integer> sequence = getSequence();
		System.out.println(sequence.toString());
		
		System.out.print("The longest sequence is: ");
		getSubsequence(sequence);
	}
	
	public static void getSubsequence(List<Integer> sequence)
	{
		  int index = 0, seqIndex = 0;              
		  int num, seqNum = sequence.get(0);   
		  int count = 0, seqCount = 1;
		  
		  for (int i = 1; i < sequence.size(); i++) 
		  {
			  num = sequence.get(i - 1);
			  if (sequence.get(i).equals(num)) 
			  {
		            if (count == 1) 
		            	index = i - 1;
		            
		            count++;
		            if (count > seqCount) 
		            {
		            	seqCount = count;
		            	seqNum = num;
		                seqIndex = index;
		            }
		        } 
			  else 
		            count = 1;
		  }
		
		System.out.println("Index: " + seqIndex + " Count: " + seqCount + " Num: " + seqNum);
	}
	
	public static ArrayList<Integer> getSequence()
	{
		ArrayList<Integer> sequence = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter sequence of numbers: ");
		int number = input.nextInt();
		
		while (number != 0)
		{
			sequence.add(number);
			number = input.nextInt();
		}
		
		input.close();
		return sequence;
	}
}

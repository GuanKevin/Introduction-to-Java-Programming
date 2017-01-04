package Chapter_20_Lists_Stacks_Queues_and_Priority_Queues;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Game: lottery
 * Revise Programming Exercise 3.15 to add an additional $2,000 award if two digits from the user 
 * input are in the lottery number. (Hint: Sort the three digits in the lottery number and three 
 * digits in the user input into two lists, and use the Collection’s containsAll method to check 
 * whether the two digits in the user input are in the lottery number.)
 * 
 * 01/03/2017
 * @author kevgu
 *
 */

public class Programming_Exercise_08 
{
	public static void main(String[] args) 
	{
		String[] lottoNum = ("123").split("");
		List<String> lottoList = Arrays.asList(lottoNum);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your lotto number: ");
		String[] digits = input.next().split("");
		List<String> guessList = Arrays.asList(digits);
		
		checkLottery(lottoList, guessList);
		
		input.close();
	}
	
	public static void checkLottery(List<String> lottoList, List<String> guessList)
	{
		if (lottoList.equals(guessList))
			System.out.print("Exact match, you win $10,000!");
		else if (lottoList.containsAll(guessList))
			System.out.print("Match all digits, you win $3,000!");
		else if (lottoList.containsAll(guessList.subList(0, 2)) || lottoList.containsAll(guessList.subList(1, 3)) || 
				(lottoList.containsAll(guessList.subList(0, 1)) && (lottoList.containsAll(guessList.subList(2, 3)))))
			System.out.print("Matched two digits, you win $2,000");
		else if (lottoList.contains(guessList.get(0)) || lottoList.contains(guessList.get(1)) || lottoList.contains(guessList.get(2)))
			System.out.print("Matched one, you win $1,000");
		else
			System.out.print("No match.");
	}
}

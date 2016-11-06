package Chapter_08_Multidimensional_Arrays;
import java.util.Scanner;

/**
 * Guess the capitals
 * Write a program that repeatedly prompts the user to enter a capital for a state. 
 * Upon receiving the user input, the program reports whether the answer is correct. 
 * Assume that 50 states and their capitals are stored in a two-dimensional array, as shown in Figure 8.10. 
 * The program prompts the user to answer all states’ capitals and displays the total correct count. 
 * The user’s answer is not case-sensitive.
 * 
 * 10/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_37 
{
	static String[][] stateCapitalArray = {
			{"Alabama",	"Montgomery"}, 		{"Alaska",	"Juneau"},			{"Arizona",	"Phoenix"},			{"Arkansas", "Little Rock"}, 	{"California", "Sacramento"}, 	{"Colorado", "Denver"},
			{"Connecticut", "Hartford"}, 	{"Delaware", "Dover"}, 			{"Florida", "Tallahassee"}, 	{"Georgia", "Atlanta"}, 		{"Hawaii", "Honolulu"}, 		{"Idaho", "Boise"}, 
			{"Illinois", "Springfield"},	{"Indiana", "Indianapolis"}, 	{"Iowa", "Des Moines"}, 		{"Kansas", "Topeka"}, 			{"Kentucky", "Frankfort"}, 		{"Louisiana", "Baton Rouge"}, 
			{"Maine", "Augusta"},			{"Maryland", "Annapolis"}, 		{"Massachusetts", "Boston"},	{"Michigan", "Lansing"}, 		{"Minnesota ", "St. Paul"}, 	{"Mississippi", "Jackson"}, 
			{"Missouri", "Jefferson City"},	{"Montana", "Helena"},			{"Nebraska ", "Lincoln"},		{"Nevada", "Carson City"},		{"New Hampshire", "Concord"},	{"New Jersey", "Trenton"},
			{"New Mexico", "Santa Fe"},		{"New York", "Albany"},			{"North Carolina", "Raleigh"},	{"North Dakota", "Bismarck"},	{"Ohio", "Columbus"},			{"Oklahoma", "Oklahoma City"},
			{"Oregon", "Salem"},			{"Pennsylvania", "Harrisburg"},	{"Rhode Island", "Providence"},	{"South Carolina", "Columbia"},	{"South Dakota", "Pierre"},		{"Tennessee", "Nashville"},
			{"Texas", "Austin"},			{"Utah ", "Salt Lake City"},	{"Vermont", "Montpelier"},		{"Virginia", "Richmond"},		{"Washington", "Olympia"},		{"West Virginia", "Charleston"},
			{"Wisconsin", "Madison"},		{"Wyoming", "Cheyenne"}};
	
	public static void main(String[] args) 
	{
		guessCapitals();
	}
	
	public static void guessCapitals()
	{
		Scanner input = new Scanner(System.in);
		int correctGuessCounter = 0;
		
		for (int i = 0; i < stateCapitalArray.length; i++)
		{
			System.out.print("What is the capital of " + stateCapitalArray[i][0] + "? ");
			if (input.nextLine().toLowerCase().equals(stateCapitalArray[i][1].toLowerCase()))
			{
				System.out.println("Your answer is correct.");
				correctGuessCounter++;
			}
			else
				System.out.println("The correct answer should be " + stateCapitalArray[i][1] + ".");
		}
		System.out.print("The correct count is " + correctGuessCounter);
		
		input.close();
	}
}

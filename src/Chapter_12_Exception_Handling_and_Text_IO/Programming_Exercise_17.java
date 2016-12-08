package Chapter_12_Exception_Handling_and_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Game: hangman
 * Rewrite Programming Exercise 7.35. 
 * The program reads the words stored in a text file named hangman.txt. 
 * Words are delimited by spaces.
 * 
 * 12/08/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_17
{
	public static void main(String[] args) throws FileNotFoundException
	{			
		Scanner input = new Scanner(System.in);
		boolean playGame = true;
		char replay;
		
		while (playGame)
		{
			playHangMan(args, input);
			
			System.out.print("(Y|N) Would you like to play again? > ");
			replay = input.next().charAt(0);
			
			if (Character.toUpperCase(replay) != 'Y')
				playGame = false;
		}
		
		input.close();
	}
	
	public static void playHangMan(String[] args, Scanner input) throws FileNotFoundException
	{
		ArrayList<String> wordList = getList(args);
		ArrayList<Character> guessList = new ArrayList<>();
		Random randNum = new Random();
		String word = wordList.get(randNum.nextInt(wordList.size())).toLowerCase();
		char[] asteriskWord = hideWord(word);
		boolean guessedWord = false;
		int roundCounter = 0;
		long startTime = System.currentTimeMillis();
		
		while (!guessedWord)
		{
			displayHiddenWord(asteriskWord);
			checkCharacter(word, asteriskWord, guessList, input);
			
			if (checkGameStatus(asteriskWord))
			{
				System.out.println("Congratulations! You've guessed " + word + " in " + roundCounter + " tries"
						+ "\nTime taken: " + ((System.currentTimeMillis() - startTime) / 1000) + " seconds.");
				guessedWord = true;
			}
			roundCounter++;
		}
	}
	
	public static boolean checkGameStatus(char[] asteriskWord)
	{
		for (int i = 0; i < asteriskWord.length; i++)
			if (asteriskWord[i] == '*')
				return false;
		return true;
	}
	
	public static void checkCharacter(String word, char[] asteriskWord, ArrayList<Character> guessList, Scanner input)
	{
		char guess = input.next().charAt(0);
		boolean repeatGuess = true;
		
		if (guess == '0')
		{
			System.out.println("Terminating game.");
			System.exit(3);
		}
		
		while (repeatGuess)
		{
			if (!guessList.contains(guess))
			{
				guessList.add(guess);
				repeatGuess = false;
			}
			else
			{
				System.out.print("You've already made that guess: " + 
									guessList.toString() +
									"\nTry another > ");
				guess = input.next().charAt(0);
			}
			
			for (int i = 0; i < word.length(); i++)
				if (word.charAt(i) == guess)
					asteriskWord[i] = guess;
		}
	}
	
	public static void displayHiddenWord(char[] asteriskWord)
	{
		System.out.print("Guess a character: ");
		
		for (int i = 0; i < asteriskWord.length; i++)
			System.out.print(asteriskWord[i]);
		System.out.print(" > ");
	}
	
	public static char[] hideWord(String word)
	{
		char[] tempAsteriskWord = new char[word.length()];
		
		for (int i = 0; i < tempAsteriskWord.length; i++)
			tempAsteriskWord[i] = '*';
		
		return tempAsteriskWord;
	}
	
	public static ArrayList<String> getList(String[] args) throws FileNotFoundException
	{
		if (args.length != 1)
		{
			System.out.print("Missing arguments.");
			System.exit(0);
		}
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists())
		{
			System.out.print("Missing text file.");
			System.exit(1);
		}
		
		ArrayList<String> tempWordList = new ArrayList<>();
		try (Scanner input = new Scanner(sourceFile))
		{
			while (input.hasNext())
				tempWordList.add(input.next());
		}
		
		return tempWordList;
	}
}









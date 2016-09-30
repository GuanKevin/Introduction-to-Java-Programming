package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Game: hangman
 * Write a hangman game that randomly generates a word and prompts the user to guess one letter at a time, as shown in the sample run. 
 * Each letter in the word is displayed as an asterisk. 
 * When the user makes a correct guess, the actual letter is then displayed. 
 * When the user finishes a word, display the number of misses and ask the user whether to continue to play with another word.
 * 
 * 09/27/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_35 
{	
	static String[] wordListArray = {"aftershock", "anonymous", "molecular", "carcinogenic", "executioner", "discipline", "corruption", "volcanic", "futureless", "baboon"};
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		char[] chosenWordArray = chooseWord().toCharArray();
		hangManGame(chosenWordArray);
		
		input.close();
	}
	
	/**
	 * Run hangman game
	 * 
	 * @param chosenWordArray
	 */
	public static void hangManGame(char[] chosenWordArray)
	{
		char[] asteriskArray = new char[chosenWordArray.length];
		Arrays.fill(asteriskArray, '*');
		int missCounter = 0;
		boolean gameOver = false;
		
		while (!gameOver)
		{
			System.out.print("Guess a character " + String.valueOf(asteriskArray) + ": ");
			if (!guessCharacter(input.next().charAt(0), asteriskArray, chosenWordArray))
				missCounter++;
			
			if (checkGameStatus(asteriskArray))
			{
				gameOver = true;
				System.out.print("The word is " + String.valueOf(chosenWordArray) + 
						" You've missed " + missCounter + " times.");
			}
		}
		
		playAgain(chosenWordArray);
	}
	
	/**
	 * See if the user wants to play again.
	 * If the user plays again, choose a random word
	 * and run the hangManGame method
	 */
	public static void playAgain(char[] chosenWordArray)
	{
		System.out.print("Would you like to play again? (Y|N)");
		
		if (input.next().charAt(0) == 'Y')
		{
			chosenWordArray = chooseWord().toCharArray();
			hangManGame(chosenWordArray);
		}
			
	}
	
	/**
	 * Returns true if the game is over
	 * 
	 * @param asteriskArray
	 * @return
	 */
	public static boolean checkGameStatus(char[] asteriskArray)
	{
		for (int i = 0; i < asteriskArray.length; i++)
			if (asteriskArray[i] == '*')
				return false;
		return true;
	}
	
	/**
	 * Checks if user made the correct guess
	 * If the guess is correct, make changes in the asterisk array
	 * 
	 * @param guess
	 * @param asteriskArray
	 */
	public static boolean guessCharacter(char guess, char[] asteriskArray, char[] chosenWordArray)
	{
		boolean foundChar = false;
		int guessed = 0;
		
		for (int i = 0; i < chosenWordArray.length; i++)
			if (chosenWordArray[i] == guess)
			{
				if (asteriskArray[i] == guess && guessed == 0)
				{
					System.out.println("You've already guessed that character.");
					guessed++;
				}
				else
				{
					asteriskArray[i] = guess;
					foundChar = true;
				}
			}
		
		return foundChar;
	}
	
	/**
	 * Returns a string from the wordListArray
	 * 
	 * @return
	 */
	public static String chooseWord()
	{
		Random randomWord = new Random();
		
		return wordListArray[randomWord.nextInt(wordListArray.length)];
	}
}

package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Game: bean machine
 * The bean machine, also known as a quincunx or the Galton box, 
 * is a device for statistics experiments named after English scientist Sir Francis Galton. 
 * It consists of an upright board with evenly spaced nails (or pegs) in a triangular form, as shown in Figure 7.13.
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, 
 * it has a 50% chance of falling to the left or to the right. 
 * The piles of balls are accumulated in the slots at the bottom of the board. 
 * Write a program that simulates the bean machine. 
 * Your program should prompt the user to enter the number of the balls and the number of the slots in the machine. 
 * Simulate the falling of each ball by printing its path. 
 * For example, the path for the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is RLRRLRR. 
 * Display the final buildup of the balls in the slots in a histogram. 
 * (Hint: Create an array named slots. Each element in slots stores the number of balls in a slot. 
 * Each ball falls into a slot via a path. The number of Rs in a path is the position of the slot where the ball falls. 
 * For example, for the path LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball falls into slots[2].)
 * 
 * 09/21/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls and number of slots: ");
		beanMachineSimulation(input.nextInt(), input.nextInt());
		input.close();
	}
	
	/**
	 * Simulate balls falling into bean machine
	 * 
	 * @param numberBalls
	 * @param numberSlots
	 */
	public static void beanMachineSimulation(int numberBalls, int numberSlots)
	{
		char[] positionArray = new char[numberSlots - 1];
		int[] ballPosition = new int[numberSlots];
		
		for (int i = 0; i < numberBalls; i++)
		{
			dropPosition(positionArray);
			storePosition(positionArray, ballPosition);
			displayArray(positionArray);
		}
		
		System.out.println(Arrays.toString(ballPosition));
		displayBallPosition(ballPosition);
	}
	
	/**
	 * Display positions of where the balls have landed
	 * 
	 * @param ballPosition
	 */
	public static void displayBallPosition(int[] ballPosition)
	{
		int maxHB = findMaxH(ballPosition);
		System.out.println();
		
		for (int i = maxHB; i > 0; i--)
		{
			for (int j = 0; j < ballPosition.length; j++)
				if (i == ballPosition[j])
				{
					System.out.printf(" %-2d", 0);
					ballPosition[j]--;
				}
				else
					System.out.printf(" %-2s", "");
			System.out.println();
		}
	}
	
	/**
	 * Find the max horizontal balls
	 * 
	 * @param ballPosition
	 * @return
	 */
	public static int findMaxH(int[] ballPosition)
	{
		int maxHB = 0;
		
		for (int i = 0; i < ballPosition.length; i++)
			if (maxHB < ballPosition[i])
				maxHB = ballPosition[i];
		
		return maxHB;
	}
	
	/**
	 * Store the slot position of where the ball landed
	 * 
	 * @param positionArray
	 * @param ballPosition
	 */
	public static void storePosition(char[] positionArray, int[] ballPosition)
	{
		int midPosition = (positionArray.length + 1) / 2;
		
		for (int i = 0; i < positionArray.length; i++)
			if (positionArray[i] == 'L' && midPosition > 0)
				midPosition--;
			else if (midPosition < positionArray.length)
				midPosition++;
		
		ballPosition[midPosition]++;
	}
	
	/**
	 * Display each element in the array
	 * 
	 * @param positionArray
	 */
	public static void displayArray(char[] positionArray)
	{
		System.out.println(Arrays.toString(positionArray));
	}
	
	/**
	 * Fills array with character L or R
	 * 
	 * @param positionArray
	 */
	public static void dropPosition(char[] positionArray)
	{
		Random randomLR = new Random();
		
		for (int i = 0; i < positionArray.length; i++)
			if (randomLR.nextBoolean() == true)
				positionArray[i] = 'L';
			else
				positionArray[i] = 'R';
	}
}

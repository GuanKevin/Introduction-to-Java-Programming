package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;

/**
 * Game: locker puzzle
 * A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
 * As the students enter, the first student, denoted S1, opens every locker. 
 * Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. 
 * Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). 
 * Student S4 begins with locker L4 and changes every fourth locker. 
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100. 
 * After all the students have passed through the building and changed the lockers, which lockers are open? 
 * Write a program to find your answer and display all open locker numbers separated by exactly one space.
 * 
 * 09/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_23
{
	static final int SIZE = 101;
	public static void main(String[] args) 
	{
		boolean[] lockerArray = new boolean[SIZE];
		lockerPuzzle(lockerArray);
	}
	
	/**
	 * Solve the locker puzzle problem
	 * False = closed
	 * True = opened
	 * 
	 * @param lockerArray
	 */
	public static void lockerPuzzle(boolean[] lockerArray)
	{
		//As the students enter, the first student, denoted S1, opens every locker.
		Arrays.fill(lockerArray, Boolean.TRUE);
		
		for (int i = 2; i < SIZE; i++)
			for (int j = i; j < SIZE; j += i)
				if (lockerArray[j] == false)
					lockerArray[j] = true;
				else
					lockerArray[j] = false;
		displayOpenedLockers(lockerArray);
	}
	
	/**
	 * Display lockers that are opened
	 * Display number of lockers that are opened
	 * 
	 * @param lockerArray
	 */
	public static void displayOpenedLockers(boolean[] lockerArray)
	{
		int openedLockerCounter = 0;
		
		for (int i = 1; i < SIZE; i++)
			if (lockerArray[i] == true)
			{
				System.out.printf("%-3d", i);
				openedLockerCounter++;
			}
		
		System.out.print("\nThere are " + openedLockerCounter + " opened lockers.");
	}
}

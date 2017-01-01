package Chapter_18_Recursion;

import java.util.Scanner;

/**
 * Tower of Hanoi
 * Modify Listing 18.8, TowerOfHanoi.java, so that the program finds the number of moves 
 * needed to move n disks from tower A to tower B.
 * (Hint: Use a static variable and increment it every time the method is called.)
 * 
 * 12/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_18
{
	static int moves = 0;
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		
		System.out.print("Moves: " + moves);
		input.close();
	}
	
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) 
	{
		moves++;
		if (n == 1) 
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		else 
		{
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}

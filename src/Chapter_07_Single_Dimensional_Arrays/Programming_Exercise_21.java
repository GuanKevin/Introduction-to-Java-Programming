package Chapter_07_Single_Dimensional_Arrays;
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
 * 02/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_21 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		input.close();
	}
}

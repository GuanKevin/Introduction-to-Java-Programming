package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;

import Utilities.MyDate;

import java.util.ArrayList;

/**
 * Use ArrayList
 * Write a program that creates an ArrayList and adds a Loan object, 
 * a Date object, and a string 
 * and use a loop to display all the elements in the list by invoking the object’s toString() method.
 *
 * 03/20/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Object> objectList = new ArrayList<Object>();
		objectList.add(new Account());
		objectList.add(new MyDate());
		objectList.add("Hello World!");

		printString(objectList);
	}
	
	//In order to override an ArrayList, which is normally NOT possible,
	//You will need to extend the ArrayList
	public static void printString(ArrayList<Object> objectList)
	{
		for (int i = 0; i < objectList.size(); i++)
		{
			System.out.println(objectList.get(i).toString());
		}
	}
}

package Chapter_11_Inheritence_and_Polymorphism;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import utilities.Loan;

/**
 * Use ArrayList
 * Write a program that creates an ArrayList and adds a Loan object, 
 * a Date object, and a string 
 * and use a loop to display all the elements in the list by invoking the object’s toString() method.
 *
 * 12/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_06 
{
	public static void main(String[] args) 
	{
		ArrayList<Serializable> list = new ArrayList<>();
		
		list.add(new Loan());
		list.add(new Date());
		list.add("Java Chapter 11");
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());
	}
}

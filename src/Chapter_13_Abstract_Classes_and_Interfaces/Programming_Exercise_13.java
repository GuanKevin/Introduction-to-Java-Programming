package Chapter_13_Abstract_Classes_and_Interfaces;

import java.util.Scanner;

import utilities.Course;

/**
 * Enable the Course class cloneable
 * Rewrite the Course class in Listing 10.6 to add a clone method to perform a deep copy on the students field.
 * 
 * 12/11/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_13
{
	public static void main(String[] args) throws CloneNotSupportedException   
	{
		Course javaCourse = new Course();
		Scanner input = new Scanner(System.in);
		
		int studentSize = 0;
		System.out.print("Enter the number of students: ");
		boolean correctInput = false;
		
		while (!correctInput)
			try 
			{
				studentSize = input.nextInt();
				correctInput = true;
			}
			catch (Exception ex)
			{
				System.out.print("Enter a number: ");
				input.nextLine();
			}
			
		System.out.print("Enter " + studentSize + " names: ");
		for (int i = 0 ; i < studentSize; i++)
			javaCourse.addStudent(input.next());
		
		Course courseJava = (Course) javaCourse.clone(); 
		
		courseJava.dropStudent("Kevin");
		System.out.print("Course name: " + courseJava.getCourseName() + "\nStudents: " + courseJava.toString());
		
		input.close();
	}
}

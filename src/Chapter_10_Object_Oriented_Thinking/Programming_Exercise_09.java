package Chapter_10_Object_Oriented_Thinking;
import java.util.Scanner;

/**
 * The Course class
 * Revise the Course class as follows: 
 * The array size is fixed in Course class. 
 * Improve it to automatically increase the array size by creating a new larger array 
 * and copying the contents of the current array to it.
 * Implement the dropStudent method.
 * Add a new method named clear() that removes all students from the course.
 * Write a test program that creates a course, adds three students, removes one, and displays the students in the course.
 * 
 * 03/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Course course = new Course("Intro To Java");
		course.addStudent("Kevin");
		course.addStudent("Calvin");
		course.addStudent("Stephanie");
		course.addStudent("Carmie");
		String[] mystudents = course.getStudents();
		displayStudents(mystudents);
		course.clear();
		mystudents = course.getStudents();
		displayStudents(mystudents);
	}
	
	public static void displayStudents(String[] mystudents)
	{
		for (int i = 0; i < mystudents.length; i++)
		{
			System.out.print(mystudents[i] + " ");
		}
		System.out.println();
	}
}

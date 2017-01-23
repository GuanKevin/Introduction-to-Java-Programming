package Chapter_10_Object_Oriented_Thinking;
import utilities.Course;

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
 * 11/23/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_09 
{
	public static void main(String[] args) 
	{
		Course course = new Course("Java");
		
		course.addStudent("Kevin");
		course.addStudent("Adriana");
		course.addStudent("Daniel");
		course.dropStudent("Kevin");
		
		String[] students = course.getStudentsArray();
		
		for (int i = 0; i < course.getNumberOfStudents(); i++)
			System.out.print(students[i] + " ");
	}
}

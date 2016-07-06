package Chapter_11_Inheritence_and_Polymorphism;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The Course class
 * Rewrite the Course class in Listing 10.6. 
 * Use an ArrayList to replace an array to store students.  
 * You should not change the original contract of the Course class 
 * (i.e., the definition of the constructors and methods should not be changed, but the private members may be changed.)
 *
 * 03/10/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayListCourse myStudents = new ArrayListCourse("Java Intermediate 101");
		addStudents(myStudents);
		printStudent(myStudents);
		dropStudents(myStudents);
		printStudent(myStudents);
	}
	
	public static void addStudents(ArrayListCourse myStudents)
	{
		System.out.println("Add students: ");
		String student = input.nextLine();
		while (!student.equals("null"))
		{
			myStudents.addStudent(student);
			student = input.next();
		}
	}
	
	public static void printStudent(ArrayListCourse myStudents)
	{
		ArrayList<String> listOfStudents;
		listOfStudents = myStudents.getStudents();
		
		for (int i = 0; i < listOfStudents.size(); i++)
		{
			System.out.print(listOfStudents.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void dropStudents(ArrayListCourse myStudents)
	{
		System.out.println("Drop students: ");
		String student = input.nextLine();
		while (!student.equals("null"))
		{
			myStudents.dropStudent(student);
			student = input.next();
		}
	}
}

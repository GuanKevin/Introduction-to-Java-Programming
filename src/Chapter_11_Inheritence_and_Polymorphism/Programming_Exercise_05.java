package Chapter_11_Inheritence_and_Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

import utilities.Course;

/**
 * The Course class
 * Rewrite the Course class in Listing 10.6. 
 * Use an ArrayList to replace an array to store students.  
 * You should not change the original contract of the Course class 
 * (i.e., the definition of the constructors and methods should not be changed, but the private members may be changed.)
 *
 * 12/02/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_05 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int size = input.nextInt();
		
		Course javaCourse = new Course();
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter student's name: ");
			javaCourse.addStudent(input.next());
		}
		
		javaCourse.clear();
		
		ArrayList<String> stuList = new ArrayList<String>();
		stuList = javaCourse.getStudentsList();
		
		for (int i = 0; i < stuList.size(); i++)
			System.out.print(stuList.get(i) + " ");
		
		input.close();
	}
}

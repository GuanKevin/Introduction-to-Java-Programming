package Chapter_11_Inheritence_and_Polymorphism;
import java.util.ArrayList;

public class ArrayListCourse 
{
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents = 0;
	
	public ArrayListCourse(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		students.add(numberOfStudents, student);
		numberOfStudents++;
	}
	
	public ArrayList<String> getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void dropStudent(String student)
	{
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).equals(student))
			{
				students.remove(student);
				break;
			}
		}
	}
}

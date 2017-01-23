package utilities;

import java.util.ArrayList;

public class Course implements Cloneable
{
	private String courseName;
	private ArrayList<String> studentsList = new ArrayList<>();

	public Course()
	{
		this ("Java 101");
	}
	
	public Course(String courseName) 
	{
		this.courseName = courseName;
	}

	/**
	 * Add a student (element) into the next available index in the array list
	 * 
	 * @param student
	 */
	public void addStudent(String student) 
	{		
		studentsList.add(student);
	}

	public String[] getStudentsArray() 
	{
		String[] list = new String[studentsList.size()];
		list = studentsList.toArray(list);
		
		return list;
	}
	
	public ArrayList<String> getStudentsList()
	{
		return studentsList;
	}

	public int getNumberOfStudents() 
	{
		return studentsList.size();
	}

	public String getCourseName() 
	{
		return courseName;
	}

	public void dropStudent(String student) 
	{
		studentsList.remove(student);
	}
	
	public void clear()
	{
		studentsList.clear();
	}
	
	public String toString()
	{
		return studentsList.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
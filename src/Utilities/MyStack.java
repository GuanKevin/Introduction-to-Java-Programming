package Utilities;

import java.util.ArrayList;

public class MyStack extends ArrayList<String>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyStack()
	{
		
	}
	
	public boolean isEmpty()
	{
		return super.isEmpty();
	}
	
	public int getSize()
	{
		return size();
	}
	
	public String peek()
	{
		return get(getSize() - 1);
	}
	
	public String pop()
	{
		return remove(getSize() - 1);
	}
	
	public String push(String str)
	{
		add(str);
		return str;
	}
	
	public int search(String str)
	{
		return indexOf(str);
	}
	
	public String toString()
	{
		return "stack: " + toString();
	}
}

package Utilities;
import java.util.ArrayList;

public class MyStack extends ArrayList<Character>
{
	
	public MyStack()
	{
		
	}
	
	public MyStack(String string)
	{
		push(string);
	}
	
	public void push(String string)
	{
		for(int i = 0; i < string.length(); i++)
		{
			add(string.charAt(i));
		}
	}
	
	public void pop()
	{
		remove(size() - 1);
	}
	
	public char peek()
	{
		return get(size() - 1);
	}
	
	public void display()
	{
		while(!isEmpty())
		{
			System.out.print(peek());
			pop();
		}
		System.out.print("\n");
	}
}

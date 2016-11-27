package Utilities;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class myStack extends ArrayList<Object>
{
	public Object peek() 
	{
		return get(size() - 1);
	}

	public Object pop() 
	{
		Object object = get(size() - 1);
		remove(size() - 1);
		return object;
	}

	public void push(Object object) 
	{
		add(object);
	}

	@Override
	public String toString() 
	{
		return "stack: " + super.toString();
	}
}

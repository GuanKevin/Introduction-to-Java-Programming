package utilities;

import java.util.ArrayList;

public class GenericStackInheritance<E> extends ArrayList<E>
{
	private static final long serialVersionUID = 1L;
	
	public Object push(E e)
	{
		add(e);
		return e;
	}
	
	public int getSize()
	{
		return super.size();
	}
	
	public Object pop()
	{
		Object o = get(size() - 1);
		remove(size() - 1);
		return o;
	}
	
	public boolean isEmpty()
	{
		return (getSize() == 0 ? true : false);
	}
	
	public Object peek()
	{
		if (size() == 0)
			return null;
		return get(size() - 1);
	}
	
	public int search(E e)
	{
		return indexOf(e);
	}
	
	@Override
	public String toString()
	{
		return "Stack: " + super.toString();
	}
}

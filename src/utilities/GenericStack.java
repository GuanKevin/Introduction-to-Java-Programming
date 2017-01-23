package utilities;

import java.util.Arrays;

public class GenericStack<E>
{	
	private Object[] stack;
	int size = 0;
	
	public GenericStack(int size)
	{
		stack = new Object[size];
	}
	
	public int getSize()
	{
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public E peek()
	{
		if (size == 0)
			return null;
		
		return (E) stack[size - 1];
	}
	
	public void push(E e)
	{
		if (stack.length == size)
		{
			Object[] tempStack = new Object[stack.length * 2];
			System.arraycopy(stack, 0, tempStack, 0, stack.length);
			stack = tempStack;
		}
		
		stack[size++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E pop()
	{
		return (E) stack[--size];
	}
	
	public boolean isEmpty()
	{
		if (size == 0)
			return true;
		
		return false;
	}
	
	public String toString()
	{
		return "Stack: " + Arrays.toString(stack);
	}
}

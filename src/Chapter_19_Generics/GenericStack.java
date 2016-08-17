package Chapter_19_Generics;

public class GenericStack<E>
{	
	private int size;
	private E[] genericArray;
	private int index = 0;
	
	GenericStack(int size)
	{
		this.size = size;
		genericArray = (E[]) new Object[size];
	}
	
	/**
	 * Returns the amount of objects still on the stack
	 * 
	 * @return
	 */
	public int getSize()
	{
		return index;
	}
	
	/**
	 * Takes a look at the top object on the stack
	 * If stack is empty, return nothing
	 * Otherwise show top most object on the stack
	 * 
	 * @return
	 */
	public E peek()
	{
		if (index == 0)
		{
			return null;
		}
		
		return genericArray[--index];
	}

	/**
	 * Add object to top most index in the array
	 * If the array is full
	 * double the size of the array
	 * 
	 * @param o
	 */
	public void push(E o)
	{
		E[] tempArray = (E[]) new Object[size * 2];
		System.arraycopy(genericArray, 0, tempArray, 0, genericArray.length);
		genericArray = tempArray;
	}
	
	/**
	 * Remove the topmost object in the stack
	 * If the stack is empty, remove nothing
	 * 
	 * @return
	 */
	public E pop()
	{
		if (isEmpty())
		{
			return null;
		}
		
		return genericArray[--index];
	}
	
	/**
	 * Check is the stack is empty
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (getSize() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

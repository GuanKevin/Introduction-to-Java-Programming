package Chapter_10_Object_Oriented_Thinking;

public class Queue 
{
	private int[] elements;
	static final int DEFAULT_CAPACITY = 8;
	int counter = 0;
	
	public Queue()
	{
		this (DEFAULT_CAPACITY);
	}

	public Queue(int capacity)
	{
		elements = new int[capacity];
	}
	
	//The array size will be doubled once the number of the elements exceeds the size. 
	public void enqueue(int v)
	{
		elements[counter] = v;
		++counter;
		
		if (counter >= elements.length)
		{
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, getSize());
			elements = temp;
		}
	}
	
	public void printQueue()
	{
		for (int i = 0; i < counter - 1; i++)
		{
			System.out.print(elements[i] + " ");
		}
		System.out.println();
	}
	
	//After an element is removed from the beginning of the array, 
	//you need to shift all elements in the array one position the left.
	public void dequeue()
	{
		for (int i = 0; i < counter; i++)
		{
			elements[i] = elements[i+1];
		}
		System.out.print("Printing after dequeue: ");
		printQueue();
		--counter;
	}
	
	public boolean empty()
	{
		if (counter > 0)
		{
			return false;
		}
		else
			return true;
	}
	
	public int getSize()
	{
		return counter;
	}
}

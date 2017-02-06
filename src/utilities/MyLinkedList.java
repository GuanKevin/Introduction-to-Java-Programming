package utilities;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbstractList<E>
{
	private Node<E> head, tail;

	public MyLinkedList() {}

	public MyLinkedList(E[] objects) 
	{
		super(objects);
	}

	public E getFirst() 
	{
		if (size == 0)
			return null;
	    else 
	      return head.element;
	}

	public E getLast() 
	{
		if (size == 0)
	      return null;
	    else 
	      return tail.element;
	}

	public void addFirst(E e) 
	{
		Node<E> newNode = new Node<E>(e); 
	    newNode.next = head; 
	    head = newNode; 
	    size++; 

	    if (tail == null)
	    	tail = head;
	}

	public void addLast(E e) 
	{
		Node<E> newNode = new Node<E>(e);

	    if (tail == null) 
	      head = tail = newNode;
	    else 
	    {
	    	tail.next = newNode;
	    	tail = tail.next;
    	}

	    size++; 
	}

	public void add(int index, E e) 
	{
	    if (index == 0)
	    	addFirst(e);
	    else if (index >= size)
	    	addLast(e);
	    else 
	    {
	    	Node<E> current = head;
	    	
	    	for (int i = 1; i < index; i++) 
	    	{
	    		current = current.next;
	    	}
	      
	    	Node<E> temp = current.next;
	    	current.next = new Node<E>(e);
	    	(current.next).next = temp;
	    	size++;
    	}
	}

	public E removeFirst() 
	{
		if (size == 0) 
			return null;
	    else 
	    {
	    	Node<E> temp = head;
	    	head = head.next;
	    	size--;
	      
	    	if (head == null) 
	    	{
	    		tail = null;
	    	}
	      
	    	return temp.element;
	    }
	}

	public E removeLast() 
	{
		if (size == 0) 
			return null;
	    
	    else if (size == 1) 
	    {
	    	Node<E> temp = head;
	    	head = tail = null;
	    	size = 0;
	    	return temp.element;
	    }
	    else 
	    {
	    	Node<E> current = head;

	    	for (int i = 0; i < size - 2; i++) 
	    	{
	    		current = current.next;
	    	}

	    	Node<E> temp = tail;
	    	tail = current;
	    	tail.next = null;
	    	size--;
	    	return temp.element;
	    }
	}

	public E remove(int index) 
	{
		if (index < 0 || index >= size) 
			return null;
	    else if (index == 0)
	      return removeFirst();
	    else if (index == size - 1)
	      return removeLast();
	    else 
	    {
	    	Node<E> previous = head;

	    	for (int i = 1; i < index; i++)
	        previous = previous.next;

	    	Node<E> current = previous.next;
	    	previous.next = current.next;
	    	size--;
	    	return current.element;
	    }
	}

	@Override 
	public String toString() 
	{
		StringBuilder result = new StringBuilder("[");

	    Node<E> current = head;
	    for (int i = 0; i < size; i++) 
	    {
	    	result.append(current.element);
	    	current = current.next;
	    	if (current != null) 
	    	{
	    		result.append(", ");
	    	}
	    	else
	    		result.append("]"); 
	    }

	    return result.toString();
	  }

	public void clear() 
	{
		head = tail = null;
	}

	public boolean contains(E e) 
	{
		System.out.println("Implementation left as an exercise");
		return true;
	}

	public E get(int index) 
	{
		System.out.println("Implementation left as an exercise");
		return null;
	}

	public int indexOf(E e) 
	{
		System.out.println("Implementation left as an exercise");
		return 0;
	}

	public int lastIndexOf(E e) 
	{
		System.out.println("Implementation left as an exercise");
		return 0;
	}

	public E set(int index, E e) 
	{
		System.out.println("Implementation left as an exercise");
		return null;
	}

	private static class Node<E> 
	{
		E element;
		Node<E> next;

		public Node(E element) 
		{
			this.element = element;
	    }
	}

	@Override
	public boolean addAll(MyList<E> otherList) 
	{
		return false;
	}

	@Override
	public boolean removeAll(MyList<E> otherList) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(MyList<E> otherList) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}

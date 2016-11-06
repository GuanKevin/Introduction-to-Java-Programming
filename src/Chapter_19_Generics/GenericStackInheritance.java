package Chapter_19_Generics;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class GenericStackInheritance<E> extends ArrayList<E>
{
	public E peek() 
	{
        return get(size() - 1);
    }

    public void push(E o) 
    {
        add(o);
    }

    public E pop() 
    {
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    @Override
	public boolean isEmpty() 
    {
        return super.isEmpty();
    }

    @Override
    public String toString() 
    {
        return "stack: " + toString();
    }
}

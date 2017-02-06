package utilities;

public abstract class MyAbstractList<E> implements MyList<E> 
{
	protected int size = 0;
	protected MyAbstractList() {}
	protected MyAbstractList(E[] objects)
	{
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	
	@Override
	public void add(E e)
	{
		add(size, e);
	}
	
	@Override
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int size()
	{
		return size;
	}
	
	@Override
	public boolean remove(E e)
	{
		if (indexOf(e) >= 0)
		{
			remove(indexOf(e));
			return true;
		}
		return false;
	}
	
	@Override
	public boolean addAll(MyList<E> otherList)
	{
		boolean exist = false;
		
		for (int i = 0; i < otherList.size(); i++)
			if (!contains(otherList.get(i)))
			{
				add(otherList.get(i));
				exist = true;
			}
		return exist;
	}
	
	@Override
	public boolean removeAll(MyList<E> otherList)
	{
		boolean exist = false;
		
		for (int i = 0; i < otherList.size(); i++)
			if (!contains(otherList.get(i)))
			{
				remove(otherList.get(i));
				exist = true;
			}
		return exist;
	}
	
	public boolean retainAll(MyList<E> otherList)
	{
		boolean exist = false;
		
		for (int i = 0; i < otherList.size(); i++)
			if (!otherList.contains(get(i)))
			{
				remove(i);
				exist = true;
			}
		return exist;
	}
}

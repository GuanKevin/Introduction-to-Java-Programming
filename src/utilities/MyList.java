package utilities;

public interface MyList<E> extends Iterable<E> 
{
	public void add(E e);
	public void add(int index, E e);
	public void clear();
	public boolean contains(E e);
	public E get(int index);
	public int indexOf(E e);
	public int lastIndexOf(E e);
	public boolean isEmpty();
	public boolean remove(E e);
	public E remove(int index);
	public Object set(int index, E e);
	public int size();
	public boolean addAll(MyList<E> otherList);
	public boolean removeAll(MyList<E> otherList);
	public boolean retainAll(MyList<E> otherList);
}

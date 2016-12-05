package Utilities;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object>
{
	  public boolean isEmpty() {
		    return super.isEmpty();
		  }

		  public int getSize() {
		    return size();
		  }

		  public Object peek() {
		    return get(getSize() - 1);
		  }

		  public Object pop() {
		    return remove(getSize() - 1);
		  }

		  public Object push(Object o) {
		    add(o);
		    return o;
		  }

		  public int search(Object o) {
		    return indexOf(o);
		  }

		  public String toString() {
		    return "stack: " + toString();
		  }
}

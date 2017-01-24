package utilities;

import java.util.Comparator;

public class CompareY implements Comparator<Point> 
{
	@Override
	public int compare(Point p1, Point p2) 
	{
		if (p1.y < p2.y)
			return -1;
		else if (p1.y == p2.y) 
		{
			if (p1.x < p2.x)
				return -1;
	        else if (p1.x == p2.x)
	        	return 0;
	        else
	        	return 1;
		} 
		else
			return 1;
	}
}

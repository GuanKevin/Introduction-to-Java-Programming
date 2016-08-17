package Chapter_19_Generics;

import java.util.ArrayList;

public class ArrayListDistinctElements
{
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
	{
		ArrayList<E> nonDuplicatesList = new ArrayList<E>();
		
		for (E newList : list)
		{
			if (!nonDuplicatesList.contains(newList))
			{
				nonDuplicatesList.add(newList);
			}
		}
		
		return nonDuplicatesList;
	}
}

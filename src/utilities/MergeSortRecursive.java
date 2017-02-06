package utilities;

public class MergeSortRecursive 
{
	int[] list;
	
	public MergeSortRecursive()
	{
		
	}
	
	public MergeSortRecursive(int[] list)
	{
		this.list = list;
	}
	
	public int[] mergeSort()
	{
		MergeSort_Recursive(list, 0, list.length - 1);
		return list;
	}
	
	private void mergeSort(int[] list, int left, int mid, int right)
	{
		int temp[] = new int[list.length];
		int i, left_end, num_elements, tmp_pos;
	    
        left_end = (mid - 1);
        tmp_pos = left;
        num_elements = (right - left + 1);
    
        while ((left <= left_end) && (mid <= right))
        {
            if (list[left] <= list[mid])
                temp[tmp_pos++] = list[left++];
            else
                temp[tmp_pos++] = list[mid++];
        }
    
        while (left <= left_end)
            temp[tmp_pos++] = list[left++];
 
        while (mid <= right)
            temp[tmp_pos++] = list[mid++];
 
        for (i = 0; i < num_elements; i++)
        {
        	list[right] = temp[right];
            right--;
        }
	}
	
	private void MergeSort_Recursive(int [] numbers, int left, int right)
    {
		int mid;
    
		if (right > left)
		{
			mid = (right + left) / 2;
			MergeSort_Recursive(numbers, left, mid);
			MergeSort_Recursive(numbers, (mid + 1), right);
    
			mergeSort(numbers, left, (mid + 1), right);
		}
    }
}

package Chapter_07_Single_Dimensional_Arrays;

/**
 * Game: Eight Queens
 * The classic Eight Queens puzzle is to place eight queens on a chessboard such that no two queens can attack each other 
 * (i.e., no two queens are on the same row, same column, or same diagonal). 
 * There are many possible solutions. Write a program that displays one such solution.
 * THIS IS A TEMPORARY SOLUTION FROM THE BOOK. WILL REUPLOAD MY OWN AFTER CHAPTER 22
 * 
 * 09/22/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_22 
{
	public static void main(String[] args)
	{
		int[] queens = new int[8];
	
	    for (int i = 0; i < 8; i++)
	      queens[i] = -1;
	    queens[0] = 0;
	
	    int k = 1;
	    while (k >= 0 && k <= 7) 
	    {
	    	int j = findPosition(k, queens);
	      
	    	if (j < 0)
	    	{
		        queens[k] = -1;
		        k--;
		    }
	    	else 
	    	{
		        queens[k] = j;
		        k++;
	    	}
	    }
	
	    printResult(queens);
	  }
		
	  public static int findPosition(int k, int[] queens) 
	  {
		  int start = queens[k] + 1;
	
		  for (int j = start; j < 8; j++) 
			  if (isValid(k, j, queens))
				  return j;
		  
		  return -1;
	  }
	  //k = 1, j = 2
	  //row = 0, col = 3
	  public static boolean isValid(int k, int j, int queens[]) 
	  {
		  for (int i = 0; i < k; i++)
			  if (queens[i] == j)
				  return false;

		 for (int row = k - 1, column = j - 1; row >= 0 && column >= 0; row--, column--)
			 if (queens[row] == column)
				 return false;
	
		 for (int row = k - 1, column = j + 1; row >= 0 && column <= 7; row--, column++)
			 if (queens[row] == column)
				 return false;
	
		 return true;
	  }
	
	  public static void printResult(int[] queens) 
	  {
		  for (int i = 0; i < 8; i++)
			  System.out.println(i + ", " + queens[i]);
		  System.out.println();
	
		  for (int i = 0; i < 8; i++) 
		  {
			  for (int j = 0; j < queens[i]; j++)
				  System.out.print("| ");
			  System.out.print("|Q|");
			  
			  for (int j = queens[i] + 1; j < 8; j++)
				  System.out.print(" |");
			  System.out.println();
		  } 
	  }
}
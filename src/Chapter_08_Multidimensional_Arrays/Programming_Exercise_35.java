package Chapter_08_Multidimensional_Arrays;

/**
 * Largest block
 * Given a square matrix with the elements 0 or 1, write a program to find a maximum square submatrix whose elements are all 1s. 
 * Your program should prompt the user to enter the number of rows in the matrix. 
 * The program then displays the location of the first element in the maximum square submatrix 
 * and the number of the rows in the submatrix. 
 * Your program should implement and use the following method to find the maximum square submatrix: 
 * public static int[] findLargestBlock(int[][] m)
 * The return value is an array that consists of three values. 
 * The first two values are the row and column indices for the first element in the submatrix, 
 * and the third value is the number of the rows in the submatrix.
 * 
 * 10/29/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_35 
{
	public static void main(String[] args) 
	{
		int[][] matrix = new int[][] {
        	{1, 0, 1, 0, 1},
        	{1, 1, 1, 0, 1},
        	{1, 1, 1, 1, 1},
        	{1, 0, 1, 1, 1},
        	{1, 0, 1, 1, 1},
        };
        
        int[] blockData = findLargestBlock(matrix);
        
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d.", blockData[0], blockData[1], blockData[2]);      
    }
	
	/**
	 * The return value is an array that consists of three values. 
	 * The first two values are the row and column indices for the first element in the submatrix, 
	 * and the third value is the number of the rows in the submatrix.
	 * 
	 * @param m
	 * @return
	 */
	public static int[] findLargestBlock(int[][] m)
	{
		int[] blockData = new int[3];
        int blockSize = 0;
        
        for (int i = 0; i < m.length - 1; i++) 
        {
        	for (int j = 0; j < m[0].length - 1; j++) 
        	{
        		int oneCounter = getSubMatrix(m, i, j);

                if (checkSquare(m, i, j, oneCounter) && oneCounter > blockSize) 
                { 
                	blockSize = oneCounter;
                	blockData = new int[]{i, j, oneCounter};
                }
        	}
        }
        
        return blockData;
	}
	
	/**
	 * Return true if it is a square of 1s
	 * 
	 * @param m
	 * @param row
	 * @param column
	 * @param oneCounter
	 * @return
	 */
	public static boolean checkSquare(int[][] m, int row, int column, int oneCounter) 
	{
		if (row + oneCounter > m.length) 
        	return false; 
		
		for (int i = row; i < oneCounter + row; i++) 
            for (int j = column; j < oneCounter + column; j++) 
                if (m[i][j] == 0) 
                	return false;
		return true;
	}
	
	/**
	 * Return the number of 1's in that row that are directly after the previous 1.
	 * 
	 * @param m
	 * @param row
	 * @param column
	 * @return
	 */
	public static int getSubMatrix(int[][] m, int row, int column) 
	{
		int oneCounter = 0;

        for (int j = column; j < m[0].length; j++) 
        {
            if (m[row][j] == 1) 
            {
            	oneCounter++;
                if (j == m[0].length - 1) 
                	return oneCounter;
            }
            else
            	return oneCounter;
        }
        return oneCounter;
	}
}

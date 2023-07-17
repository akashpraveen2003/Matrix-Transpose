package matrix_Transpose;

import java.util.Scanner;

public class Matrix_Transpose {

private static void display_array(int[][] array,int row,int column) {		// Printing the array
		
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	private static void transpose_matrix(int[][] array,int[][] result,int row,int column) {
		
		int j=0;
		for(int i=0;i<row;i++)			
		{
			for(j=0;j<column;j++)
			{
				result[j][i]=array[i][j];		// storing elements in i,j to j,i
			}
			
		}	
		display_array(result,row,column);	
		
	}
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int array[][]=new int[row][column];			
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
		int result[][]=new int[column][row];		// new array to transpose n*m matrix
		transpose_matrix(array,result,row,column);
	}
}
/*
  Input
	[
     [1, 2, 3],
  	 [4, 5, 6],
  	 [7, 8, 9]
    ]
    
	Output
	[
	 [1, 4, 7],
  	 [2, 5, 8],
  	 [3, 6, 9]
    ]
    
	Input
	[
	 [1, 2],
  	 [1, 2],
  	 [1, 2]
    ]

	Output
	[
	 [1, 1, 1],
  	 [2, 2, 2] 
  	]
*/








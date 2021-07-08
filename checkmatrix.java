import java.util.Scanner;
public class diagonalmatrix
{
	public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		int row_size,col_size;
		System.out.println("enter the columns size of the matrix:");
		row_size=sc.nextInt();
		System.out.println("enter the columns size of the matrix:");
		col_size=sc.nextInt();
		int matrix[][]=new int[row_size][col_size];
		int i,j;
		System.out.println("enter the matrix element:");
		for (i=0;i<row_size;i++)
			{
			for (j=0;j<col_size;j++)
				{
				matrix[i][j]=sc.nextInt();
				}
			}
			int point=0;
			for (i=0;i<row_size;i++)
				{
				for(j+0;j<col_size;j++)
					{
					if(i!=j&&matrix[i][j]!=0)
						{
						point=1;
						break;
						}
					}
				}
				if(point==1)
				System.out.println("given matrix is not a diagonal matrix:");
				sc.close();
		}
}

Output:-
enter the row size of the matrix=3
enter the columns size of the matrix=3
enter the matrix element:
700
070
009
given matrix is a diagonal matrix
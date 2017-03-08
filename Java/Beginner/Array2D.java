import java.io.*;
import java.util.*;
import java.lang.*;
class Array2D
{
	final static int ROWS=20;
	final static int COLUMNS=20;
	public static void main(String args[])
	{
		int product[][]=new int[ROWS][COLUMNS];

		System.out.println(" MULTIPLICATION TABLE");
		System.out.println("  ");
		int i,j;
		for(i=0;i<ROWS;i++)
		{
			for(j=0;j<COLUMNS;j++)
			{
				product[i][j]=i*j;
				System.out.print("   " +product[i][j]);
			}
			System.out.println(" ");
		}
	}
}
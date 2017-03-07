/*
http://quiz.geeksforgeeks.org/bubble-sort
/*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Bubblesort
{
	void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	void printSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{	
			if(arr[i] !=0)
			{
			System.out.print("  "+arr[i]);
		}
		}
	}
	public static void main(String args[])
	{
		Bubblesort b1=new Bubblesort();
		int arr[]=new int[5];
		int number;
		System.out.println("Enter Quantity to Sort :");
		Scanner in=new Scanner(System.in);
		number=in.nextInt();
		System.out.println("Enter number to Sort :");
		for(int i=0;i<number;i++)
		{

			arr[i]=in.nextInt();
		}

		b1.bubbleSort(arr);
		System.out.println("Sorted Arrays is");
		b1.printSort(arr);
	}
}
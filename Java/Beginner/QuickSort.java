/*
Quick Sort

*/
import java.io.*;
import java.lang.*;
import java.util.*;
class QuickSort
{
	/*void sort(int arr[])
	{
		Quicksort(arr,0,arr.length-1);
	}*/
	void Quicksort(int arr[], int low, int high)
	{
		//partition
		int i=low;
		int j=high;
		int pivot=(low+high)/2;
		
		//partition
		while(low<=high)
		{
			while(arr[low]<arr[pivot])
			{
				i++;
			}
			while(arr[high]>arr[pivot])
			{
				j--;
			}
			
			//* Swap
			if (i<=j)
			{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

					i++;
					j--;

			}
		}
		//Recuresively sort lower half
		if(low<j)
		{
			Quicksort(arr,low,j);
		}
		if(i<high)
		//Recusively sort upper half
		{
			Quicksort(arr,i,high);
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
		try
		{
		QuickSort q1=new QuickSort();
		/*Scanner in=new Scanner(System.in);
		DataInputStream in= new DataInputStream(System.in);
		int number;
	
		System.out.println("Enter Quantity to Sort :");
		number=in.nextInt();
		number=Integer.parseInt(in.readLine());
		

		int array[]=new int[number];
		System.out.println("Enter number to Sort :");
		for(int n=0;n<number;n++)
		{
			array[n]=Integer.parseInt(in.readLine());
		}*/
		int arr[]={15,56,26,50,1,45};
		//q1.sort(arr);
		q1.Quicksort(arr,0,arr.length-1);
		System.out.println("Sorted Arrays is");
		q1.printSort(arr);
		}
		catch(Exception e){}
	}
}
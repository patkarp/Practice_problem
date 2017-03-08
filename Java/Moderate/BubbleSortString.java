import java.io.*;
import java.lang.*;
import java.util.*;
class BubbleSortString
{
	public static void main(String args[])
	{
		String citynames[]={"Chicago", "Paris", "NY", "Portland", "Mumbai", "SFO"};
		int cityarrsize=citynames.length;
			
			System.out.println("UNSorted \n");

		for (int i=0;i<cityarrsize ;i++ ) 
		{
			System.out.println(citynames[i]);
		}

		
		String temp=null;

		for(int i=0;i<cityarrsize;i++)
		{
			for(int j=0;j<cityarrsize-i-1;j++)
			{
				if(citynames[j].compareTo(citynames[j+1])<0)
				{
					temp=citynames[j];
					citynames[j]=citynames[j+1];
					citynames[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted \n");
		for (int i=0;i<cityarrsize ;i++ ) 
		{
			System.out.println(citynames[i]);
		}

	}
}
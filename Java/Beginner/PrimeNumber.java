/** ... Prime number
m=Number/2
number%0..m
==0 not prime else prime

*/

import java.io.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		int prime, number,m,flag=0;
		DataInputStream in = new DataInputStream(System.in);
		try
		{
			System.out.println("Enter Number:");
			number=Integer.parseInt(in.readLine());
			m=number/2;
			for(int i=2;i<m;i++)
			{
				if(number%i==0)
				{
					System.out.println(number+" Not a Prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Prime Number:" +number);
				
			}

		}
		catch(Exception e){}
	}
}
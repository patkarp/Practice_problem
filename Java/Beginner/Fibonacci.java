/*
Number 8
then 1,1,2,3,5,8

Fib
0 1 1 2 3 5 8 13 21....
n3=n1+n2
display n3
n1=n2
n2=n3
*/

import java.io.*;
import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
	int number, n1=0,n2=1,n3=0;
	System.out.println("Enter Number:");
	Scanner in= new Scanner(System.in);
	number=in.nextInt();

	for(int i=2;i<number;++i)
	{	
		while(n3<number)
		{
		n3=n1+n2;
		System.out.println(" " +n3);
		n1=n2;
		n2=n3;
	}

	}
}
}

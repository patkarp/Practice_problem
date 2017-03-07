/*
Number 5!
then 5*4*3*2*1

*/

import java.io.*;
import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
	int number, fact=1,i;
	System.out.println("Enter Number:");
	Scanner in=new Scanner(System.in);
	number=in.nextInt();

	if(number<0)
	{
	System.out.println("Number should be non negative");
	}
	else if(number==0)
	{
	System.out.println("Number is 0 so factorial is 0");
	}
	else
	{
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
	}
	System.out.println("factorial for Number"+number+"is ="+fact);
	}
}
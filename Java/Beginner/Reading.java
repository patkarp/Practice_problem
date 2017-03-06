//Reading using Data  Stream and Printing values

import java.io.*;
public class Reading
{
	public static void main(String args[])
	{
	DataInputStream in=new DataInputStream(System.in);
	int intNumber=0;
	float floatNumber=0.0f;
	try
	{
	System.out.println("Enter Integer:");
	intNumber=Integer.parseInt(in.readLine());
	System.out.println("Enter Float:");
	floatNumber=Float.valueOf(in.readLine()).floatValue();
	}
	catch (Exception e){}
	System.out.println("intNumber="+intNumber);
	System.out.println("Float Number="+floatNumber);
	}
}

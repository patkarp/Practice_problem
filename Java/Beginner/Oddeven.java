import java.io.*;

class Oddeven
{
	public static void main(String args[])
	{
		int number[]=new int[10];
		int evencount=0, oddcount=0;
		DataInputStream in=new DataInputStream(System.in);
		try
		{
		System.out.println("Enter Quantity:");
		int Quantity=Integer.parseInt(in.readLine());
		System.out.println("Quantity is : "+Quantity);
		System.out.println("Enter Numbers:");
		for(int i=0;i<Quantity;i++)
		{
			number[i]=Integer.parseInt(in.readLine());
		}
		// calculating
		for(int i=0;i<Quantity;i++)
		{
			if(number[i]%2==0)
			{
				evencount=evencount+1;
				System.out.println(number[i]+" is even");
			}
			else
			{
				oddcount=oddcount+1;
				System.out.println(number[i]+ " is Odd");
			}
		}

		}
		catch(Exception e){}
		System.out.println("Even number="+evencount+"\n Odd numbers="+oddcount);


	}
}
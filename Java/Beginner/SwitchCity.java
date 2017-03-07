import java.io.*;
class SwitchCity
{
	public static void main(String args[])
	{
		char choice;
		System.out.println("Enter City:");
		System.out.println("M ---> Madras");
		System.out.println("P ---> Portland");
		System.out.println("C ---> Chicago");
		System.out.flush();
		try
		{
			switch(choice=(char) System.in.read())
			{
				case 'M':
				case 'm':
				System.out.println("M ---> Madras");
				break;

				case 'P':
				case 'p':
				System.out.println("P ---> Portland");
				break;

				case 'C':
				case 'c':
				System.out.println("C ---> Chicago");
				break;

				default:
				System.out.println("Invalid ip");
			}
		}
		catch(Exception e)
		{
			System.out.println("IO Error" +e);
		}
	}
}


import java.io.*;
import java.lang.*;
import java.io.*;
class StringManipulation
{
	public static void main(String args[])
	{
		String s1=new String("Johny");
		String s2=new String("Tory");
		String s3=new String("MACY");
		String s4=new String("gucci");
		String u1,u2,u3;// for usage

		//lower to upper
		String lu; 
		lu=s4.toUpperCase();
		System.out.println(s4+" --toUpperCase  "+lu);

		//upper to lower
		String ul=s3.toLowerCase();
		System.out.println(s3+" --toLowerCase  "+ul);

		//replacc
		String replace=s2.replace('T','L');
		System.out.println(s2+"  replace t with l, we get  " +replace);

		//trim will remove white speces
		String trim1=s2.trim();
		System.out.println(s2+"  Triming  " +trim1);

		//lenght
		int lenght1=s1.length();
		System.out.println(s1+" lenght is " +lenght1);

		//Compare
		boolean equal=s1.equals(s2);
		System.out.println(s1+" = " +s2+" is "+equal);

		//Character at
		char charAT= s1.charAt(3);
		System.out.println(s1+" Character at 3 is " +charAT);

		//Compare  s1<s2 negative, s1>s2 is positive, s1=s2 is zero
		int compare=s1.compareTo(s2);
		if(compare<0)
		{
			System.out.println(s1+" is less than "+s2+" by " +compare);
		}
		else if(compare>0)
		{
			System.out.println(s1+" is more than "+s2+ " by " +compare);
		}
		else
		{
			System.out.println(s1+" is equal "+s2 );
		}
		
		//concat s1 s2
		String concatresult=s2.concat(s3);
		System.out.println(s2+" concat "+s3+ " is " +concatresult);

		//Substring in n
		String subn=s2.substring(2);
		System.out.println(s2+" Substring is 2 then " +subn);

		//Substring in n to m
		String subnm=s2.substring(1,3);
		System.out.println(s2+" Substring is 1 to 3 then " +subnm);

		//value to string
		int n=6;
		String valuetostring=String.valueOf(n);
		System.out.println(n+" in words is  " +valuetostring);
	}
}
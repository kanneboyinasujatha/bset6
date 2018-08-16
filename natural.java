
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int s=0;
		for(int i=1;i<=k;i++)
		{
			s=s+i;
		}
		System.out.println(s);
	}
}

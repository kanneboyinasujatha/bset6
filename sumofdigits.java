/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("enter a number");
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("sum of digits:"+sum);
	}
}

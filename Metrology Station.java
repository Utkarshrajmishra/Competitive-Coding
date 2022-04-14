/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner x=new Scanner(System.in);
		// your code goes here
		int a[]=new int[7];
		int b[]=new int[7];
		for(int i=0;i<7;i++)
		{
		    a[i]=x.nextInt();
		}
		for(int i=0;i<7;i++)
		{
		    b[i]=x.nextInt();
		}
		int sum=0;
		for(int i=0;i<7;i++)
		{
		    sum+=Math.abs(a[i]-b[i]);
		}
		System.out.println(sum);
	}
}

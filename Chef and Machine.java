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
		int t=x.nextInt();
		while(t-->0)
		{
		   int n=x.nextInt();
		   long sum=1;
		   for(int i=1;i<=n;i++)
		   {
		       sum*=i;
		   }
		   System.out.println(sum);
		    
		}
	}
}

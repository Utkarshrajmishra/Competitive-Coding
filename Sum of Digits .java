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
		int t=x.nextInt();
	  while(t-->0)
		{
		   int a=x.nextInt();
		   int rev=0,sum=0;
		   while(a>0){
		       rev=a%10;
		       sum+=rev;
		       a/=10;
		   }
		   System.out.println(sum);
		}
	}
}

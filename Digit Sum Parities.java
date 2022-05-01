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
		    int a=x.nextInt();
		    int k=a+1;
		    int s=sum(a)%2;
		    boolean flag=true;
		    while(flag)
		    {
		        int e=sum(k)%2;
		        if(e!=s)
		        {
		           System.out.println(k);
		           flag=false;
		        }
		        k++;
		    }
		    
		}
	}
		public static int sum(int n)
		{
		    int sum=0;
		    while(n>0)
		    {
		        sum+=(n%10);
		        n=n/10;
		    }
		    return sum;
		}
	
}

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
		    int a=x.nextInt();
		    int k=n/(a*a);
		    if(k<=18)
		    {
		        System.out.println("1");
		    }
		    for(int i=19;i<=24;i++)
		    {
		        if(i==k)
		        {
		            System.out.println("2");
		        }
		    }
		    for(int i=25;i<=29;i++)
		    {
		        if(i==k){
		        System.out.println("3");
		    }}
		     if(k>=30)
		     {
		         System.out.println("4");
		 }    }
	}
}

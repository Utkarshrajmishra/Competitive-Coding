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
		int t;
		Scanner x=new Scanner(System.in);
		t=x.nextInt();
		while(t-->0)
		{
		    int m=x.nextInt();
		    int n=x.nextInt();
		    int k=x.nextInt();
		    if((n*k)>=m)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
		
	}
}

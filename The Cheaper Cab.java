/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x=new Scanner(System.in);
		// your code goes here
		int t;
		t=x.nextInt();
		while(t-->0)
		{
		    int a=x.nextInt();
		    int b=x.nextInt();
		    if(a>b)
		    {
		        System.out.println("SECOND");
		    }
		    else if(a<b)
		    {
		        System.out.println("FIRST");
		    }
		    else{
		        System.out.println("ANY");
		    }
		}
		
	}
}

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
		    if(a<1000)
		    {
		        System.out.println(100);
		    }
		    else
		    {
		        System.out.println(a/10);
		    }
		}
	}
}

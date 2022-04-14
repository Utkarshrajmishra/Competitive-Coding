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
		    int sum=0;
		    for(int i=1;i<=a;i++)
		    {
		        sum+=Math.pow(i,2);
		    }
		    for(int j=a-1;j>=1;j--)
		    {
		        sum+=Math.pow(j,2);
		    }
		    System.out.println(sum);
		}  
	}
}

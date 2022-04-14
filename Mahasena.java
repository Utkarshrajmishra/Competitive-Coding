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
		Scanner x=new  Scanner(System.in);
		int t=x.nextInt();
		int a[]=new int[t];
		for(int i=0;i<t;i++)
		{
		    a[i]=x.nextInt();
		}
		int even=0,odd=0;
		for(int j=0;j<t;j++)
		{
		    if(a[j]%2==0){
		        even++;
		    }
		    else{
		        odd++;
		    }
		}
		if(even>odd)
		{
		    System.out.println("READY FOR BATTLE");
		}
		else{
		    System.out.println("NOT READY");
		}
	}
}

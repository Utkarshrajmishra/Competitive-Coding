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
		    double arr[]=new double[4];
		    for(int i=0;i<4;i++)
		    {
		        arr[i]=x.nextDouble();
		    }
		    double sum=100/(arr[0]*arr[1]*arr[2]*arr[3]);
		    double time = Math.round(sum*100.0)/100.0;
		    if(time<9.58)
		    System.out.println("YES");
		    else{
		        System.out.println("NO");
		    }
		}
	}
}

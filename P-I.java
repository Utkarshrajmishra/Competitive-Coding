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
		while(t-->0){
		    int a=x.nextInt();
		    int k=1;
		for(int i=1;i<=a;i++)
		{   
	       for(int j=1;j<=a;j++)	    
	       {
	          if(j%2==0)
	          {
	              System.out.print("0");
	          }
	          else{
	              System.out.print("1");
	          }
	       }
		System.out.println("");;
		}	
	}   
	}
}

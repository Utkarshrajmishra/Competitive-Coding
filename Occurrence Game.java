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
	      int p=x.nextInt();
	      int n=x.nextInt();
	      int a[]=new int[n];
	      int counter=0; 
	      int k[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	          a[i]=x.nextInt();
	          if(p==a[i])
	          {
	              k[counter]=i;
	              counter++;
	          }
	      }
	      if(counter>1)
	      {
	          for(int j=0;j<counter;j++)
	          {
	              System.out.print(k[j]+1+" ");
	          }
	          System.out.println("");
	      }
	      else{
	          System.out.println("-1");
	      }
	       
	   }
	}
}

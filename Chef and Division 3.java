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
		int t=x.nextInt(); int l=0;
	         while(t-->0)
	         {
	         int n=x.nextInt();
	         int k=x.nextInt();
	         int d=x.nextInt();
	         int a[]=new int[n];
	         for(int j=0;j<n;j++){
	             a[j]=x.nextInt();
	         }
	         int sum=0;
	         for(int i:a){
	             sum+=i;
	         }
	         int day=sum/k;
	         if(day<d)
	         {
	             System.out.println(day);
	         }
	         else{
	             System.out.println(d);
	         }
	         
	     }
	}
}

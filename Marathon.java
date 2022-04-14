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
	       int t=x.nextInt();
	       while(t-->0)
	       {
	           int d=x.nextInt();
	           int D=x.nextInt();
	           int arr[]=new int [3];
	       for(int i=0;i<3;i++)
	       {
	           arr[i]=x.nextInt();
	       }
	     
        	     if (D*d<10)
            System.out.println("0");
                else if (D*d>=10&&D*d<21)
            System.out.println(arr[0]);
            else if (D*d>=21&&D*d<42)
        System.out.println(arr[1]);
            else if(D*d>=42)
                System.out.println(arr[2]);}
	       }
		
	
}

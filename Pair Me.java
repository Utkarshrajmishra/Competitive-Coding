/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner x=new Scanner(System.in);
	    int t=x.nextInt();
	    while(t-->0)
	    {
	        int a=x.nextInt();
	        int b=x.nextInt();
	        int c=x.nextInt();
	        if(a+b==c)
	        {
	            System.out.println("YES");
	        }
	        else if(b+c==a)
	        {
	            System.out.println("YES");
	        }
	        else if(c+a==b)
	        {
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
		
	}
}
